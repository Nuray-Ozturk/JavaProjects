package class6homework;
import java.util.Scanner;
public class Assignment3 {

	public static void main(String[] args) {
		// 1 – square, 2 – circle, 3 – triangle, 4 – rhombus)
       //If number does not correspond to any of the listed shapes, There is no such shape!.
	
		int n;
		Scanner sc= new Scanner(System.in);
      System.out.println("Sample Input");
      n= sc.nextInt();
      if(n==1) {
    	  System.out.println(" You have chosen a square");
      }
    	  else if(n==2) {
    	 System.out.println(" You have chosen a circle");
    	  }
    	  else if(n==3) {
    	 System.out.println(" You have chosen a triangle");
    	  }
    	else if(n==4) {
    	 System.out.println(" You have chosen a rhumbos");
    		  }
    	else {
    		System.out.println("There is no such a shape");
	
	}
	

}
}