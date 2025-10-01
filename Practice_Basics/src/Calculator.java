package Basics;

public class Calculator{
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		char ch = args[2].charAt(0);
		switch(ch){
		case '+' : System.out.println("Addition = "+ (a+b));
		             break;	
		case '-' : System.out.println("Substraction = "+ (a-b));
		             break;	
		case 'M' : System.out.println("Multiplication = "+ (a*b));
		             break;
		case '/' : System.out.println("Division = "+ (a/b));
		             break;	
		case '%' : System.out.println("Modulo = "+ (a%b));
		             break;	
		default : System.out.println("You entered Wrong Operator");	
		}
	}
}