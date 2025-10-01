package Basics;

public class RandomNum{
	public static void main(String[] args) {                                      

	 //--- Exclusive = excluding end ---//
		
		//System.out.println(Math.random());          // 0 to 0.9
		//int r = (int)(Math.random());               // 0
		//int r = (int)(Math.random()*10);            // 0 to 9
		//int r = 1 + (int)(Math.random()*10);        // 1 to 10
		//int r = 1 + (int)(Math.random()*100);       // 1 to 100
	    //int r = 11 + (int)(Math.random()*89);       // 11 to 100   >> 11-99
	    //int r = 100 + (int)(Math.random()*100);     // 100 to 200  >> 100-199
	    //int r = 101 + (int)(Math.random()*400);     // 101 to 500  >> 101-499
	    //int r = 250 + (int)(Math.random()*250);     // 250 to 500  >> 250-499
		//int r = 1 + (int)(Math.random()*1000);      // 1 to 1000   >> 1-999
		//int r = 501 + (int)(Math.random()*500);     // 501 to 1000 >> 501-999
		
    //--- Inclusive = including end ---//
                                       
		int r = 500 + (int)(Math.random()*251);       // 500 to 750  >> 500-750
	    System.out.println(r); 

        }
	}
