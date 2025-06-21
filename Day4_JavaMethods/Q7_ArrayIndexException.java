package Day4_JavaMethods;


import java.util.Scanner;

public class Q7_ArrayIndexException {
    public static void generateException(String[] names) {
        System.out.println("Accessing invalid index: " + names[names.length]);
    }
    public static void handleException(String[] names) {
        try {
            System.out.println("Accessing invalid index: " + names[names.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: Invalid index access.");
        } catch (RuntimeException e) {
            System.out.println("Caught generic RuntimeException.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of names: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        String[] names = new String[n];
        System.out.println("Enter " + n + " names:");
        for (int i = 0; i < n; i++) {
            names[i] = sc.nextLine();
        }
        System.out.println("\nCalling method that generates exception:");
        try {
            generateException(names);
        } catch (Exception e) {
            System.out.println("Exception caught in main: " + e.getClass().getSimpleName());
        }
        System.out.println("\nCalling method that handles exception:");
        handleException(names);
    }
}
