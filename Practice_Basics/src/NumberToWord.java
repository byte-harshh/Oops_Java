package Basics;

public class NumberToWord{
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		switch(n){
		case 0 : System.out.println(n +"-> Zero");
		break; 
		case 1 : System.out.println(n +"-> One");
		break; 
		case 2 : System.out.println(n +"-> Two");
		break; 
		case 3 : System.out.println(n +"-> Three");
		break; 
		case 4 : System.out.println(n +"-> Four");
		break; 
		case 5 : System.out.println(n +"-> Five");
		break; 
	    default : System.out.println("You entered wrong number");
		}
	}
}