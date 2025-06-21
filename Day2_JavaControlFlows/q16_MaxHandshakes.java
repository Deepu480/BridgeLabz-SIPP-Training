package Day2_JavaControlFlows;
import java.util.Scanner;

public class q16_MaxHandshakes {
  public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter number of students: ");
	        int n = sc.nextInt();

	        int handshakes = (n * (n - 1)) / 2;

	        System.out.println("Maximum number of handshakes: " + handshakes);
	    }
	}


