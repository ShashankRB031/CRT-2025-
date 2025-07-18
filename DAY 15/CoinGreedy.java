import java.util.*;

public class CoinGreedy {
    public static void main(String[] args) {
        int[] coins = {500, 200, 100, 50, 20, 10, 5, 2, 1}; // sorted descending
        int amount = 182;

        List<Integer> result = new ArrayList<>();
        for (int coin : coins) {
            while (amount >= coin) {
                amount -= coin;
                result.add(coin);
            }
        }

        System.out.println("Coins used: " + result);
        System.out.println("Minimum number of coins: " + result.size());
    }
}
