package class6homework;
import java.util.Scanner;
public class Assignment5 {

	public static void main(String[] args) {
		// a person must be at least 18 years old and not more than 60 years old. 
		//take user’s age as input and outputs if he/she is eligible for work.

		int age;
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter your age:");
		age=sc.nextInt();
		
		if(age<18) {
			System.out.println("You are minor");
			System.out.println("You are not eligible to work");
		}else {
			if(age>=18 && age<=60) {
				System.out.println("You are eligible to work");
				System.out.println("Please fill in your details and apply");
			}else {
				System.out.println("You are too old to work");
			}
		}
	}

}
