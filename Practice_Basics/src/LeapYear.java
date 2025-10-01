package Basics;

public class LeapYear{
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		if(n % 4 == 0 && n % 100 != 0){
			System.out.println("Leap Year");
		    }

			else if(n % 400 == 0 ){
				System.out.println("Leap Year");
			}

			else{
				System.out.println("It is not a Leap Year");
			}
		}    
	}
