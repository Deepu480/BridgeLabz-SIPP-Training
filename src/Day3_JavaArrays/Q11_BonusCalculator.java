package Day3_JavaArrays;


import java.util.Scanner;

public class Q11_BonusCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter years of service: ");
        int years = sc.nextInt();

        if (years > 5) {
            double bonus = salary * 0.05;
            System.out.println("Bonus awarded: ₹" + bonus);
        } else {
            System.out.println("No bonus. Service less than or equal to 5 years.");
        }
    }
}
