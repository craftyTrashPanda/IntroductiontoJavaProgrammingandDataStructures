/**
 * 
 */
import java.util.Scanner;

/**
 * 
 */
public class ChTwoProblems {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);

//		 2.7
//		 Enter an amount of minutes and figure out the amount of years and days
//		 1440 minutes in a day
		System.out.println("Enter an amount of minutes: ");
		int minutes = input.nextInt();
		int years = (minutes / 1440) / 365;
		int days = (minutes / 1440) % 365;
		System.out.println(years + " years and " + days + " days");
	}

}
