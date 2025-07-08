/*Preeti is a free lancer who works in a publishing company, she goes through a content in 
which she comes across two strings such as synonymic cluster implement a code to find the 
length of  a string without using a built-in function
*/
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
