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

//		 2.3
//		 Convert feet into meters
//		 1 foot = .305 meters
		System.out.println("2.3 Convert feet into meters");
		System.out.println("Input the amount of feet: ");
		double feet = input.nextDouble();
		double meters = feet * .305;
		System.out.println("That is " + meters + " meters long.\n");
	}

}
