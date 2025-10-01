package Basics;

public class PrintTable{
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		for(int i=1; i<=10; i++){
           System.out.println(n+" X "+i+ "="+ n*i);
	}
 }
}