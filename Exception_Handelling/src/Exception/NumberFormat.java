package Exception;

import java.util.Scanner;

public class NumberFormat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String s = sc.nextLine();
        try{
            int a = Integer.parseInt(s);
            System.out.println("String to Integer : "+a);
        }
        catch(NumberFormatException e){
            System.out.println(e);
        }
        finally{
            System.out.printf("operation is complete");
        }
    }
}
