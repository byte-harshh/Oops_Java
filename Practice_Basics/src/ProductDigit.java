package Basics;

public class ProductDigit{
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int prod = 1;
		while(n > 0){
          int r = n % 10;
          prod *= r;
          n /=10;
		}
		System.out.println("Product of digit = "+prod);
	}
}