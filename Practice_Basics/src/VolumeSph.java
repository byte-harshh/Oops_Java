package Basics;

public class VolumeSph{
	public static void main(String[] args) {
		double r = Double.parseDouble(args[0]);
		double v = (4/3)*3.14* Math.pow(r,3);
		System.out.println("Volume of Sphere = "+ v); 
	}
}
