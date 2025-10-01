package Basics;

public class Gcd_TwoNum{
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int max = 0;
		if(a>b){
			for(int i = 1; i<=a; i++){
				if(a % i == 0 && b % i == 0)
					if(max < i)
						max = i;
			}	
			System.out.println("GCD of No."+max);
		}
		else{ 
			for(int i = 1; i<=a; i++){
				if(a % i == 0 && b % i == 0)
					if(max < i)
						max = i;
			}	
			System.out.println("GCD of No."+max);
		}
	}
}
