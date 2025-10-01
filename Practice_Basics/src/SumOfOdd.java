package Basics;

public class SumOfOdd{
	public static void main(String[] args) {
		int sum = 0;
		for(int i=1; i<=50; i=i+2){
               sum += i;
		}
		System.out.println("Sum of all odd Number from 1-50 is "+ sum);
	}
}