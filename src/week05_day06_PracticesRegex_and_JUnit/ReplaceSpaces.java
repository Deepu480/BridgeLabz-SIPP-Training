package week05_day06_PracticesRegex_and_JUnit;

public class ReplaceSpaces {
    public static void main(String[] args) {
        String input = "This   is  an    example   with   multiple   spaces.";
        String output = input.replaceAll("\\s+", " ");
              
        System.out.println("Original: " + input);
        System.out.println("Processed: " + output);
    }
}
