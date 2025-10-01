package Basics;

public class TrafficLight{
	public static void main(String[] args) {
		char ch = args[0].charAt(0);
		switch(ch){
		case 'R' : System.out.println("STOP");
			break;
		case 'Y' : System.out.println("WAIT");
			break;
		case 'G' : System.out.println("GO");
			break;	
		default : System.out.println("You Entered Wrong Letter");	
		}
	}
}