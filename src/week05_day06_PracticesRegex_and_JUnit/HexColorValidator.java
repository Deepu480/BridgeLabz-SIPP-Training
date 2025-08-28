package week05_day06_PracticesRegex_and_JUnit;

import java.util.Scanner;

public class HexColorValidator {
    private static final String HEX_COLOR_PATTERN = "^#[0-9A-Fa-f]{6}$";

    public static boolean isValidHexColor(String colorCode) {
        return colorCode.matches(HEX_COLOR_PATTERN);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a hex color code: ");
        String colorCode = sc.nextLine();

        if (isValidHexColor(colorCode)) {
            System.out.println("✅ \"" + colorCode + "\" → Valid Hex Color Code");
        } else {
            System.out.println("❌ \"" + colorCode + "\" → Invalid Hex Color Code");
        }

        sc.close();
    }
}

