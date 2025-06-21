package Day2_JavaControlFlows;
import java.util.Scanner;

public class q19_TravelSummary {
	public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter Name: ");
	        String name = sc.nextLine();

	        System.out.print("From City: ");
	        String fromCity = sc.nextLine();

	        System.out.print("Via City: ");
	        String viaCity = sc.nextLine();

	        System.out.print("To City: ");
	        String toCity = sc.nextLine();

	        System.out.print("Distance from From to Via (in miles): ");
	        double fromToVia = sc.nextDouble();

	        System.out.print("Distance from Via to Final City (in miles): ");
	        double viaToFinalCity = sc.nextDouble();

	        System.out.print("Time from From to Via (in mins): ");
	        double time1 = sc.nextDouble();

	        System.out.print("Time from Via to Final City (in mins): ");
	        double time2 = sc.nextDouble();

	        double totalDistance = fromToVia + viaToFinalCity;
	        double totalTime = time1 + time2;

	        System.out.println("The Total Distance travelled by " + name + " from " + fromCity + " to " + toCity + 
	            " via " + viaCity + " is " + totalDistance + " km and the Total Time taken is " + totalTime + " minutes");
	    }
	}


