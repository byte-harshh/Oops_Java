package Basics;

public class MatrixSum{
	public static void main(String[] args) {
		int a[][] = new int[3][3];
		int b[][] = new int[3][3];
		int c[][] = new int[3][3];
		for(int i=0;i<a.length;i++){
			for(int j=0;j<b.length;j++){
				a[i][j] =(int)(Math.random()*3);
				b[i][j] =(int)(Math.random()*3);
			}
		}System.out.println("First Matrix");
		for(int i=0;i<a.length;i++){
			for(int j=0;j<b.length;j++)
                 System.out.print(a[i][j]+" ");
             System.out.println();
		}System.out.println("Second Matrix");
        for(int i=0;i<a.length;i++){
			for(int j=0;j<b.length;j++)
                 System.out.print(b[i][j]+" ");
             System.out.println();
		}System.out.println("Addition of Matrices");
        for(int i=0;i<a.length;i++){
			for(int j=0;j<b.length;j++){
			 c[i][j] = a[i][j] + b[i][j];
                System.out.print(c[i][j]+" ");
             }    
             System.out.println();
		}
	}
}