package Basics;

public class SumOfDigit{
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int sum = 0;
		while(n>0){
			int d = n % 10;
			sum += d;
			n = n/10;
		}
		if(sum < 10)
			System.out.println(sum);
		else 
			System.out.println("Not a single digit sum");
	}
}