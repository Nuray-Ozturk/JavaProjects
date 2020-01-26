package Class15;

public class array {

	public static void main(String[] args) {
		
		 //hw small to largest
		 //write a program to sort array element in ascending order
		 //output should be 0 2 
		//comparision is less than element	
		
		 int numbers[]= {14,56,37,0,23,9,2,80,67};

		int min=numbers[0];
		 for( int i= 0 ;i<numbers.length;i++) {
	if (numbers[i] <min) { 
       min = numbers[i]; 
}
		 }
	System.out.println(min);
	
	}}



