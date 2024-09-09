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
		
//		 2.5
//		 Financial application: calculate total with tips
//		 Total = sum + tip percentage
		System.out.println("2.5 Calculate tips based on the order total plus tips");
		System.out.println("Input the order total followed by the tip percentage: ");
		double order = input.nextDouble();
		double tip = input.nextDouble();
		double total = order + (order * (tip*.01));
		System.out.println("The total, including tip, is " + total + "\n");
	}

}
