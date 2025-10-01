package Basics;

public class Hypotenuse{
	public static void main(String[] harsh) {
		int a = Integer.parseInt(harsh[0]);
		int b = Integer.parseInt(harsh[1]);
		double c = Math.sqrt(a*a + b*b);
		System.out.println("Hypotenuse of Triangle = "+ c);
	}
}