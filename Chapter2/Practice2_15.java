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
		
//		 2.15
//		 Determine the distance between 2 points
//		 square root of ((x1 - x2)squared + (y1 - y2)squared)
		System.out.println("Enter x1 and y1: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		
		System.out.println("Enter x2 and y2");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		
		double determinant = Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2);
		double sqrRoot = Math.pow(determinant, 0.5);
		System.out.printf("The distance between  two points is %f", sqrRoot);
	}

}
