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
    
//		 2.16
//		 Determine the area of a hexagon
//		 area equals 3*the sqrt of 3 / 2 s squared, s being length
		System.out.println("Enter the length of a side: ");
		double side = input.nextDouble();
		double area = ((3 * Math.pow(3, .5)) / 2) * Math.pow(side, 2);
		System.out.printf("The area of the hexagon is %.4f", area);
	}

}
