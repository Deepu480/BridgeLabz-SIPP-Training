package Day3_JavaArrays;

import java.util.Scanner;

public class Q5_SumUntilZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total = 0.0;
        double number;

        System.out.println("Enter numbers to sum (enter 0 to stop):");

        while (true) {
            System.out.print("Enter number: ");
            number = sc.nextDouble();

            if (number == 0.0) {
                break;
            }

            total += number;
        }

        System.out.println("The total sum is: " + total);
    }
}
