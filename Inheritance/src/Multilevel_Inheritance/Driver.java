package Multilevel_Inheritance;

public class Driver {
 public static void main(String[] args) {
	Car c = new Car();
	c.setData("Road", "Four Wheeler");
	c.setFwData("Car", "Petrol");
	c.setCarData("TATA", "Harrier", "White");
	c.getData();
  }
}
