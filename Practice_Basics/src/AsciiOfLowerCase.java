package Basics;

public class AsciiOfLowerCase{
	public static void main(String[] args) {
		char ch = args[0].charAt(0);
		char lower = Character.toLowerCase(ch);
		int num = (int)lower;
		System.out.println("ASCII value is "+num);
	}
}