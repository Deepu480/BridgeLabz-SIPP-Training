package Day4_JavaMethods;

	import java.util.Scanner;

	public class Q1_SubstringCompare {
	    public static String customSubstring(String text, int start, int end) {
	        String result = "";
	        for (int i = start; i < end && i < text.length(); i++) {
	            result += text.charAt(i);
	        }
	        return result;
	    }
	    public static boolean compareStrings(String s1, String s2) {
	        if (s1.length() != s2.length()) return false;
	        for (int i = 0; i < s1.length(); i++) {
	            if (s1.charAt(i) != s2.charAt(i)) return false;
	        }
	        return true;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter the text: ");
	        String text = sc.next();

	        System.out.print("Enter start index: ");
	        int start = sc.nextInt();
 
	        System.out.print("Enter end index: ");
	        int end = sc.nextInt();
	        String substr1 = customSubstring(text, start, end);
	        String substr2 = text.substring(start, Math.min(end, text.length()));
            boolean areEqual = compareStrings(substr1, substr2);
	        System.out.println("Substring using charAt(): " + substr1);
	        System.out.println("Substring using substring(): " + substr2);
	        System.out.println("Are both substrings equal? " + areEqual);
	    }
	}



