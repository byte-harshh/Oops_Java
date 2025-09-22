package Multilevel_Inheritance;

public class Vehicle {
  protected String medium;
  protected String type;

public void setData(String medium,String type ) {
	this.medium = medium;
	this.type = type;
}
public void getData() {
	System.out.println("Entered Medium : "+medium);
	System.out.println("Entered Type : "+type);
  }
}
