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
    
//		2.19
//		Find the area of a triangle by calculating the distance between coordinates
//		area = square root of s*(s-sideA)*(s-sideB)*(s-sideC) where s = (sideA + sideB + sideC) / 2
		System.out.println("Enter the coordinates of the three points separated by spaces: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		
		double sideA = Math.pow((Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)),.5);
		double sideB = Math.pow((Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2)),.5);
		double sideC = Math.pow((Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2)),.5);
		double side = (sideA + sideB + sideC) / 2;
		double area = Math.pow(side * (side-sideA)*(side-sideB)*(side-sideC), .5);
		System.out.println("The area of the triangle is " + area);
	}

}
