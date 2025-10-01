package Basics;

public class DiagonalSumArray{
	public static void main(String[] args){
		int psum = 0;
		int nsum = 0;
		int a[][] = new int[3][3];
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length;j++)
				a[i][j] = (int)(Math.random()*3);
		}System.out.println("Generated Matrix is ");
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length;j++)
				System.out.print(a[i][j]+" ");
			System.out.println();
		}
		for(int i=0;i<a.length;i++){
			psum += a[i][i];
			nsum += a[i][a.length-i-1];
			}
		System.out.println("Sum of Element of Primary Diagonal = "+psum);
		System.out.println("Sum of Element of Secondary Diagonal = "+nsum);	
		System.out.println("Sum of Element of Both Diagonal = "+ (psum+nsum));

		}				
}
	

