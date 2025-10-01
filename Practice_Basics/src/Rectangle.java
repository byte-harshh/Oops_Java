package Basics;

public class Rectangle{
	private double length;
	private double width;
	Rectangle(){
		System.out.println("Area of Rectangle and Perimeter given Below :");
	}
	Rectangle(double length,double width){
		this();
		this.length = length;
		this.width = width;
	}
	public double areaRectangle(double length,double width){
		return length*width;
	}
	public double perimeterRectangle(double length,double width){
		return 2*(length+width); 
	}
	public void display(){
		System.out.println("Area of Rectangle : "+ areaRectangle(length,width));
		System.out.println("Perimeter of Rectangle : "+ perimeterRectangle(length,width));
	}
}
class Main{
	public static void main(String[] args) {
		Rectangle r = new Rectangle(45.5,88.9);
		r.display();
	}
}
