package Basics;

public class ArraySumAvg{
	public static void main(String[] args) {
		int sum =0;
		int arr[] = new int[10];
		for(int i=0; i<arr.length;i++){
            arr[i]=(int)(Math.random()*11);
            System.out.print(arr[i]+" ");
            sum += arr[i];
		}
    System.out.println("\nSum of Array element = "+sum);
	System.out.println("Avg of Array element = "+sum/(double)arr.length);
	}
}