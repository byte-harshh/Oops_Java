package Basics;

public class CompoundInt{
	public static void main(String[] args) {
		double p = Double.parseDouble(args[0]);
		double r = Double.parseDouble(args[1]);
		double t = Double.parseDouble(args[2]);
		double n = Double.parseDouble(args[3]);
		double a = p * Math.pow((1 + r/n),(n*t));
		double ci = a - p;
		System.out.println("Compound Intrest = "+ ci);
	}
} 