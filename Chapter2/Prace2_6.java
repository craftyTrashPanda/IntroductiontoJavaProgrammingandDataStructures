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

//		 2.6 
//		 Sum the digits of an integer
//		 aka add up the digits of an integer as if they were separate		
		String sum;
		int maxDigits = 4;
		do {
			System.out.print("Enter a number with up to " + maxDigits + " digits: ");
			sum = input.nextLine();
		} while (sum.length() > maxDigits || !sum.matches("\\d+"));
		
		int number = Integer.parseInt(sum);
		int thousands = number / 1000;
		number = number % 1000;
		int hundreds = number / 100;
		number = number % 100;
		int tens = number /10;
		number = number % 10;
		int ones = number;
		int newSum = thousands + hundreds + tens + ones;
		System.out.println("You entered: " + sum);
		System.out.println("The sum of these numbers is: " + newSum);
	}

}
