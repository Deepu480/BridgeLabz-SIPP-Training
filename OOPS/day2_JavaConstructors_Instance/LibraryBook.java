package OOPS.day2_JavaConstructors_Instance;

public class LibraryBook {
    String title;
    String author;
    double price;
    boolean isAvailable;
    public LibraryBook(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = true; 
    }
    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Book borrowed successfully!");
        } else {
            System.out.println("Book is currently unavailable.");
        }
    }

    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: ₹" + price);
        System.out.println("Available: " + (isAvailable ? "Yes" : "No"));
    }

    public static void main(String[] args) {
        LibraryBook book = new LibraryBook("Wings of Fire", "A.P.J Abdul Kalam", 299.0);

        System.out.println("Book Details:");
        book.display();

        System.out.println("\nTrying to borrow the book...");
        book.borrowBook();  

        System.out.println("\nTrying to borrow again...");
        book.borrowBook();

        System.out.println("\nFinal Book Status:");
        book.display();
    }
}

