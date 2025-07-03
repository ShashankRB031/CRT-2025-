import java.util.Scanner;

public class NestedSwitchExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Food App");
        System.out.println("Choose a category:");
        System.out.println("1. Veg");
        System.out.println("2. Non-Veg");
        System.out.print("Enter category number: ");
        int category = sc.nextInt();

        switch (category) {
            case 1:
                System.out.println("You selected Veg Menu:");
                System.out.println("  1. Paneer Butter Masala");
                System.out.println("  2. Veg Biryani");
                System.out.print("Choose a dish: ");
                int vegChoice = sc.nextInt();

                switch (vegChoice) {
                    case 1:
                        System.out.println("You ordered Paneer Butter Masala.");
                        break;
                    case 2:
                        System.out.println("You ordered Veg Biryani.");
                        break;
                    default:
                        System.out.println("Invalid Veg dish selected.");
                }
                break;

            case 2:
                System.out.println("You selected Non-Veg Menu:");
                System.out.println("  1. Chicken Curry");
                System.out.println("  2. Mutton Biryani");
                System.out.print("Choose a dish: ");
                int nonVegChoice = sc.nextInt();

                switch (nonVegChoice) {
                    case 1:
                        System.out.println("You ordered Chicken Curry.");
                        break;
                    case 2:
                        System.out.println("You ordered Mutton Biryani.");
                        break;
                    default:
                        System.out.println("Invalid Non-Veg dish selected.");
                }
                break;

            default:
                System.out.println("Invalid category selected.");
        }

        sc.close();
    }
}
