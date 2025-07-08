package EXTRAS_java_string_handling;

public class VowelConsonantCounter {
    public static void main(String[] args) {
        String input = "Hello World";
        int vowels = 0, consonants = 0;
        input = input.toLowerCase();

        for (char ch : input.toCharArray()) {
            if (Character.isLetter(ch)) {
                if ("aeiou".indexOf(ch) != -1)
                    vowels++;
                else
                    consonants++;
            }
        }

        System.out.println("Vowels : " + vowels);
        System.out.println("Consonants : " + consonants);
    }
}
 