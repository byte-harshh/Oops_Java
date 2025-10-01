package Basics;

public class Largest{
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		/*if(a > b && a > c){
			System.out.println(a +" is Largest Number");
		}
		else if(b > c){
			System.out.println(b + " is Largest Number");
		}else{
			System.out.println(c + " is Largest Number");
		}*/

		int largest = (a>b && a>c)?a:(b>c?b:c);                 //Using Ternary Operator
		System.out.println("Largest Number is "+largest);
	}
}