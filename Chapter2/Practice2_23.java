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
		
//		 2.23
//		 Cost of driving
//		 Write a program that prompts the user to enter the distance to drive, the fuel efficiency
//		 of the car in miles per gallon, and the price per gallon, then display the cost of the trip.
		System.out.println("Enter the driving distance: ");
		double distance = input.nextDouble();
		System.out.println("Enter miles per gallon: ");
		double mpg = input.nextDouble();
		System.out.println("Enter price per gallon: ");
		double ppg = input.nextDouble();
		
		double cost = (distance / mpg) * ppg;
		System.out.printf("The cost of driving is $%.2f", cost);
	}

}
