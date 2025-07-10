import java.util.*;

public class SnakeAndLadderQueue {

    static Map<Integer, Integer> snakesAndLadders = new HashMap<>();
    static final int WIN_POSITION = 100;

    static {
        // Define snakes
        snakesAndLadders.put(99, 21);
        snakesAndLadders.put(92, 45);
        snakesAndLadders.put(70, 55);
        snakesAndLadders.put(47, 19);

        // Define ladders
        snakesAndLadders.put(3, 22);
        snakesAndLadders.put(5, 8);
        snakesAndLadders.put(11, 26);
        snakesAndLadders.put(20, 29);
    }

    static class Player {
        String name;
        int position;

        Player(String name) {
            this.name = name;
            this.position = 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Player> playerQueue = new LinkedList<>();

        // Get player names
        System.out.print("Enter Player 1 name: ");
        playerQueue.add(new Player(sc.nextLine()));

        System.out.print("Enter Player 2 name: ");
        playerQueue.add(new Player(sc.nextLine()));

        Random dice = new Random();

        while (true) {
            Player current = playerQueue.poll();
            System.out.println("\n" + current.name + "'s turn. Press Enter to roll the dice...");
            sc.nextLine();

            int roll = dice.nextInt(6) + 1;
            System.out.println(current.name + " rolled a " + roll);

            int newPos = current.position + roll;

            if (newPos > WIN_POSITION) {
                System.out.println("Can't move. Need exact roll to reach 100.");
            } else {
                if (snakesAndLadders.containsKey(newPos)) {
                    int old = newPos;
                    newPos = snakesAndLadders.get(newPos);
                    if (old < newPos)
                        System.out.println("Yay! Ladder from " + old + " to " + newPos);
                    else
                        System.out.println("Oops! Snake from " + old + " to " + newPos);
                }
                current.position = newPos;
                System.out.println(current.name + " moved to position " + current.position);
            }

            if (current.position == WIN_POSITION) {
                System.out.println("\n🎉 " + current.name + " wins the game!");
                break;
            }

            playerQueue.add(current); // Next turn
        }

        sc.close();
    }
}
