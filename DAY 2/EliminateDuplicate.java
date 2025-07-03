public class EliminateDuplicate {

    // Function to remove duplicates using only loops
    public static int[] removeDuplicates(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;

            // Check if arr[i] already exists in temp
            for (int j = 0; j < count; j++) {
                if (arr[i] == temp[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            // If not duplicate, add to temp array
            if (!isDuplicate) {
                temp[count++] = arr[i];
            }
        }

        // Create result array with exact size
        int[] result = new int[count];
        for (int i = 0; i < count; i++) {
            result[i] = temp[i];
        }

        return result;
    }

    public static void printArray(String label, int[] arr) {
        System.out.print(label);
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] a = {8, 4, 3, 5, 7, 4};

        printArray("Before removing duplicates: ", a);

        int[] uniqueArray = removeDuplicates(a);

        printArray("After removing duplicates:  ", uniqueArray);
    }
}
