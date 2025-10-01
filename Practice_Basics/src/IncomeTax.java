package Basics;

public class IncomeTax{
	//Using Else if Ladder
	public static void main(String[] args) {
		int i = Integer.parseInt(args[0]);
		float tax = 0.0f;
		if(i < 250000)
			tax = 0.0f;
		else if(i >= 250001 && i <= 500000)
			tax = i*0.05f;
		else if(i >= 500001 && i <= 1000000)
			tax = (500000 * 0.05f) + (i - 500000)*0.2f;
		else 
			tax = (500000 * 0.05f) + (500000 * 0.2f) + (i - 1000000)*0.3f;

		System.out.println("Income tax payable Rs "+tax);
	} 


}