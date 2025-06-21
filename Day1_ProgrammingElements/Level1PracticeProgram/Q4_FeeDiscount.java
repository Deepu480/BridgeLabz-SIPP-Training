package Day1_ProgrammingElements.Level1PracticeProgram;

import java.util.Scanner;

public class Q4_FeeDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Fee Amount: ");
        double fee = sc.nextDouble();
        System.out.print("Enter the Discount Percentage: ");
        double discountPercent = sc.nextDouble();

        double discount = fee * discountPercent / 100;
        double finalFee = fee - discount;

        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
    }
}

