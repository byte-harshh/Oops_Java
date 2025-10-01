package Basics;

import java.util.Arrays;
public class ArraySort{
	public static void main(String[] args) {
		int arr[] = new int[10];
		System.out.println("Unsorted Array");
		for(int i=0;i<arr.length;i++){
			arr[i] = (int)(Math.random()*11);
			System.out.print(arr[i]+" ");
		}
		System.out.println("\nSorted Array");
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}
}