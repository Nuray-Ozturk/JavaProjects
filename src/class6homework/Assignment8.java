package class6homework;
import java.util.Scanner;
public class Assignment8 {

	public static void main(String[] args) {
		// at least $40,000 and for at least 2 years working
		//Note: Use the logical operators 
        //take user’ salary & experience
	
	float salary, years;
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter salary");
	 System.out.println("Enter years of experience");
	
	salary=sc.nextFloat();
	years=sc.nextFloat();
	
	if( salary>= 40000 && years>=2);
	{ System.out.println("Congratulations! You are qualified for a loan");
	
	}

}}
