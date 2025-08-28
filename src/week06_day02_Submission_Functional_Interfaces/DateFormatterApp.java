package week06_day02_Submission_Functional_Interfaces;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

interface DateUtils {
 static String formatDate(LocalDate date, String pattern) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return date.format(formatter);
    }
}

public class DateFormatterApp {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        System.out.println("Default: " + today);
        System.out.println("dd/MM/yyyy → " + DateUtils.formatDate(today, "dd/MM/yyyy"));
        System.out.println("MM-dd-yyyy → " + DateUtils.formatDate(today, "MM-dd-yyyy"));
        System.out.println("yyyy MMM dd → " + DateUtils.formatDate(today, "yyyy MMM dd"));
    }
}
