package Class16;

public class example {

	public static void main(String[] args) {
		

		//swapping of two number-numbers[indexOfMin
		 int numbers[]= {14,56,37,0,23,9,2,80,67},min=0,temp=0,indexOfMin=0; 
       
		
		 for(int i=0;i<numbers.length-1;i++) {
			 min=numbers[i];
		 for(int j=i;j<numbers.length;j++) {
		 if (numbers[j]<min) {
			 min=numbers[j];
			 indexOfMin = j;
		 }}
		  temp = numbers[indexOfMin];
        numbers[indexOfMin]=numbers[i];
        numbers[i]=temp;

        }
   for(int i=0; i<numbers.length;i++) {
     System.out.println(numbers[i]);
	}

}}
