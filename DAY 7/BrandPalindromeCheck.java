import java.util.Scanner;

public class BrandPalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the cosmetic brand name: ");
        String brand = sc.nextLine();

        // Normalize the brand name: lowercase and remove spaces
        String cleaned = brand.toLowerCase().replaceAll("\\s+", "");
        String reversed = new StringBuilder(cleaned).reverse().toString();

        if (cleaned.equals(reversed)) {
            System.out.println("✅ '" + brand + "' is a Palindromic Brand.");
        } else {
            System.out.println("❌ '" + brand + "' doesn’t fit under palindromic feature.");
            System.out.println("💡 Suggested palindromic brand: 'Nayan'");
        }

        sc.close();
    }
}
