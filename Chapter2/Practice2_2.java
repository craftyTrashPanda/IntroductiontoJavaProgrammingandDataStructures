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
		
		 2.2
//		 Compute the volume of a cylinder
//		 area = radius * radius * pi
//		 volume = area * length
		System.out.println("2.2 Find the volume of a cylinder");
		System.out.println("Input your radius and length: ");
		double radius = input.nextDouble();
		double length = input.nextDouble();
		double area = radius * radius * 3.14;
		double volume = area * length;
		System.out.println("The volume of your cylinder is: " + volume + "\n");
	}

}
