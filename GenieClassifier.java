import java.util.Scanner;

public class GenieClassifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Hi! I'm Genie. Enter a number: ");
        int num = sc.nextInt();

        if (num < 0) {
            System.out.println("This is a Negative value.");
        } else if (num == 0) {
            System.out.println("This is a Neutral value.");
        } else {
            System.out.println("This is a Non-Negative (Positive) value.");
        }

        sc.close();
    }
}
