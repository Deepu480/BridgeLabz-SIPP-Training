package Day3_JavaArrays;
import java.util.Scanner;

public class Q20_MultiplesWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number (positive and less than 100): ");
        int number = sc.nextInt();

        if (number <= 0 || number >= 100) {
            System.out.println("Invalid input. Number must be positive and less than 100.");
        } else {
            int counter = 99;

            System.out.println("Multiples of " + number + " below 100:");
            while (counter > 0) {
                if (counter % number == 0) {
                    System.out.print(counter + "  " );
                }
                counter--;
            }
        }
    }
}


