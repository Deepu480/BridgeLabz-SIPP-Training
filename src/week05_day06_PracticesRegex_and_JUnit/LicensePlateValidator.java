package week05_day06_PracticesRegex_and_JUnit;

import java.util.Scanner;

public class LicensePlateValidator {
      private static final String LICENSE_PLATE_PATTERN = "^[A-Z]{2}[0-9]{4}$";

    public static boolean isValidLicensePlate(String plate) {
        return plate.matches(LICENSE_PLATE_PATTERN);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a license plate number: ");
        String plate = sc.nextLine();

        if (isValidLicensePlate(plate)) {
            System.out.println("✅ \"" + plate + "\" → Valid License Plate");
        } else {
            System.out.println("❌ \"" + plate + "\" → Invalid License Plate");
        }

        sc.close();
    }
}

