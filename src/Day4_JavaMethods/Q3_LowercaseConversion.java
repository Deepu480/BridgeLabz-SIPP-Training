package Day4_JavaMethods;
import java.util.Scanner;

public class Q3_LowercaseConversion {
    public static String toLowerManual(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch += 32;
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

        String manualLower = toLowerManual(input);
        String builtinLower = input.toLowerCase();

        boolean isEqual = compareStrings(manualLower, builtinLower);

        System.out.println("Manual lowercase: " + manualLower);
        System.out.println("Built-in lowercase: " + builtinLower);
        System.out.println("Are both lowercase versions equal? " + isEqual);
    }
}


