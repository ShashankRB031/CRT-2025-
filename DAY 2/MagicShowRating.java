import java.util.*;

public class MagicShowRating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for 3 shows
        int people1 = 4000;
        int rating1 = 9;

        int people2 = 500;
        int rating2 = 9;

        int people3 = 100;
        int rating3 = 9;

        // Weighted average
        int totalPeople = people1 + people2 + people3;
        double totalRating = (people1 * rating1) + (people2 * rating2) + (people3 * rating3);

        double averageRating = totalRating / totalPeople;

        // Output
        System.out.printf("%.1f\n", averageRating);
        if (averageRating == 9.0) {
            System.out.println("magic show");
        }
    }
}
