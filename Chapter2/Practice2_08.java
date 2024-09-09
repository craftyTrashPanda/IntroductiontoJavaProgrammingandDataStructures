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
		
//		 2.8
//		 Show the current time using the ShowCurrentTime.Java thingy
		System.out.println("Enter the time zone offset to GMT: ");
		int offset = input.nextInt();
		long totalMillis = System.currentTimeMillis();
		long totalSeconds = totalMillis / 1000;
		long currentSecond = totalSeconds % 60;
		long totalMinutes = totalSeconds / 60;
		long currentMinute = totalMinutes % 60;
		long totalHours = totalMinutes / 60;
		long currentHour = totalHours % 24;
		System.out.println("The time is: " + (currentHour+offset) + ":" + currentMinute + ":" + currentSecond );
	}

}
