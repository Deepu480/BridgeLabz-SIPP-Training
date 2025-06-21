package Day4_JavaMethods;

import java.util.Scanner;

public class Q6_UppercaseConversion {
    public static String toUpperManual(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ch -= 32; 
            }
            result += ch;
        }
        return result;
    }
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String input = sc.nextLine();

        String manualUpper = toUpperManual(input);
        String builtinUpper = input.toUpperCase();

        boolean isEqual = compareStrings(manualUpper, builtinUpper);

        System.out.println("Manual uppercase: " + manualUpper);
        System.out.println("Built-in uppercase: " + builtinUpper);
        System.out.println("Are both uppercase versions equal? " + isEqual);
    }
}
