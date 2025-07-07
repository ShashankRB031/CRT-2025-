/*Mr. Amit is working as group leader in publicising company and wants to implement an 
anagram using strings helping to identify the different anagrams in a given string */
import java.util.*;

public class AnagramGrouper {
    public static void main(String[] args) {
        // Sample list of words
        String[] words = {"listen", "silent", "enlist", "google", "gooegl", "rat", "tar", "art"};

        // Call function to group anagrams
        List<List<String>> groupedAnagrams = groupAnagrams(words);

        // Print the result
        System.out.println("Grouped Anagrams:");
        for (List<String> group : groupedAnagrams) {
            System.out.println(group);
        }
    }

    public static List<List<String>> groupAnagrams(String[] words) {
        // Map to hold sorted string as key and list of anagrams as value
        Map<String, List<String>> map = new HashMap<>();

        for (String word : words) {
            // Convert word to char array, sort it, and convert back to string
            char[] chars = word.toCharArray()
            ;
            Arrays.sort(chars);
            String sorted = new String(chars);

            // Group by sorted key
            map.computeIfAbsent(sorted, k -> new ArrayList<>()).add(word);
        }

        // Return all grouped values
        return new ArrayList<>(map.values());
    }
}
