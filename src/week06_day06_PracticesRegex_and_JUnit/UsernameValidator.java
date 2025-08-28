package week06_day06_PracticesRegex_and_JUnit;

import java.util.Scanner;

public class UsernameValidator {
    private static final String USERNAME_PATTERN = "^[A-Za-z][A-Za-z0-9_]{4,14}$";

    public static boolean isValidUsername(String username) {
        return username.matches(USERNAME_PATTERN);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a username: ");
        String username = sc.nextLine();

        if (isValidUsername(username)) {
            System.out.println("✅ \"" + username + "\" → Valid");
        } else {
            System.out.println("❌ \"" + username + "\" → Invalid");
        }

        sc.close();
    }
}

