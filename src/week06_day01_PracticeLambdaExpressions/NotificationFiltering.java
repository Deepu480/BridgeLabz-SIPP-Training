package week06_day01_PracticeLambdaExpressions;

import java.util.*;
import java.util.function.*;

class Alert {
    String message;
    String type;

    Alert(String message, String type) {
        this.message = message;
        this.type = type;
    }

    @Override
    public String toString() {
        return "[" + type + "] " + message;
    }
}

public class NotificationFiltering {
    public static void main(String[] args) {
        List<Alert> alerts = Arrays.asList(
            new Alert("High blood pressure", "Critical"),
            new Alert("Regular check-up reminder", "Info"),
            new Alert("Low sugar level", "Critical"),
            new Alert("New health tip available", "Info")
        );

        Predicate<Alert> criticalOnly = alert -> alert.type.equals("Critical");

        alerts.stream().filter(criticalOnly).forEach(System.out::println);
    }
}
