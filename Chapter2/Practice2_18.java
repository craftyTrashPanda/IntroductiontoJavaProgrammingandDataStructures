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
		
//		 2.18
//		 Print a table, even though this chapter didn't teach anything about tables or for loops or Math.pow
//		 Specifically cast floating-point numbers into integers
		System.out.print("a b pow(a, b)\n");
		int a = 1;
		int b = 2;
		
		for(int i = 0; i <5; i++) {
			float f = (float) Math.pow(a, b);
			System.out.println(a + " " + b + " " + f);
			a = a+1;
			b = b+1;
		}
	}

}
