package Day3_JavaArrays;

import java.util.Scanner;

public class Q16_YoungestTallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];
        System.out.println("Enter ages of Amar, Akbar, and Anthony:");
        for (int i = 0; i < 3; i++) {
            System.out.print(names[i] + "'s age: ");
            ages[i] = sc.nextInt();
        }
        System.out.println("\nEnter heights (in cm) of Amar, Akbar, and Anthony:");
        for (int i = 0; i < 3; i++) {
            System.out.print(names[i] + "'s height: ");
            heights[i] = sc.nextDouble();
        }
        int youngestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
        }
        int tallestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }
        System.out.println("\n✅ The youngest friend is: " + names[youngestIndex] + " (Age: " + ages[youngestIndex] + ")");
        System.out.println("✅ The tallest friend is: " + names[tallestIndex] + " (Height: " + heights[tallestIndex] + " cm)");
    }
}
