package Day5_JavaStrings;

import java.util.Scanner;

public class Q8_WordLength2DArray {
    public static String[] splitIntoWords(String text) {
        text = text.trim() + " ";  
        String word = "";
        java.util.ArrayList<String> words = new java.util.ArrayList<>();

        for (int i = 0; i < getLength(text); i++) {
            char ch = text.charAt(i);
            if (ch != ' ') {
                word += ch;
            } else {
                if (!word.equals("")) {
                    words.add(word);
                    word = "";
                }
            }
        }

        return words.toArray(new String[0]);
    }
    public static int getLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }
    public static String[][] getWordLengthTable(String[] words) {
        String[][] table = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            table[i][0] = words[i];
            table[i][1] = String.valueOf(getLength(words[i]));
        }
        return table;
    }
    public static void displayWordTable(String[][] table) {
        System.out.printf("%-15s %-10s\n", "Word", "Length");
        System.out.println("--------------------------");

        for (String[] row : table) {
            String word = row[0];
            int length = Integer.parseInt(row[1]); 
            System.out.printf("%-15s %-10d\n", word, length);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        String[] words = splitIntoWords(sentence);
        String[][] wordTable = getWordLengthTable(words);

        System.out.println("\nWords and their lengths:");
        displayWordTable(wordTable);
    }
}

