package Basics;

public class PalindromeString{
	public static void main(String[] args) {
	String str = args[0];
	boolean prime = true;
	int n = str.length();
	for(int i = 0; i<n/2; i++){
         if(str.charAt(i) != str.charAt(n-1-i))
            prime = false;
	 }
	 if(prime)
	 	System.out.println("It is Palindrome");
	 else  
	 	System.out.println("It is not Palindrome");
	}
}