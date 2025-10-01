package Basics;

public class MatrixMult{
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("Enter row of 1st Matrix : ");
		int r1 = sc.nextInt();
		System.out.print("Enter column of 1st Matrix : ");
		int c1 = sc.nextInt();
		System.out.print("Enter row of 2nd Matrix : ");
		int r2 = sc.nextInt();
		System.out.print("Enter column of 2nd Matrix : ");
		int c2 = sc.nextInt();
		if(c1!=r2){
			System.out.println("Multiplication Not Possible");
			return;
		}
		int a[][] = new int[r1][c1];
		int b[][] = new int[r2][c2];
		int c[][] = new int[r1][c2];
		System.out.println("enter elements of 1st matrix");
		for(int i=0;i<r1;i++){
			for(int j=0;j<c1;j++)
				a[i][j] = sc.nextInt();
		}System.out.println("enter elements of 2nd matrix");
		for(int i=0;i<r2;i++){
			for(int j=0;j<c2;j++)        
				b[i][j]= sc.nextInt();
		}for(int i=0;i<r1;i++){
			for(int j=0;j<c2;j++){        
				for(int k=0;k<c1;k++){         //c1==r2
					c[i][j] += a[i][k]*b[k][j];
				}
			}
		}System.out.println("Resultant Matrix");
		for(int i=0;i<r1;i++){
			for(int j=0;j<c2;j++)
				System.out.print(c[i][j]+" ");
			System.out.println();
	}
}}