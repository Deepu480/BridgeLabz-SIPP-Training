package week06_day03_JavaCollectors;

import java.util.*;
import java.util.stream.*;

class Book {
  private String genre;
    private int pages;

    public Book(String title, String genre, int pages) {
       this.genre = genre;
        this.pages = pages;
    }
    public String getGenre() { return genre; }
    public int getPages() { return pages; }
}

public class BookStatistics {
    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
            new Book("Book A", "Fiction", 300),
            new Book("Book B", "Fiction", 250),
            new Book("Book C", "Science", 400),
            new Book("Book D", "Science", 350),
            new Book("Book E", "History", 500)
        );

        Map<String, IntSummaryStatistics> statsByGenre =
            books.stream().collect(
                Collectors.groupingBy(Book::getGenre,
                    Collectors.summarizingInt(Book::getPages))
            );

        statsByGenre.forEach((genre, stats) -> {
            System.out.println(genre + " -> " + stats);
        });
    }
}
