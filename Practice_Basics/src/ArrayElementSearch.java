package Basics;

public class ArrayElementSearch{
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int arr[] = new int[10];
		boolean found = false;
		for(int i=0;i<arr.length;i++){
			arr[i]=(int)(Math.random()*11);
			System.out.print(arr[i]+" ");
	    }
	    for(int i=0;i<arr.length;i++){
	    	if(n == arr[i]){
	    		System.out.println("\nFound at index "+i);
	    		found = true;
	    		break;
	    	}	
	    }
	    if(!found)
	    	System.out.println("Not Found try again");
	}
}