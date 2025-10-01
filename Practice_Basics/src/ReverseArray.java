package Basics;

public class ReverseArray{
	public static void main(String[] args) {
		int arr[] = new int[10];
		System.out.println("Given Array");
		for(int i=0;i<arr.length;i++){
			arr[i] = (int)(Math.random()*11);
			System.out.print(arr[i]+" ");
		}
		System.out.println("\nReverse of Array");
		for(int i=arr.length-1;i>=0;i--)
			System.out.print(arr[i]+" ");
	}
}