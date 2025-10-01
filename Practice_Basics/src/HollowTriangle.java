package Basics;

//Hollow Triangle
public class HollowTriangle{
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		for(int i=0; i<n;i++){
			for(int j=0;j<n-i-1;j++)
				System.out.print(" ");
			for(int j=0;j<=2*i;j++){
				if(j==0 || j==2*i || i==n-1)
					System.out.print("*");
				else 
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}