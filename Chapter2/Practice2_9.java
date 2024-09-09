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
		
		 2.9
		 Calculate acceleration as defined by the below equation
		 a = v0 - v1 / t
		 acceleration equals starting velocity in meters per second minus ending velocity meters per second divided by time span in seconds
		System.out.println("Enter starting velocity, ending velocity, and time span in seconds to calculate velocity: ");
		double starting = input.nextDouble();
		double ending = input.nextDouble();
		double time = input.nextDouble();
		double acceleration = (ending - starting) / time;
		System.out.println("You accelerated at " + acceleration + " meters per second");
	}

}
