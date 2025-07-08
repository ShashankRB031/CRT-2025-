public class StringLengthManual {
    public static void main(String[] args) {
        String input = "synonymic";
        int length = 0;

        try {
            while (true) {
                input.charAt(length); // will throw exception at end
                length++;
            }
        } catch (IndexOutOfBoundsException e) {
            // reached the end of the string
        }

        System.out.println("Length of the string: " + length);
    }
}
