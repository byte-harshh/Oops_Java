package Basics;

public class EvenOdd{
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		if(n % 2 == 0)
			System.out.println("Its Even Number");
		else
			System.out.println("Its Odd Number");
	}
}