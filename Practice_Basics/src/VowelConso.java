package Basics;

public class VowelConso{
	public static void main(String[] args) {

		//String letter = args[0];
		char ch = args[0].charAt(0);

		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ){
			System.out.println("Its Vowel");
		}
		else if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
			System.out.println("Its Vowel");

		}else{
			System.out.println("Its Consonent");
		}
		
	}
}