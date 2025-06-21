package Day5_JavaStrings;
import java.util.Scanner;
public class Q13_StringLengthFinder {
	    public static int getManualLength(String text) {
	        int count = 0;
	        try {
	            while (true) {
	                text.charAt(count); 
	                count++;
	            }
	        } catch (Exception e) {
	            return count;
	        }
	    }
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a word: ");
	        String input = sc.next();

	        int manualLength = getManualLength(input);
	        int builtInLength = input.length();
	        System.out.println("Length using charAt() method: " + manualLength);
	        System.out.println("Length using built-in method: " + builtInLength);
	    }
	}

