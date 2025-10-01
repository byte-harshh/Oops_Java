package Basics;

public class ArmstrongNum{
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		String num = Integer.toString(n);
		//System.out.println(num);
		int m = n;
		int sum =0;
		while(n > 0){
			int d = n %10;
			sum += Math.pow(d,num.length());
			n = n /10 ;
		}
		if(sum == m)
			System.out.println("It is a Armstrong Number");
		else  
			System.out.println("It is not Armstrong Number");
	}
}