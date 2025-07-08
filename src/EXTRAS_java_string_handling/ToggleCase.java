package EXTRAS_java_string_handling;

public class ToggleCase {
    public static void main(String[] args) {
        String input = "Java123";
        StringBuilder result = new StringBuilder();

        for (char ch : input.toCharArray()) {
            if (Character.isUpperCase(ch))
                result.append(Character.toLowerCase(ch));
            else if (Character.isLowerCase(ch))
                result.append(Character.toUpperCase(ch));
            else
                result.append(ch);
        }

        System.out.println("Toggled String: " + result);
    }
}

