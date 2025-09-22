package Exception;
import java.util.Scanner;
public class NestedBlock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            try{
                System.out.print("Enter first no. : ");
                int a = sc.nextInt();
                System.out.print("Enter second no. : ");
                int b = sc.nextInt();
                int div = a/b;
                System.out.println("Division : "+div);
            }
            catch(ArithmeticException e){
                System.out.println(e);
            }
            try {
                int arr[] = new int[5];
                System.out.println("Enter elements in array ");
                for (int i = 0; i <= 5; i++)
                    arr[i] = sc.nextInt();

            }
            catch(ArrayIndexOutOfBoundsException f){
                System.out.println(f);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            System.out.println("completion of the operation");
        }
    }
}
