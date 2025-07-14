public class SumRecursive {

    // Recursive method to calculate sum of first n natural numbers
    static int sum(int n) {
        if (n == 0)
            return 0;
        return n + sum(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        int result = sum(n);
        System.out.println("Sum of first " + n + " natural numbers is: " + result);
    }
}
