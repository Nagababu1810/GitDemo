package javaPrograms;

public class AlphabetCheck {

	public static void main(String[] args) {
		
		char c='j';
		
		if((c>='a' && c<='z') ||(c>='A' && c<='Z')) {
			System.out.println(c + " is an alphabet");
		}
		else
			System.out.println(c + " is not an alphabet");
		

	}

}