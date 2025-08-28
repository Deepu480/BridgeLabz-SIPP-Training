package week05_day06_PracticesRegex_and_JUnit;

import java.util.regex.*;
import java.util.*;

public class ExtractCapitalizedWords {
    public static void main(String[] args) {
        String text = "The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";
        String capitalRegex = "\\b[A-Z][a-zA-Z]*\\b";

        Pattern pattern = Pattern.compile(capitalRegex);
        Matcher matcher = pattern.matcher(text);

        List<String> capitalizedWords = new ArrayList<>();

        while (matcher.find()) {
            capitalizedWords.add(matcher.group());
        }

        System.out.println("Extracted Capitalized Words:");
        System.out.println(String.join(", ", capitalizedWords));
    }
}

