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
		
//		 2.14
//		 Calculate BMI
//		 BMI = weight in kilograms / height in meters squared
		System.out.println("Enter weight in pounds: ");
		double weight = input.nextDouble() * .45359237;
		System.out.println("Enter height in inches: ");
		double height = input.nextDouble() * .0254;
		double bmi = weight / (height * height);
		System.out.printf("BMI is %.4f", bmi);
	}

}
