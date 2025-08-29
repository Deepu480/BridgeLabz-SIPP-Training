package week06_day03_JavaCollectors;

import java.util.*;
import java.util.stream.*;

public class WordFrequency {
    public static void main(String[] args) {
        String paragraph = "hello world hello java world hello streams";

        Map<String, Long> wordCount =
            Arrays.stream(paragraph.split("\\s+"))
                .collect(Collectors.toMap(
                    word -> word,
                    word -> 1L,
                    Long::sum 
                ));

        System.out.println(wordCount);
    }
}
