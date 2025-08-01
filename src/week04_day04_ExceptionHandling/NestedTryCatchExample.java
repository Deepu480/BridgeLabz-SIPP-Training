package week04_day04_ExceptionHandling;

import java.util.Scanner;

public class NestedTryCatchExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Sample array
        int[] numbers = {10, 20, 30, 40, 50};

        try {
            System.out.print("Enter index to access (0-4): ");
            int index = scanner.nextInt();

            try {
                int value = numbers[index]; // May throw ArrayIndexOutOfBoundsException

                System.out.print("Enter divisor: ");
                int divisor = scanner.nextInt();

                int result = value / divisor; // May throw ArithmeticException
                System.out.println("Result: " + result);

            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero!");
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index!");
        }

        scanner.close();
    }
}
