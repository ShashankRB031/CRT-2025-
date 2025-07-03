/*1] Mr. B and Mr. U are friends who live on opposite lanes, with door numbers 10 and 20 respectively.
On a rainy day, they accidentally missed their lanes—Mr. U reached Mr. B’s house (door 10), a
nd Mr. B reached Mr. U’s house (door 20).
Help them find their correct homes */

public class SwapWithoutTemp {

    public static void reachCorrectHome(int b, int u) {
        System.out.println("Before correction:");
        System.out.println("Mr. B is at: " + b);
        System.out.println("Mr. U is at: " + u);

        // Swapping using arithmetic
        b = b + u;
        u = b - u;
        b = b - u;

        System.out.println("After correction:");
        System.out.println("Mr. B is at: " + b);
        System.out.println("Mr. U is at: " + u);
    }

    public static void main(String[] args) {
        int b_door = 20; // Mr. B mistakenly at U's door
        int u_door = 10; // Mr. U mistakenly at B's door

        reachCorrectHome(b_door, u_door);
    }
}
