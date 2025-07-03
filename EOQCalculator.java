import java.util.Scanner;

public class EOQCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Annual Demand (units): ");
        double demand = sc.nextDouble();

        System.out.print("Enter Ordering Cost per Order (₹): ");
        double orderingCost = sc.nextDouble();

        System.out.print("Enter Holding Cost per Unit per Year (₹): ");
        double holdingCost = sc.nextDouble();

        double eoq = Math.sqrt((2 * demand * orderingCost) / holdingCost);
        System.out.printf("Economic Order Quantity (EOQ) = %.2f units\n", eoq);

        sc.close();
    }
}
