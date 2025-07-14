/*Design and implement a movie rating application that stores movie titles along with user ratings. Using the Selection Sort algorithm, sort the movies based on their user ratings in descending order and highlight the rating associated with each movie title. */
public class KannadaMovieRatings {
    public static void main(String[] args) {
        // Kannada movies with ratings
        String[][] movies = {
            {"KGF Chapter 1", "8.2"},
            {"KGF Chapter 2", "8.3"},
            {"Lucia", "8.3"},
            {"Ugramm", "8.1"},
            {"Kantara", "8.4"}
        };

        // Selection Sort by rating (descending)
        for (int i = 0; i < movies.length - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < movies.length; j++) {
                if (Double.parseDouble(movies[j][1]) > Double.parseDouble(movies[maxIdx][1])) {
                    maxIdx = j;
                }
            }
            // Swapx
            String[] temp = movies[i];
            movies[i] = movies[maxIdx];
            movies[maxIdx] = temp;
        }

        // Print sorted Kannada movies
        System.out.println("🎬 Top Kannada Movies (Sorted by Rating):");
        for (String[] movie : movies) {
            System.out.println(movie[0] + " - ⭐ " + movie[1]);
        }
    }
}
