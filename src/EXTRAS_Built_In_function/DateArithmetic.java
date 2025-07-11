package EXTRAS_Built_In_Function;

import java.time.LocalDate;
import java.util.Scanner;

public class DateArithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a date (yyyy-MM-dd): ");
        String input = scanner.nextLine();
        LocalDate date = LocalDate.parse(input);

        LocalDate result = date.plusDays(7).plusMonths(1).plusYears(2).minusWeeks(3);
        System.out.println("Final Date after arithmetic operations: " + result);
    }
}
