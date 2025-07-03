public class ProductValueCalculator {
    public static void main(String[] args) {
        // Product A
        double rateA = 5;
        double valueA = 180;
        double quantityA = valueA / rateA;

        // Product B
        double quantityB = 200;
        double valueB = 1600;
        double rateB = valueB / quantityB;

        // Product C
        double quantityC = 75;
        double rateC = 3;
        double valueC = quantityC * rateC;

        System.out.println("Product A -> Quantity: " + quantityA);
        System.out.println("Product B -> Rate: " + rateB);
        System.out.println("Product C -> Value: " + valueC);
    }
}
