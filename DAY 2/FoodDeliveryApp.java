import java.util.Scanner;

public class FoodDeliveryApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to QuickEats Food Delivery!");
        System.out.println("Select an option:");
        System.out.println("1. Track Order");
        System.out.println("2. Cancel Order");
        System.out.println("3. Rate Order");
        System.out.println("4. Contact Support");
        System.out.println("5. Exit");

        System.out.print("Enter your choice (1-5): ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Your order is on the way. Estimated delivery: 30 mins.");
                break;
            case 2:
                System.out.println("Your order has been cancelled successfully.");
                break;
            case 3:
                System.out.println("Thank you! Please rate your experience from 1 to 5 stars.");
                break;
            case 4:
                System.out.println("Connecting you to customer support...");
                break;
            case 5:
                System.out.println("Thank you for using QuickEats. Goodbye!");
                break;
            default:
                System.out.println("Invalid choice. Please select a valid option (1-5).");
        }

        sc.close();
    }
}
