package Basics;

public class AvgOfListNum{
	public static void main(String[] args) {
		int n = (int)(Math.random()*16);
		int sum = 0;
		for(int i=0; i<=n; i++)
           sum += n;  
       System.out.println("Sum of list of Number = "+sum);
       int avg = sum / 15;
       System.out.println("Average of list of Number = "+ avg);
	}
}