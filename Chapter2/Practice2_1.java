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
		
//		 2.1
//		 Convert Celsius to Fahrenheit
//		 Equation is 9 / 5 * celsius + 32
		System.out.println("2.1 Convert Celsius to Fahrenheit");
		
		System.out.println("Input your temperature in celsius: ");
		double celsius = input.nextDouble();
		double fahrenheit;
		fahrenheit = 9.0 / 5.0 * celsius + 32;
		System.out.println(fahrenheit+"\n");
	}

}
