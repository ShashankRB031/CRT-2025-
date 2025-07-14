public class Recursion {
    static void fun(int n) {
        if (n >= 0) {
            System.out.print("<-- " + n + " -->");  // Before recursive call
            fun(n - 1);  
            System.out.println();                            // Recursive call
            System.out.print("-- " + n + " --");   // After recursive call
        }
    }

    public static void main(String[] args) {
        fun(6);
    }
}
