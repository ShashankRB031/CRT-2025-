import java.util.Scanner;

public class FoodDeliverUsingSwitchCase {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your order status number:");
        System.out.println("1 - Delivered");
        System.out.println("2 - On The Way");
        System.out.println("3 - Order Placed");
        System.out.print("Enter choice: ");
        
        int status = sc.nextInt();  

        switch (status) {
            case 1:
                System.out.println("Your order is Delivered!");
                break;
            case 2:
                System.out.println("Your food is On the way...");
                break;
            case 3:
                System.out.println("Your food order is Placed!");
                break;
            default:
                System.out.println("Invalid status. Welcome Back!");
        }

        sc.close(); 
    }
}
