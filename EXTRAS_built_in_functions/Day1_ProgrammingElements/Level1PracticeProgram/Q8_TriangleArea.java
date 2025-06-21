package Day1_ProgrammingElements.Level1PracticeProgram;

import java.util.Scanner;

public class Q8_TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base in cm: ");
        double base = sc.nextDouble();
        System.out.print("Enter height in cm: ");
        double height = sc.nextDouble();

        double areaCm2 = 0.5 * base * height;
        double areaIn2 = areaCm2 / (2.54 * 2.54);

        System.out.println("The Area of the triangle in sq cm is " + areaCm2 + " and sq in is " + areaIn2);
    }
}

