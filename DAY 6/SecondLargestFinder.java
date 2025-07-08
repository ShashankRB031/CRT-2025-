/*Kalpana is an Astronaut who measures atmospheric pressures and records in arrange such as 
V = 21, 8, 7, 4, 11 kindly help to determine the second largest value in the given range.
*/
public class SecondLargestFinder {
    public static void main(String[] args) {
        int[] V = {21, 8, 7, 4, 11};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : V) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        System.out.println("Second Largest: " + secondLargest);
    }
}
