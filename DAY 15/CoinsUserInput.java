import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CoinsUserInput {
    public static void main(String[] args){
        int[] coins = {500, 200, 100, 50, 20, 10, 5, 2, 1}; // descending order
        System.out.println("Enter the Coin sum:");
        
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();

        List<Integer> result = new ArrayList<>();
        for(int coin : coins){
            while(amount >= coin){
                amount -= coin;
                result.add(coin);
            }
        }

        System.out.println("Coins used: " + result);
        System.out.println("Minimum number of coins used: " + result.size());
    }
}
