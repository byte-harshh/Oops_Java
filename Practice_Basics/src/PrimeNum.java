package Basics;

public class PrimeNum{
	public static void main(String[] args) {
		for(int i=2;i<=100;i++){
			int counter = 1;
			for(int j=2;j<=i/2; j++){
               if(i % j == 0){
               	counter = 0;
               	break;
              }
			}
			if(counter == 1)
			   System.out.print(" "+i);
		}
	}
}