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
		
		 2.13
		 Prompt the user for a monthly savings amount and calculate for the total after 6 months at 5% interest
		System.out.println("Enter the amount you want to save each month for the next 6 months: ");
		int savings = input.nextInt();
		double interest = .05 / 12;
		double endAmount = 0;
		for (int i =0; i <6; i++) {
			endAmount = (endAmount+savings) * (1 + interest);
		} System.out.printf("After the sixth month, the acount value is $%.2f", endAmount);
	}

}
