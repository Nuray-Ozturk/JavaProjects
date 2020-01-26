package class6homework;
import java.util.Scanner;
public class Assignment9 {

	public static void main(String[] args) {
		// Temperature
		Scanner sc=new Scanner(System.in);
		int temp =sc. nextInt();
		
		if (temp >=100) {
			System.out.println("Stay inside it's too hot ");
		}if( temp>50 && temp<99) {
			System.out.println("Wear winter clothes");
		}if(temp>30 && temp<49) {
			System.out.println("Wear winter clothes");
		}if(temp>10 && temp<29) {
		    System.out.println("Stay inside it's too cold");
		}else{
			System.out.println("Call for help it's too cold outside");
		
		
			
		}

	}

}
