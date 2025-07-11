public class  MovieRatings2D {
    public static void main(String[] args) {
        // movies[row][0] = title, movies[row][1] = rating
        String[][] movies = {
            {"Inception", "8.8"},
            {"The Matrix", "8.7"},
            {"Interstellar", "8.6"},
            {"The Dark Knight", "9.0"},
            {"Tenet", "7.5"}
        };

        // Selection Sort by rating (descending)
        for (int i = 0; i < movies.length - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < movies.length; j++) {
                if (Double.parseDouble(movies[j][1]) > Double.parseDouble(movies[maxIdx][1])) {
                    maxIdx = j;
                }
            }
            // Swap rows
            String[] temp = movies[i];
            movies[i] = movies[maxIdx];
            movies[maxIdx] = temp;
        }

        // Print sorted movies
        System.out.println("Movies sorted by rating:");
        for (int i = 0; i < movies.length; i++) {
            System.out.println(movies[i][0] + " - ⭐ " + movies[i][1]);
        }
    }
}
