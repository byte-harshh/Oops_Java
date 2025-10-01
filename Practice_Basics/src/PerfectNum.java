package Basics;

public class PerfectNum{
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int p = 1;
		for(int i=1; i<n; i++){
			if(n % i == 0)
				p *= i;
		}
		if(p == n)
			System.out.println("It is a Perfect Number");
		else  
			System.out.println("It is Not a Perfect Number");
	}
}