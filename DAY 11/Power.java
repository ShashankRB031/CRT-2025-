public class Power {
    
    // Recursive method to calculate a^b
    static int myPow(int a, int b) {
        if (b == 0)
            return 1;
        else
            return a * myPow(a, b - 1);
    }

    public static void main(String[] args) {
        int base = 5;
        int exponent = 2;

        int result = myPow(base, exponent);
        System.out.println(base + " raised to the power " + exponent + " is " + result);
    }
}
