/* Mr. Yashshwi has a number 6 with them as a unique number he wants to make it as 720 with the stack application generate the required output */
import java.util.Stack;

public class FactorialWithStack {
    public static void main(String[] args) {
        int num = 6;
        Stack<Integer> stack = new Stack<>();

        // Push numbers from 6 down to 1 onto the stack
        for (int i = num; i >= 1; i--) {
            stack.push(i);
        }

        int result = 1;

        // Pop elements and multiply to get factorial
        while (!stack.isEmpty()) {
            result *= stack.pop();
        }

        System.out.println("The factorial of " + num + " is: " + result);  // Output: 720
    }
}
