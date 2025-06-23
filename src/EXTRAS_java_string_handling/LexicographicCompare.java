package EXTRAS_java_string_handling;

public class LexicographicCompare {
    public static void main(String[] args) {
        String s1 = "apple";
        String s2 = "banana";

        int minLength = Math.min(s1.length(), s2.length());
        boolean equal = true;

        for (int i = 0; i < minLength; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                if (s1.charAt(i) < s2.charAt(i))
                    System.out.println("\"" + s1 + "\" comes before \"" + s2 + "\"");
                else
                    System.out.println("\"" + s2 + "\" comes before \"" + s1 + "\"");
                equal = false;
                break;
            }
        }

        if (equal) {
            if (s1.length() == s2.length())
                System.out.println("Strings are equal.");
            else if (s1.length() < s2.length())
                System.out.println("\"" + s1 + "\" comes before \"" + s2 + "\"");
            else
                System.out.println("\"" + s2 + "\" comes before \"" + s1 + "\"");
        }
    }
}
