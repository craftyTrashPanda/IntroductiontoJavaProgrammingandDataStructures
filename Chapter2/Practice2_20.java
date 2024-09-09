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
		
//		 2.20
//		 Compute the interest for the following months loan payment
//		 interest = balance * (annualInterestRate/1200)
		System.out.println("Enter balance and interest rate (e.g., 3 for 3%): ");
		double balance = input.nextDouble();
		double annualInterest = input.nextDouble();
		double nextMonth = balance * (annualInterest/1200);
		System.out.printf("The interest is %.4f", nextMonth);
	}

}
