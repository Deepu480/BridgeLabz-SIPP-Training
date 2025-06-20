package Day5_JavaStrings;

import java.util.Scanner;
public class Q14_CustomTrim {
    public static int[] getTrimIndices(String text) {
        int start = 0;
        int end = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != ' ') {
                start = i;
                break;
            }
        }
        for (int i = text.length() - 1; i >= 0; i--) {
            if (text.charAt(i) != ' ') {
                end = i;
                break;
            }
        }

        return new int[]{start, end};
    }
    public static String customSubstring(String text, int start, int end) {
        String result = "";
        for (int i = start; i <= end && i < text.length(); i++) {
            result += text.charAt(i);
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

        System.out.print("Enter a string with spaces: ");
        String input = sc.nextLine();
        int[] indices = getTrimIndices(input);
        String manualTrimmed = customSubstring(input, indices[0], indices[1]);

        String builtInTrimmed = input.trim();
        boolean isEqual = compareStrings(manualTrimmed, builtInTrimmed);
        System.out.println("Manual trim result: \"" + manualTrimmed + "\"");
        System.out.println("Built-in trim result: \"" + builtInTrimmed + "\"");
        System.out.println("Are both trimmed results equal? " + isEqual);
    }
}
