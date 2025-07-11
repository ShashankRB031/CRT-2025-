/* Design and develop a maze game application where each entry point into the maze can have multiple input paths but restricted exit paths. Store each entry point along with its number of exits and use a sorting algorithm (e.g., Insertion or Selection Sort) to sort the entries based on the number of exits. Highlight the most and least restricted entries in the sorted output. */


public class MazeGame {
    public static void main(String[] args) {
        // Maze entries: [entry name, number of exits]
        String[][] mazeEntries = {
            {"Entry A", "2"},  // highly restricted
            {"Entry B", "5"},  // less restricted
            {"Entry C", "1"},  // very restricted
            {"Entry D", "4"},
            {"Entry E", "3"}
        };

        // Sort entries by number of exits (descending = less restricted first)
        for (int i = 1; i < mazeEntries.length; i++) {
            String[] current = mazeEntries[i];
            int j = i - 1;

            while (j >= 0 && Integer.parseInt(mazeEntries[j][1]) < Integer.parseInt(current[1])) {
                mazeEntries[j + 1] = mazeEntries[j];
                j--;
            }
            mazeEntries[j + 1] = current;
        }

        // Display the sorted maze entries
        System.out.println("🧩 Maze Entries Sorted by Number of Exits (High ➜ Low):");
        for (String[] entry : mazeEntries) {
            System.out.println(entry[0] + " - Exits: " + entry[1]);
        }

        // Most and least restricted
        System.out.println("\n🚪 Most Flexible Entry: " + mazeEntries[0][0] + " (" + mazeEntries[0][1] + " exits)");
        System.out.println("🚧 Most Restricted Entry: " + mazeEntries[mazeEntries.length - 1][0] + " (" + mazeEntries[mazeEntries.length - 1][1] + " exit)");
    }
}
