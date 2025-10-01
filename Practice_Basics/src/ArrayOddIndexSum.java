package Basics;

public class ArrayOddIndexSum{
	public static void main(String[] args) {
		int arr[] = new int[10];
		int sumOdd = 0;
		System.out.println("Array elements are");
		for(int i=0;i<arr.length;i++){
			arr[i] = (int)(Math.random()*11);
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(int i=1;i<arr.length;i=i+2)
			sumOdd += arr[i]*arr[i];
		System.out.println("Sum of Square of Odd Index element = "+sumOdd);	
	}
}