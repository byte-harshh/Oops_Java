package Basics;

public class ElectricityBill{

//using Else if Ladder	
	/*public static void main(String[] args) {
		int units = Integer.parseInt(args[0]);
		int bill = 0;
		if(units <= 100){
			bill = (units * 5);
			System.out.println("Rs."+bill);
		}
		else if(units >= 101 && units <= 200){
			bill = (100 * 5) + (units - 100)*6;
			System.out.println("Rs."+bill);
		}
		else if(units >= 201 && units <= 300){
			bill = (100 * 5) + (100 * 6) + (units - 200)*7;
			System.out.println("Rs."+bill);
		}
		else {
			bill = (100 * 5) + (100 * 6) + (100 * 7) + (units - 300)*8;
			System.out.println("Rs."+bill);
		}
	}*/

	//Using Switch
   public static void main(String[] args) {
   	int units = Integer.parseInt(args[0]);
   	int bill = 0;
   	switch(units/100){
   	case 0: bill = (units * 5);
			break;
   	case 1:	bill = (100 * 5) + (units - 100)*6;
			break;
    case 2: bill = (100 * 5) + (100 * 6) + (units - 200)*7;
            break;
    default: bill =(100 * 5) + (100 * 6) + (100 * 7) + (units - 300)*8;
                  		
   	}
   	System.out.println("Rs."+bill);
   }
}

