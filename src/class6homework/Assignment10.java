package class6homework;
import java.util.Scanner;
public class Assignment10 {

	public static void main(String[] args) {
		// asks what is user's grade. 
		//If grade is A,print Excellent.If B print "Good".
		//If C print Average. If E, then print "Bad"
		Scanner sc =new Scanner(System.in);
		System.out.println("What is your grade?");
		char grade= sc.next().charAt(0);
		
		switch(grade){
			
		case 'A':
			
			System.out.println("Excellent");
		break;
		case'B':
			
			System.out.println("Good");
		break;
		case'C':
			
			System.out.println("Avarage");
		break;
		case'E':
			
			System.out.println("Bad");
		break;
		default:
			System.out.print("Please enter grade letters A,B,C or E");
		
		}
		
	
	}

}
  