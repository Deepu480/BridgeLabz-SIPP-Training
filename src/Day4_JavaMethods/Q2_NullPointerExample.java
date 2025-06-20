package Day4_JavaMethods;

public class Q2_NullPointerExample {
    public static void generateException() {
        String text = null;
        System.out.println("Length of text: " + text.length());
    }
    public static void handleException() {
        String text = null;
        try {
            System.out.println("Length of text: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: text is null.");
        } catch (RuntimeException e) {
            System.out.println("Caught a generic runtime exception.");
        }
    }

    public static void main(String[] args) {
        System.out.println("Calling method that generates exception:");
        try {
            generateException(); 
        } catch (NullPointerException e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }

        System.out.println("\nCalling method that handles exception:");
        handleException(); 
    }
}
