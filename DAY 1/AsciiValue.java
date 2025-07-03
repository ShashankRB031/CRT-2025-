import java.util.Scanner;

public class AsciiValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter one character: ");
        char ch = sc.next().charAt(0);

        int ascii = (int) ch; // convert char to int to get ASCII
        System.out.println("The ASCII value of '" + ch + "' is: " + ascii);

        sc.close();
    }
}
