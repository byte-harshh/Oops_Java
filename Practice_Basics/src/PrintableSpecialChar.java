package Basics;

public class PrintableSpecialChar{
	public static void main(String[] args) {
		for(int i = 0; i<127; i++){
			if((i>=33 && i<=47) || (i>=58 && i<=64) || (i>=91 && i<=96) || (i>=123 && i<=126)){
				System.out.print((char)i + " ");
			}
			// else{
			// 	System.out.print((char)i + " ");
			// }
		}
	}
}