package Exception;

import java.util.Scanner;

public class ArrayIndex {
    public static void main(String[] args) {
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        try {
            for (int i = 0; i <= 5; i++)
                arr[i] = sc.nextInt();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } finally {
            System.out.println("operation is complete");
        }
    }
}