package Basics;

public class StrongNum{
	static int factorial(int d){
		if(d==0)
			return 1;
        if(d == 1)
        	return 1;
		return d * factorial(d-1);
	}
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int m =n;
		int sum =0;
        while(n>0){
        	int d = n % 10;
            sum += factorial(d);
            n= n/10;
        }
		if(sum == m)
		    System.out.println("Its a Perfect Number");
	    else  
	    	System.out.println("Its not a Perfect Number");
	}
}