package Basics;

class AdvancedCalculator{
	private double a;
	private double b;
	private char  ch;
	AdvancedCalculator(double a,double b,char ch){
		this.a = a;
		this.b = b;
		this.ch = ch;
	}
	public double Calculation(double a,double b,char ch){
		switch(ch){
            case 'A' : System.out.print("Addition = ");
            	       return a+b;
            case 'S' : System.out.print("Substraction = ");
                       return a-b;
            case 'M' : System.out.print("Multiplication = ");
            	       return a*b;
            case 'D' : System.out.print("Division = ");
            	       return a/b;
            case 'N' : System.out.print("Modulus = ");
            	       return a%b;
            default :  System.out.println("Invalid Entry");
                       return 0;            	
		}
	}
	public void display(){
		System.out.println(Calculation(a,b,ch));
	}
}
public class CalculatorH{
	public static void main(String[] args) {
		AdvancedCalculator c = new AdvancedCalculator(456,897,'A');
		c.display();
	    AdvancedCalculator d = new AdvancedCalculator(9258,897,'S');
		d.display();
		AdvancedCalculator e = new AdvancedCalculator(74185,897,'D');
		e.display();
		AdvancedCalculator f = new AdvancedCalculator(456,897,'M');
		f.display();
		AdvancedCalculator g = new AdvancedCalculator(4596,897,'N');
		g.display();
	}
}