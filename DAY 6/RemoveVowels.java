/*Mr. Venkat works in a Library that has a name termed Harvey using the programming lang 
help him to remove all vowels present in the string and produce the final string 
*/
public class RemoveVowels {
    public static void main(String[] args) {
        String name = "Harvey";
        StringBuilder result = new StringBuilder();

        for (char ch : name.toCharArray()) {
            if (!"aeiouAEIOU".contains(String.valueOf(ch))) {
                result.append(ch);
            }
        }

        System.out.println("String without vowels: " + result);
    }
}
