package day7_Workshop;
public class LibrarySystemDemo {
    public static void main(String[] args) {
        // Create book requests of different types
        EBook ebook = new EBook("Digital Fortress", "Dan Brown");
        HardCopyBook hardcopy = new HardCopyBook("The Alchemist", "Paulo Coelho");
        AudioBook audiobook = new AudioBook("Atomic Habits", "James Clear");

        // Create queues for each book type
        LibraryQueue<Book> libraryQueue = new LibraryQueue<>();

        // Add requests from users
        libraryQueue.addRequest(new Request<>("User A", ebook));
        libraryQueue.addRequest(new Request<>("User B", hardcopy));
        libraryQueue.addRequest(new Request<>("User C", audiobook));

        // Process requests
        System.out.println("\nProcessing requests:");
        while (!libraryQueue.isEmpty()) {
            libraryQueue.processNextRequest();
        }
    }
}
