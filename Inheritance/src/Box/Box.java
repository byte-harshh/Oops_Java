package Box;
public class Box{
	protected double l;
	protected double b;
	public Box(double l,double b) {
		this.l = l;
		this.b = b;
	}
	public double area() {
		return l * b;
	}

}
