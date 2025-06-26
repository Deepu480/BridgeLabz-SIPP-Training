package OOPS.day3_Static_Final_InstanceOperator;

public class Book {
    static String libraryName = "City Central Library";

    private final String isbn;
    private String title;
    private String author;

    public Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    public static void displayLibraryName() {
        System.out.println("Library: " + libraryName);
    }

    public void displayDetails() {
        if (this instanceof Book) {
            System.out.println("ISBN: " + isbn);
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
        }
    }

    public static void main(String[] args) {
        Book b1 = new Book("ISBN001", "Java Basics", "John Doe");
        b1.displayDetails();
        displayLibraryName();
    }
}

