package Multilevel_Inheritance;

public class Car extends FourWheeler {
   private String brand;
   private String model;
   private String color;
public void setCarData(String brand,String model,String color){
	this.brand = brand;
	this.model = model;
	this.color = color;
  }
@Override
public void getData() {
	super.getData();
	System.out.println("Brand : "+brand);
	System.out.println("Model : "+model);
	System.out.println("Colour : "+color);
}
}
