package Basics;

public class ArrayNthLargestSmallest{
	public static void main(String[] args){
	java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("Enter a Number = ");
		int a = sc.nextInt();
		int n[] = new int[10];
		int b = 0;
		if(a<0 && a>n.length)
			System.out.println("Try again");
		System.out.println("Given Array element are");
        for(int i=0;i<n.length;i++){
        	n[i] = (int)(Math.random()*11);
        	System.out.print(n[i]+" ");
        }
        System.out.println();
        System.out.println("Sorted Array");
        java.util.Arrays.sort(n);
        for(int i =0; i<n.length;i++)
        	System.out.print(n[i]+" ");
        for(int i=0;i<n.length;i++){
        	a = n[a-1];
        	b = n[n.length-a];
        	System.out.println();
        	System.out.println("Smallest element is "+a);
        	System.out.println("Largest element is "+b);
        	break;
        }

	}  
}