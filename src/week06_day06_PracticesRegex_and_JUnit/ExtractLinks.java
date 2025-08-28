package week06_day06_PracticesRegex_and_JUnit;

import java.util.regex.*;
import java.util.*;

public class ExtractLinks {
    public static void main(String[] args) {
        String text = "Visit https://www.google.com and http://example.org for more info.";

        String urlRegex = "\\bhttps?://[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}\\b";

        Pattern pattern = Pattern.compile(urlRegex);
        Matcher matcher = pattern.matcher(text);

        List<String> links = new ArrayList<>();
        while (matcher.find()) {
            links.add(matcher.group());
        }

        System.out.println("Extracted Links:");
        System.out.println(String.join(", ", links));
    }
}

