package Class15;

public class hw {

	public static void main(String[] args) {
		String str= "This is string program we learning from java concept";
char c='t';
//write a program to print frequency if given char
	int count=0;
	for(int i=0;i<str.length();i++) {
		if(str.toLowerCase().charAt(i)==c) {
			count++;
		}
	
	}
	System.out.println(count);
	
	}

}
