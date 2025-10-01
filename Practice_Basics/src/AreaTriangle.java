package Basics;

public class AreaTriangle{
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
	    int c = Integer.parseInt(args[2]);
		double s = (a+b+c)/2;
		double area = Math.sqrt(s*(s-a)*(s-b)*(s-c)); 
		System.out.println("Semiperimeter  of triangle = "+ s);
		System.out.println("Area of Triangle = "+ area);
	} 
}
