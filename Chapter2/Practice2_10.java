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
		
//		 2.10
//		 Calculate the energy needed to heat water from an intial temperature to a final temperature
//		 Q = M * (final temp - initial temp) * 4184
//		 M equals weight of the water
		System.out.println("Enter the weight of the water in kilograms: ");
		double weight = input.nextDouble();
		System.out.println("Enter the inital temperature: ");
		double init = input.nextDouble();
		System.out.println("Enter the final temperature: ");
		double end = input.nextDouble();
		System.out.println("The energy needed is: " + ((weight * (end - init)) * 4184) );
	}

}
