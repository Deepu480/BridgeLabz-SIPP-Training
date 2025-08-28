package week06_day02_Submission_Functional_Interfaces;

import java.util.function.Function;

public class StringLengthChecker {
    public static void main(String[] args) {
        int limit = 20;
        Function<String, Integer> messageLength = msg -> msg.length();

        String message = "This is a long message example.";

        int length = messageLength.apply(message);

        if (length > limit) {
            System.out.println("Message length (" + length + ") exceeds limit of " + limit);
        } else {
            System.out.println("Message is within limit (" + length + " characters).");
        }
    }
}
