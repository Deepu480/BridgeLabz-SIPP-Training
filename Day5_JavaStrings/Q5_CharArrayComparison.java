package Day5_JavaStrings;

import java.util.Scanner;

public class Q5_CharArrayComparison {
    public static char[] getCharArrayManual(String text) {
        char[] result = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            result[i] = text.charAt(i);
        }
        return result;
    }
    public static boolean compareCharArrays(char[] a1, char[] a2) {
        if (a1.length != a2.length) return false;

        for (int i = 0; i < a1.length; i++) {
            if (a1[i] != a2[i]) {
                return false;
            }
        }
        return true;
    }
    public static void printCharArray(char[] array) {
        for (char c : array) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String input = sc.next();
        char[] manualArray = getCharArrayManual(input);
        char[] builtInArray = input.toCharArray();
        System.out.print("Manual char array:   ");
        printCharArray(manualArray);
        System.out.print("Built-in char array: ");
        printCharArray(builtInArray);
        boolean isEqual = compareCharArrays(manualArray, builtInArray);
        System.out.println("Are both arrays equal? " + isEqual);
    }
}
