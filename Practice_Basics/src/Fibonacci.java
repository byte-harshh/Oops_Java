package Basics;

public class Fibonacci{
public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int first = 0, second = 1 ,next = 0;

	/*	for(int i =0; i<=n; i++){
	    if(i == 1)
		System.out.print(0+" ");
		if(i == 2)
		System.out.print(1+ " ");
        if(i > 2){
            next = first + second;
			first = second;
			second = next;
			System.out.print(next+ " ");
		}
     }*/ 

     for(int i =0; i<n; i++){
     	System.out.print(first+" ");
     	next = first + second;
     	first = second;
     	second = next;
     }
}
}
