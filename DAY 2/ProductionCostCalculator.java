/* 
Prod	FC	VC	Salse	Prod Cost
A	5000	3000	10000	?
B	5000	7000	8000	?

 */

public class ProductionCostCalculator {
    public static void main(String[] args) {
        // Product A
        int fcA = 5000;
        int vcA = 3000;
        int prodCostA = fcA + vcA;

        // Product B
        int fcB = 5000;
        int vcB = 7000;
        int prodCostB = fcB + vcB;

        System.out.println("Product A -> Production Cost: " + prodCostA);
        System.out.println("Product B -> Production Cost: " + prodCostB);
    }
}
