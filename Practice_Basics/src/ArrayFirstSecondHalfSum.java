package Basics;

public class ArrayFirstSecondHalfSum{
	public static void main(String[] args) {
		int fsum = 0;
		int ssum = 0;
		int n[] = new int[10];
		System.out.println("Array generated");
		for(int i=0;i<n.length;i++){
			n[i] = (int)(Math.random()*11);
			System.out.print(n[i]+" ");
		}
		for(int i=0;i<n.length/2;i++)
			fsum += n[i];
		for(int i=n.length/2;i<n.length;i++)
			ssum += n[i];
		System.out.println();
		System.out.println("Sum of 1st Half Array = "+fsum);
		System.out.println("Sum of 2nd Half Array = "+ssum);
	}
}