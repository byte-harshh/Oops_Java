package Multilevel_Inheritance;

public class FourWheeler extends Vehicle {
   protected String type;
   protected String fuelTank;
   
   public void setFwData(String type,String fuelTank){
	   this.type = type;
	   this.fuelTank = fuelTank;
   }
   @Override
   public void getData() {
	   super.getData();
	   System.out.println("Type of four wheeler : "+type);
	   System.out.println("Fuel Tank : "+fuelTank);
   }
}
