package class14;

public class exampleformat {

	public static void main(String[] args) {
		String companyName="SprintQA";
		String trainerName="xyz";
		String title="Welcome to %s! this is from %s";
		System.out.println(String.format(title, companyName,trainerName));

	   String str8= "Amozon";
	   String str9= "SprintQA";
	   String str10= "Amozon";
	   System.out.println(str8.compareTo(str9));
	   System.out.println(str9.compareTo(str8));
	System.out.println(str8.compareTo(str10));
	  
	
	
	System.out.println("=======Split======");
	String str11 = "Welcome -to-SprintQA";
	String str12= "Welcome to SprintQA! This is Chirag from SprintQA";
	
	
	String[] words= str11.split("-");
	System.out.println(words[0]);
	System.out.println();// count number of the words inside the sentence
	
	}

}
