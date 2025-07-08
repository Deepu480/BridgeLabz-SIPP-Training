package EXTRAS_java_string_handling;

public class RemoveCharacter {
    public static void main(String[] args) {
        String input = "Hello World";
        char toRemove = 'l';
        String result = "";

        for (char ch : input.toCharArray()) {
            if (ch != toRemove)
                result += ch;
        }

        System.out.println("Modified String: " + result);
    }
}
