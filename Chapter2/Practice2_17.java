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
    
//		 2.17
//		 Calculate the wind chill temperature
//		 tWC = 35.74 + 0.6215*tA - 35.75*v0.16 + 0.4275*taV0.16
		System.out.println("Enter the temperature in Fahrenheit between -58F and 41F: ");
		double actualTemp = input.nextDouble();
		System.out.println("Enter the wind speed, greater than 2mph: ");
		double speed = input.nextDouble();
		double windChill = 35.74 + .6215 * actualTemp - 35.75 * Math.pow(speed, .16) + .4275 * actualTemp * Math.pow(speed, .16);
		System.out.printf("The wind chill index is %.1f", windChill);
	}

}
