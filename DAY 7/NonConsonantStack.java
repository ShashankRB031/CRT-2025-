/*Mr. Suresh is interested in lexicographic applications during content creation. He wants to perform stack operations specifically on non-consonant characters (such as vowels, digits, or symbols). Help him understand how to use a stack in Java to perform the following operations: */
import java.util.Scanner;
import java.util.Stack;

public class NonConsonantStack {

    // Check if a character is a consonant
    public static boolean isConsonant(char ch) {
        ch = Character.toLowerCase(ch);
        return Character.isLetter(ch) && "aeiou".indexOf(ch) == -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();

        // Get input from user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Push only non-consonants onto the stack
        for (char ch : input.toCharArray()) {
            if (!isConsonant(ch)) {
                stack.push(ch);
                System.out.println("Pushed: " + ch);
            }
        }

        // Peek at the top element
        if (!stack.isEmpty()) {
            System.out.println("Top element (peek): " + stack.peek());
        } else {
            System.out.println("Stack is empty.");
        }

        // Pop all elements
        System.out.println("\nPopping all elements:");
        while (!stack.isEmpty()) {
            System.out.println("Popped: " + stack.pop());
        }

        scanner.close();
    }
}
