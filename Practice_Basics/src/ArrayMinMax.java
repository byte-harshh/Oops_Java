package Basics;

public class ArrayMinMax{
	public static void main(String[] args) {
		int arr[]=new int[10];
		System.out.println("Elements of array are ");
		for(int i=0; i<arr.length;i++){
			arr[i] = (int)(Math.random()*11);
			System.out.print(arr[i]+" ");}
		    int min = arr[0];
			int max = arr[0];
		for(int i=0;i<arr.length;i++){
			if(arr[i]<min)
				min = arr[i];
			if(arr[i]>max)
				max = arr[i];
		}System.out.println("\nMinimum element = "+min);
		 System.out.println("Maximum element ="+max);
	}
}
