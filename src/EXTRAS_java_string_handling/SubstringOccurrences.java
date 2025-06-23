package EXTRAS_java_string_handling;

public class SubstringOccurrences {
    public static void main(String[] args) {
        String text = "abababa";
        String sub = "aba";
        int count = 0;

        for (int i = 0; i <= text.length() - sub.length(); i++) {
            if (text.substring(i, i + sub.length()).equals(sub)) {
                count++;
            }
        }

        System.out.println("Occurrences of \"" + sub + "\": " + count);
    }
}
