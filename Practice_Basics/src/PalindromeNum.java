package Basics;

public class PalindromeNum{
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int temp = n;
		int num = 0;
		int d = 0;
		while(n > 0){
          d = n % 10;
          num = num * 10 + d;
          n /= 10;
		}
		if(num == temp)
			System.out.println("Its Palindrome");	
		else 
			System.out.println("Its Not a Palindrome");
	}
}