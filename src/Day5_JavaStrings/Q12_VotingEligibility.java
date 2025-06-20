package Day5_JavaStrings;

import java.util.Random;
import java.util.Scanner;

public class Q12_VotingEligibility {
    public static int[] generateAges(int n) {
        Random rand = new Random();
        int[] ages = new int[n];

        for (int i = 0; i < n; i++) {
            ages[i] = rand.nextInt(90) + 10;
        }

        return ages;
    }
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            int age = ages[i];
            result[i][0] = String.valueOf(age);

            if (age < 0) {
                result[i][1] = "false"; 
            } else if (age >= 18) {
                result[i][1] = "true";  // Can vote
            } else {
                result[i][1] = "false"; // Cannot vote
            }
        }

        return result;
    }
    public static void displayTable(String[][] table) {
        System.out.printf("%-10s %-15s\n", "Age", "Can Vote");
        System.out.println("---------------------------");

        for (String[] row : table) {
            System.out.printf("%-10s %-15s\n", row[0], row[1]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] ages = generateAges(n);
        String[][] resultTable = checkVotingEligibility(ages);

        System.out.println("\nVoting Eligibility Table:");
        displayTable(resultTable);
    }
}
