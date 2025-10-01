package Basics;

//Triangle Star Pattern
public class TriangleStarPattern{
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		for(int i=1;i<n;i++){     //row
			for(int j=1; j<=n-i;j++) //space
				System.out.print(" ");
			for(int j=1;j<=i;j++)     //star
				System.out.print("* ");
			System.out.println();
		}
	}
}