package Basics;

public class IncomeTaxSwitch{
	public static void main(String[] args) {
		int i = Integer.parseInt(args[0]);
		int num = 0;
		float tax = 0.0f;
		if(i < 250000)
			num = 1;
		else if(i >= 250001 && i <= 500000)
			num = 2;
		else if(i >= 500001 && i <= 1000000)
			num = 3;
		else 
			num = 4;
			

		switch(num){
		case 1 : tax = 0.0f;
			break;
		case 2 : tax = (i-250000)*0.05f;
		    break;
		case 3 : tax = (250000 * 0.05f) + (i - 500000)*0.2f;
			break;
		case 4 : tax = (250000 * 0.05f) + (500000 * 0.2f) + (i - 1000000)*0.3f;
		    break;	

		}

		System.out.println("Income tax payable Rs "+tax);
	} 

}
	
