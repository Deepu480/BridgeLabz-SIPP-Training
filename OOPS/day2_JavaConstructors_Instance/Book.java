package OOPS.day2_JavaConstructors_Instance;

public class Book {
    String title;
    String author;
    double price;

    public Book() {
        title = "Unknown";
        author = "Unknown";
        price = 0.0;
    }
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
     public void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: ₹" + price);
    }

    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("The Alchemist", "Paulo Coelho", 399.0); 

        System.out.println("Default Book:");
        b1.display();

        System.out.println("\nParameterized Book:");
        b2.display();
    }
}
