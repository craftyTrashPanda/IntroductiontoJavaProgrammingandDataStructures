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
    
//		 2.4
//		 Convert pounds into kilograms
//		 1 pound = .454 kilograms
		System.out.println("2.4 Convert pounds into kilograms");
		System.out.println("Input the amount of pounds: ");
		double pounds = input.nextDouble();
		double kilos = pounds * .454;
		System.out.println("That is " + kilos + " kilograms.\n");
	}

}
