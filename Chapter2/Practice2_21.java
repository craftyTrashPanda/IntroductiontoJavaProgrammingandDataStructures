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
    
//		 2.21
//		 Calculate future investment value
//		 futureInvestmentValue = investmentAmount * ((1 + monthlyInterestRate)^numberOfYears*12)
		System.out.println("Enter investment amount: ");
		double initInvest = input.nextDouble();
		System.out.println("Enter annual interest rate in percentage: ");
		double annInterest = input.nextDouble();
		System.out.println("Enter number of years:");
		int years = input.nextInt();
		double monthlyInt = annInterest / 1200;
		double fIV = initInvest * Math.pow(1 + monthlyInt, years * 12);
		System.out.printf("Future value is $%.2f", fIV);
	}

}
