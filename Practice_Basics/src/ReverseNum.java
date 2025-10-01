package Basics;

public class ReverseNum{
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int rev = 0;
		while(n != 0){
          int p = n % 10;
          rev = rev * 10 + p;
          n=n/10; 
		}
		System.out.println(rev);
	}
}