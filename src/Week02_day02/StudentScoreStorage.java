package Week02_day02;

import java.util.*;

public class StudentScoreStorage {
    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Alice", 85);
        scores.put("Bob", 92);
        scores.put("Charlie", 78);
        scores.put("David", 95);
        scores.put("Eva", 88);
        scores.entrySet()
              .stream()
              .max(Map.Entry.comparingByValue())
              .ifPresent(entry -> 
                  System.out.println("Highest Scorer: " + entry.getKey() + " with " + entry.getValue() + " marks")
              );
    }
}

