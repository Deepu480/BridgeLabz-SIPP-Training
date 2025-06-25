package OOPS.day1class_and_object;

class PalindromeChecker {
    String text;

    PalindromeChecker(String text) {
        this.text = text;
    }

    boolean isPalindrome() {
        String cleanText = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int n = cleanText.length();
        for (int i = 0; i < n / 2; i++) {
            if (cleanText.charAt(i) != cleanText.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    void displayResult() {
        System.out.println("Text: " + text);
        if (isPalindrome())
            System.out.println("It is a palindrome.");
        else
            System.out.println("It is not a palindrome.");
    }

    public static void main(String[] args) {
        PalindromeChecker pc = new PalindromeChecker("Madam");
        pc.displayResult();
    }
}
