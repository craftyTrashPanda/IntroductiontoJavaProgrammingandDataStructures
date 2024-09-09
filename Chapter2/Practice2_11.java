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
		
//		 2.11
//		 Rewrite exercise 1.11 to prompt for a number of years and display the
//		 population size after those years
		System.out.println("Enter a number of years to project the population size after those years: ");
		int years = input.nextInt();
		int population = 312032486;
		double deathsPY = (((60.0*60.0)*24.0)*365.0)/13.0;
		System.out.println(deathsPY + "\n");
		double newBPY = (((60.0*60.0)*24.0)*365.0)/7.0;
		System.out.println(newBPY+"\n");
		double immigrantsPY = (((60.0*60.0)*24.0)*365.0)/45.0;
		System.out.println(immigrantsPY+"\n");
		long newPop = (long) (population + (years *((newBPY + immigrantsPY) - deathsPY)));
		System.out.println("The population after " + years + " years would be " + newPop);
	}

}
