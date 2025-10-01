package Basics;

public class SumOfEven{
	public static void main(String[] args) {
		int sum = 0;
		for(int i=0; i<=50; i=i+2){
               sum += i;
		}
		System.out.println("Sum of all Even Number from 1-50 is "+ sum);
	}
}