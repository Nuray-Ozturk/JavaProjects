package class6homework;
import java.util.Scanner;
public class Assignment2 {

	public static void main(String[] args) {
		//  $800 a week. Salespeople who exceed 10 sales get an additional bonus of $200.
		// which extra sales as input from the user and calculate total salary in a week.
       
	    int n, pay=800,sales=200;
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Number of sales");
		n=sc.nextInt();
		if(n>10) {
	
	   System.out.println("Total a week="+(pay+sales)+" pound");
		}else{
			System.out.println("Payment = "+ pay  + " pound. "+ "No bonus.");
		
	}
	}
}
