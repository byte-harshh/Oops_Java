package Basics;

public class PowerOfNum{
	public static void main(String[] args) {
		int number = Integer.parseInt(args[0]);
	    int	power = Integer.parseInt(args[1]);
		int product = 1;
		for(int i = 0; i<power; i++){
			product *= number;
		}
		System.out.println("Output is "+product);
	}
}