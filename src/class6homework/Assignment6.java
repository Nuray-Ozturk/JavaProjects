
package class6homework;
import java.util.Scanner;
public class Assignment6 {

	public static void main(String[] args) {
		// Game with coins
	Scanner sc= new Scanner(System.in);	
	float pound, over, under;
	int fifties,twenties,ten, five, two, one;
	System.out.println("How many fifties:");
	fifties = sc.nextInt();
	
	System.out.println("How many twenties:");
	twenties = sc.nextInt();
	
	System.out.println("How many ten:");
	ten = sc.nextInt();
	
	System.out.println("How many five:");
	five = sc.nextInt();
	
	System.out.println("How many two:");
	two =sc.nextInt();
	
	System.out.println("How many one:");
	one = sc.nextInt();
	
	pound = (float) (fifties* 0.5)
	       +(float) (twenties*0.2)
	       +(float) (ten*0.1)
	       +(float) (five*0.05)
           +(float) (two*0.02)
           +(float) (one*0.01);
	if(pound==1.0) {
		System.out.println("you got"+pound);
	}
	else if(pound<1.0) {
		under= (float) (1.0-pound);
		System.out.println("you went under"+under);
	}
	else if(pound>1.0) {
		over =(float) (pound-1.0);
		System.out.println("you went over"+over);
	
		
		
		
		
		
	}
	}

}
