import java.util.Scanner;

public class JacknadJillAscii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter one character: ");
        char ch = sc.next().charAt(0); // Get the first character
        ch = Character.toLowerCase(ch); // Convert to lowercase for checking

        // Check and print whether Jack or Jill will take the character
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println("Jill (Non-Consonant)");
            } else {
                System.out.println("Jack (Consonant)");
            }
        } else {
            System.out.println("Non-alphabet character");
        }

        // Print ASCII value
        int ascii = (int) ch;
        System.out.println("ASCII value of '" + ch + "' is: " + ascii);

        sc.close();
    }
}
