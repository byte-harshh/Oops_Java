package Basics;

public class Prime{
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int counter = 0;
		for(int i=1; i<=n/2; i++){
			if(n%i == 0)
				counter++;
		}
		if(counter==1)
			System.out.println("Its Prime");
		else 
			System.out.println("Its not Prime");
	}
}