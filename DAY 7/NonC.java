import java.util.Scanner;
import java.util.Stack;

public class NonC {

    // Check if a character is a consonant
    public static boolean isConsonant(char ch) {
        ch = Character.toLowerCase(ch);
        return Character.isLetter(ch) && "aeiou".indexOf(ch) == -1;
    }

    // Convert character to alternating case based on index
    public static char toAlternatingCase(char ch, int index) {
        if (index % 2 == 0) {
            return Character.toUpperCase(ch);
        } else {
            return Character.toLowerCase(ch);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        int altIndex = 0; // for tracking alternating case

        for (char ch : input.toCharArray()) {
            if (!isConsonant(ch)) {
                char modified = toAlternatingCase(ch, altIndex);
                stack.push(modified);
                System.out.println("Pushed: " + modified);
                altIndex++;
            }
        }

        // Peek
        if (!stack.isEmpty()) {
            System.out.println("Top element (peek): " + stack.peek());
        } else {
            System.out.println("Stack is empty.");
        }

        // Pop
        System.out.println("\nPopping all elements:");
        while (!stack.isEmpty()) {
            System.out.println("Popped: " + stack.pop());
        }

        scanner.close();
    }
}
