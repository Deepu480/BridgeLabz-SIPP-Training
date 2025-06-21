package Day5_JavaStrings;


import java.util.Scanner;

public class Q10_CustomSplitCompare {
    public static int getLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }
    public static String[] customSplit(String text) {
        int length = getLength(text);
        int wordCount = 0;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }
        wordCount++; 

        String[] words = new String[wordCount];
        int wordIndex = 0;
        String currentWord = "";

        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            if (ch != ' ') {
                currentWord += ch;
            } else {
                if (!currentWord.equals("")) {
                    words[wordIndex++] = currentWord;
                    currentWord = "";
                }
            }
        }

        if (!currentWord.equals("")) {
            words[wordIndex] = currentWord; 
        }

        return words;
    }
    public static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length) return false;

        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) return false;
        }
        return true;
    }
    public static void printArray(String[] arr, String label) {
        System.out.print(label + ": ");
        for (String word : arr) {
            System.out.print("[" + word + "] ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        String[] manualWords = customSplit(sentence);
        String[] builtInWords = sentence.split(" ");

        printArray(manualWords, "Custom split");
        printArray(builtInWords, "Built-in split");

        boolean result = compareArrays(manualWords, builtInWords);
        System.out.println("Are both splits equal? " + result);
    }
}
