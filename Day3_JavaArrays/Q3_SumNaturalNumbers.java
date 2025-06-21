package Day3_JavaArrays;

import java.util.Scanner;

public class Q3_SumNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            int sumLoop = 0;
            for (int i = 1; i <= n; i++) {
                sumLoop += i;
            }

           
            int sumFormula = n * (n + 1) / 2;

            // Output
            System.out.println("Sum using loop: " + sumLoop);
            System.out.println("Sum using formula: " + sumFormula);

            if (sumLoop == sumFormula) {
                System.out.println("✅ Both results match!");
            } else {
                System.out.println("❌ Results do not match.");
            }
        }
    }
}
