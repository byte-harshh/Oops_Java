package Basics;

public class GradingSystem{
	//using else if Ladder
	/*public static void main(String[] args) {
		int m = Integer.parseInt(args[0]);
		if(m >= 90)
			System.out.println("A");
		else if(m >= 80 && m <=89)
			System.out.println("B");
		else if(m >= 70 && m <= 79)
			System.out.println("C");
		else if(m >= 60 && m<= 69)
			System.out.println("D");
		else
			System.out.println("F");
	}*/
 
 //Using Switch 
	public static void main(String[] args) {
		int m = Integer.parseInt(args[0]);
		switch(m/10){
		case 10:
		case 9: System.out.println("A");
			break;
		case 8: System.out.println("B");
		    break;
		case 7: System.out.println("C");
		    break;
		case 6: System.out.println("D");
		    break;
		default :System.out.println("F");            	
		}
	}
}