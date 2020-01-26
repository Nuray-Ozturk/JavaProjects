package class6homework;
import java.util.Scanner;
public class Assignment4 {

	public static void main(String[] args) {
		//a simple calculator 
		//If division is requested and the second number is 0, output Division by 0!
        //If no valid operator is present, output Unknown operator.
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter two numbers:");
		
		double first =sc.nextDouble();
		double second=sc.nextDouble();
		System.out.println("Enter an operator(+,-,*,/)");
		String operator =sc.next();
		
		double result;
		switch(operator) {
		
		case "+":
				result=first+second;
		System.out.println(result);
		break;
		case "-":
			result=first-second;
			System.out.println(result);
		break;
		case"*":
			result=first*second;
		    System.out.println(result);
		break;
		case"/":
			result=first/second;
			System.out.println(result);
			if(second==0) {
				System.out.println("result=0");
			}
		break;
		default: 
			System.out.println("Unknown operator");
			return;
		
		}

	}

}
