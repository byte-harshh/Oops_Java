package Basics;

public class Pangram{
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter Sentence");
		String str = sc.nextLine().toLowerCase().replace(" ","");
		int n = str.length();
		boolean pangram=false;
		for(char ch = 'a';ch<='z';ch++){
			pangram = false;
			for(int i=0;i<n;i++){
               if (ch == str.charAt(i))
               {
               	pangram = true;
               	break;
               }   	
          }
          if (pangram==false){
          	System.out.println("It is not a pangram");
          	break;
          }
		}

		if(pangram)
			System.out.println("It is Pangram");  
   }
}