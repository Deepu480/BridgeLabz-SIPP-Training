package Day4_JavaMethods;


import java.util.Scanner;

public class Q5_CharArrayComparison {
    public static char[] customCharArray(String text) {
        char[] result = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            result[i] = text.charAt(i);
        }
        return result;
    }
    public static boolean compareCharArrays(char[] a, char[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }
    public static void printArray(char[] array) {
        for (char c : array) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.next();
        char[] manualArray = customCharArray(input);
        char[] builtinArray = input.toCharArray();
        boolean areEqual = compareCharArrays(manualArray, builtinArray);
        System.out.print("Manual char array: ");
        printArray(manualArray);

        System.out.print("Built-in char array: ");
        printArray(builtinArray);

        System.out.println("Are both char arrays equal? " + areEqual);
    }
}
