package Exception;

import java.util.Scanner;

public class Arithmatic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("Enter 1st integer : ");
            int a = sc.nextInt();
            System.out.print("Enter 2nd  integer : ");
            int b = sc.nextInt();
            int div = a/b;
            System.out.println("Division = "+div);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        finally {
            System.out.println("operation is complete");
        }
    }
}
