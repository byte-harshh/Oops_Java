package Basics;

public class AsciiOfUpperCase{
	public static void main(String[] args) {
		char ch = args[0].charAt(0);
		char upper = Character.toUpperCase(ch);
		int num = (int)upper;
		System.out.println("ASCII value is "+num);
	}
}