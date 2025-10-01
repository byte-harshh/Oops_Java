package Basics;

public class Celsius{
	public static void main(String[] args) {
		// System.out.println("Enter Degree Celsius = ");
		double c = Double.parseDouble(args[0]);
		double f = (c*9/5) + 32;
		System.out.println("Fahrenheit = "+ f); 
	}
}