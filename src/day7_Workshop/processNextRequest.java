package day7_Workshop;
import java.util.*;

//Base class for books
abstract class Book {
 protected String title;
 protected String author;

 public Book(String title, String author) {
     this.title = title;
     this.author = author;
 }

 public abstract String getType();

 @Override
 public String toString() {
     return getType() + " - " + title + " by " + author;
 }
}

//Subclass for EBook
class EBook extends Book {
 public EBook(String title, String author) {
     super(title, author);
 }

 @Override
 public String getType() {
     return "E-Book";
 }
}

//Subclass for HardCopyBook
class HardCopyBook extends Book {
 public HardCopyBook(String title, String author) {
     super(title, author);
 }

 @Override
 public String getType() {
     return "Hardcopy Book";
 }
}

//Subclass for AudioBook
class AudioBook extends Book {
 public AudioBook(String title, String author) {
     super(title, author);
 }

 @Override
 public String getType() {
     return "Audio Book";
 }
}

//Generic request class
class Request<T extends Book> {
 private String user;
 private T book;

 public Request(String user, T book) {
     this.user = user;
     this.book = book;
 }

 public String getUser() {
     return user;
 }

 public T getBook() {
     return book;
 }

 @Override
 public String toString() {
     return "User: " + user + ", Requested: " + book;
 }
}

//Generic queue system for the library
class LibraryQueue<T extends Book> {
 private Queue<Request<T>> requestQueue;

 public LibraryQueue() {
     requestQueue = new LinkedList<>();
 }

 // Add request
 public void addRequest(Request<T> request) {
     requestQueue.add(request);
     System.out.println("Added request → " + request);
 }

 // Process next request (FIFO)
 public void processNextRequest() {
     if (!requestQueue.isEmpty()) {
         Request<T> next = requestQueue.poll();
         System.out.println("Processing request → " + next);
     } else {
         System.out.println("No more requests to process.");
     }
 }

 public boolean isEmpty() {
     return requestQueue.isEmpty();
 }
}

