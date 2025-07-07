/*Mr. madav encodes some information over the network he wants to classify whether given information is a
 character, or a special character or case sensitive character or a numeric data generate a code to help madav */
 import java.util.Scanner;

public class CharacterClassifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input
        System.out.print("Enter a single character: ");
        char ch = scanner.next().charAt(0);

        // Check if it's a letter
        if (Character.isLetter(ch)) {
            System.out.println("It is an Alphabet Character.");

            // Check case sensitivity
            if (Character.isUpperCase(ch)) {
                System.out.println("It is an Uppercase Letter.");
            } else {
                System.out.println("It is a Lowercase Letter.");
            }

        } else if (Character.isDigit(ch)) {
            System.out.println("It is a Numeric Digit.");

        } else {
            System.out.println("It is a Special Character.");
        }

        scanner.close();
    }
}
