package Day4_JavaMethods;


import java.util.Random;
import java.util.Scanner;

public class Q9_StudentGradeCard {
    public static int[][] generateMarks(int n) {
        int[][] marks = new int[n][3];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            marks[i][0] = rand.nextInt(90) + 10; 
            marks[i][1] = rand.nextInt(90) + 10; 
            marks[i][2] = rand.nextInt(90) + 10; 
        }
        return marks;
    }
    public static double[][] calculateStats(int[][] marks) {
        double[][] stats = new double[marks.length][3]; 
        for (int i = 0; i < marks.length; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            stats[i][0] = total;
            stats[i][1] = Math.round(average * 100.0) / 100.0;
            stats[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return stats;
    }
    public static String[] assignGrades(double[][] stats) {
        String[] grades = new String[stats.length];
        for (int i = 0; i < stats.length; i++) {
            double percent = stats[i][2];
            if (percent >= 90) grades[i] = "A";
            else if (percent >= 80) grades[i] = "B";
            else if (percent >= 70) grades[i] = "C";
            else if (percent >= 60) grades[i] = "D";
            else grades[i] = "E";
        }
        return grades;
    }
    public static void displayScorecard(int[][] marks, double[][] stats, String[] grades) {
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-12s %-8s\n",
                "Student", "Physics", "Chemistry", "Math", "Total", "Average", "Percentage", "Grade");
        for (int i = 0; i < marks.length; i++) {
            System.out.printf("Student%-3d %-10d %-10d %-10d %-10.0f %-10.2f %-12.2f %-8s\n",
                    (i + 1),
                    marks[i][0], marks[i][1], marks[i][2],
                    stats[i][0], stats[i][1], stats[i][2],
                    grades[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] marks = generateMarks(n);
        double[][] stats = calculateStats(marks);
        String[] grades = assignGrades(stats);

        displayScorecard(marks, stats, grades);
    }
}
