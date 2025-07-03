import java.util.Scanner;

public class JacknadJill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter one character: ");
        char ch = sc.next().charAt(0);
        ch = Character.toLowerCase(ch);

        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'  ) {
                System.out.println("Jill (Non-Consonant)");
            } else {
                System.out.println("Jack (Consonant)");
            }
        } 

        sc.close();
    }
}
