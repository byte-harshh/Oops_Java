package Basics;

//Hollow Diamond
public class HollowDiamond{
	public static void main(String[] args) {
       int n = Integer.parseInt(args[0]);
       for(int i=0; i<n;i++){
          for(int j=0; j<=n-i-1;j++)
          	System.out.print(" ");
          for(int j=0;j<=2*i;j++){
            if(j==0 || j==2*i)
            System.out.print("*");
            else 
            System.out.print(" ");            	
          }
        System.out.println();
       }
      for(int i=n; i>=0;i--){
          for(int j=0; j<=n-i-1;j++)
          	System.out.print(" ");
          for(int j=0;j<=2*i;j++){
            if(j==0 || j==2*i)
            System.out.print("*");
            else 
            System.out.print(" ");            	
          }
        System.out.println();
       }
	}
}
