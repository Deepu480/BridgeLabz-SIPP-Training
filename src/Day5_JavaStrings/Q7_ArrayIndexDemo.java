package Day5_JavaStrings;

import java.util.Scanner;

public class Q7_ArrayIndexDemo {
    public static void generateException(String[] names) {
        System.out.println("Accessing out-of-bounds index: " + names[names.length]);
    }
    public static void handleException(String[] names) {
        try {
            System.out.println("Trying to access invalid index...");
            System.out.println("Accessing: " + names[names.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: Invalid index.");
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException.");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of names: ");
        int size = sc.nextInt();
        sc.nextLine(); 

        String[] names = new String[size];
        System.out.println("Enter " + size + " names:");
        for (int i = 0; i < size; i++) {
            System.out.print("Name " + (i + 1) + ": ");
            names[i] = sc.nextLine();
        }
        System.out.println("\nCalling method that generates exception:");
        try {
            generateException(names);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught in main: " + e.getMessage());
        }
        System.out.println("\nCalling method that handles exception:");
        handleException(names);
    }
}

