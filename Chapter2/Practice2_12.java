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
//		
//		 2.12
//		 Calculate the minimum necessary runway needed
//		 length = v2 / 2a
//		 length equals speed in meters per second divided by meters acceleration in meters per second
		System.out.println("Enter speed and acceleration: ");
		double speed = input.nextDouble();
		double accel = input.nextDouble();
		double necessary = (speed * speed)/(2 * accel);
		System.out.println("The minimum runway length for this airplane is " + necessary);
	}

}
