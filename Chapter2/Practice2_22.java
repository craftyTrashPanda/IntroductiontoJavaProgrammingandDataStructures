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
		
//		 2.22
//		 Rewrite listing 2.10 ComputeChange.java to fix possible loss of accuracy when converting a
//		 double value to an int value. Enter the input as an integer whose last two digit represent
//		 the cents. For example, the input 1156 represents 11 dollars and 56 cents.
		System.out.println("Enter the amount of money with no decimal: ");
		int amount = input.nextInt();
		int dollars = amount /100;
		int coins = amount % 100;
		int quarters = coins / 25;
		int remaining = coins %25;
		int dimes = remaining / 10;
		remaining = remaining % 10;
		int nickels = remaining / 5;
		remaining = remaining % 5;
		int pennies = remaining;
		System.out.println("Your amount $" + amount / 100.0 + " consists of: ");
		System.out.println(" " + dollars + " dollars.");
		System.out.println(" " + quarters + " quarters.");
		System.out.println(" " + dimes + " dimes.");
		System.out.println(" " + nickels + " nickels.");
		System.out.println(" " + pennies + " pennies.");
	}

}
