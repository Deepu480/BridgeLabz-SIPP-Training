package week05_day05_PracticesStreamAPI;

import java.util.*;
import java.util.stream.*;

class Movie {
    String title;
    double rating;
    int releaseYear;

    Movie(String title, double rating, int releaseYear) {
        this.title = title;
        this.rating = rating;
        this.releaseYear = releaseYear;
    }

    @Override
    public String toString() {
        return title + " (" + releaseYear + ") - Rating: " + rating;
    }
}

public class TopMovies {
    public static void main(String[] args) {
        List<Movie> movies = Arrays.asList(
            new Movie("Movie A", 8.5, 2023),
            new Movie("Movie B", 9.1, 2024),
            new Movie("Movie C", 7.9, 2022),
            new Movie("Movie D", 8.7, 2024),
            new Movie("Movie E", 9.0, 2023),
            new Movie("Movie F", 8.8, 2024),
            new Movie("Movie G", 9.2, 2023)
        );

        List<Movie> top5 = movies.stream()
            .filter(m -> m.releaseYear >= 2022) 
            .sorted(Comparator.comparingDouble((Movie m) -> m.rating).reversed()
            .thenComparingInt(m -> -m.releaseYear))
            .limit(5)
            .collect(Collectors.toList());

        System.out.println("Top 5 Trending Movies:");
        top5.forEach(System.out::println);
    }
}
