import java.util.Scanner;

public class BinarySearchWithPivot {

    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            // Pivot (Middle)
            int pivot = (low + high) / 2;

            if (arr[pivot] == target) {
                return pivot; // Element found at pivot index
            } else if (arr[pivot] < target) {
                low = pivot + 1; // Search right side
            } else {
                high = pivot - 1; // Search left side
            }
        }

        return -1; // Element not found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " sorted elements:");

        // Input sorted array
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input target
        System.out.print("Enter element to search: ");
        int target = sc.nextInt();

        // Search using binary search
        int result = binarySearch(arr, target);

        if (result != -1)
            System.out.println("Element found at index: " + result);
        else
            System.out.println("Element not found.");

        sc.close();
    }
}
