package class6homework;
import java.util.Scanner;
public class Assignment1 {

	public static void main(String[] args) {
			// light travel per second 186000miles
			//how much miles travels in 100 days
			
		   Scanner sc =new Scanner(System.in);
		   System.out.println("Enter Number of Day");
		   int day =sc.nextInt();
			long miles =day*24*60*60*186000L;
			
			System.out.println("In" + day + "days,light will travel about" + miles+ "miles");

		

	}

}
