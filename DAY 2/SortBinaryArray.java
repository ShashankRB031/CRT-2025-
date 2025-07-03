public class SortBinaryArray {
    public static void main(String[] args) {
        int[] A = {1, 0, 0, 1, 1, 1, 0, 1, 1, 0};

        // Count number of 0s
        int zeroCount = 0;
        for (int num : A) {
            if (num == 0) zeroCount++;
        }

        // Fill 0s first
        for (int i = 0; i < zeroCount; i++) {
            A[i] = 0;
        }

        // Fill 1s for the rest
        for (int i = zeroCount; i < A.length; i++) {
            A[i] = 1;
        }

        // Print the sorted array
        System.out.print("Sorted Output: ");
        for (int num : A) {
            System.out.print(num + " ");
        }
    }
}
