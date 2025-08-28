package week05_day06_PracticesRegex_and_JUnit;

import java.util.*;

public class CensorBadWords {
    public static void main(String[] args) {
        String input = "This is a damn bad example with some stupid words.";
        List<String> badWords = Arrays.asList("damn", "stupid");

        String censored = input;

        for (String badWord : badWords) {
            censored = censored.replaceAll("(?i)\\b" + badWord + "\\b", "****");
        }

        System.out.println("Original: " + input);
        System.out.println("Censored: " + censored);
    }
}
