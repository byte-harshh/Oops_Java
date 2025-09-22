package Box;

public class Box3d extends Box{
	private double h;
	public Box3d(double l, double b, double h) {
		super(l,b);
		this.h = h;
	}
	public double volume() {
		return l* b * h;
	}

}
