package Basics;

public class PerfectSquare{
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int m = (int)Math.sqrt(n);
		if(m*m == n)
			System.out.println("It is Perfect Square");
		else 
			System.out.println("It is Not Perfect Square");
	}
}