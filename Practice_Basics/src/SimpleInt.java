package Basics;

public class SimpleInt{
	public static void main(String[] args) {
		double p = Double.parseDouble(args[0]);
		double r = Double.parseDouble(args[1]);
		double t = Double.parseDouble(args[2]);
		double s = (p*r*t)/100;
		System.out.println("Simple Intrest = "+ s);
	}
}