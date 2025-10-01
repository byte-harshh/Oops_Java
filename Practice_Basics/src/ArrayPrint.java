package Basics;

public class ArrayPrint{
	public static void main(String[] args) {
		int arr[] = new int[10];
		System.out.println("Enter Array Element");
		java.util.Scanner sc = new java.util.Scanner(System.in);
		for(int i=0;i<arr.length;i++)
			arr[i] = sc.nextInt();
		System.out.println("Array given Below");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}
}