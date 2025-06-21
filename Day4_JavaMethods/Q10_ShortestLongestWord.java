package Day4_JavaMethods;


import java.util.Scanner;

public class Q10_ShortestLongestWord {
    public static String[] customSplit(String text) {
        text = text.trim() + " "; 
        String word = "";
        java.util.ArrayList<String> words = new java.util.ArrayList<>();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch != ' ') {
                word += ch;
            } else if (!word.isEmpty()) {
                words.add(word);
                word = "";
            }
        }

        return words.toArray(new String[0]);
    }
    public static int getLength(String word) {
        int count = 0;
        try {
            while (true) {
                word.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }
    public static String[][] getWordLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getLength(words[i]));
        }
        return result;
    }
    public static String[] findShortestLongest(String[][] wordLenArray) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        String shortest = "", longest = "";

        for (String[] pair : wordLenArray) {
            int len = Integer.parseInt(pair[1]);
            if (len < min) {
                min = len;
                shortest = pair[0];
            }
            if (len > max) {
                max = len;
                longest = pair[0];
            }
        }

        return new String[]{shortest, longest};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        String[] words = customSplit(input);
        String[][] wordLengths = getWordLengths(words);
        String[] result = findShortestLongest(wordLengths);

        System.out.println("\nWords and their lengths:");
        for (String[] pair : wordLengths) {
            System.out.println(pair[0] + " -> " + pair[1]);
        }

        System.out.println("\nShortest word: " + result[0]);
        System.out.println("Longest word: " + result[1]);
    }
}
