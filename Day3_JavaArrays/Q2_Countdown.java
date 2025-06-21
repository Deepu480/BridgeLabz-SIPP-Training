package Day3_JavaArrays;

import java.util.Scanner;

public class Q2_Countdown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the countdown start number: ");
        int counter = sc.nextInt();

        if (counter <= 0) {
            System.out.println("Please enter a number greater than 0.");
        } else {
            System.out.println("\nRocket Launch Countdown:");
            for (int i = counter; i >= 1; i--) {
                System.out.println(i);
            }
            System.out.println("🚀 Launch!");
        }
    }
}
