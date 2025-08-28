package week06_day01_PracticeLambdaExpressions;

import java.util.*;

public class EmployeeNameUppercase {
    public static void main(String[] args) {
        List<String> employees = Arrays.asList("Alice", "Bob", "Charlie", "Deepu");
            employees.stream()
            .map(String::toUpperCase)
            .forEach(System.out::println);
    }
}
