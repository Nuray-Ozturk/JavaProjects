package Class15;

public class arrayexample2D {

	public static void main(String[] args) {
		// Transpose of matrix
		//1 4 7
		//2 5 8
		//3 6 9
		int numbers[][]= {{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		for(int i=0;i<numbers.length;i++) {
			for(int j=0;j<numbers[i].length;j++) {
				System.out.print(numbers[i][j]+" ");
			}
			
			System.out.println();
		
		}
		}

	}


