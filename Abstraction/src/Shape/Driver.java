package Shape;

public class Driver {
    public static void main(String[] args) {
        Shape c = new Circle(55.6);
        c.area();
        System.out.println();
        Shape r = new Rectangle(45.89,96.45);
        r.area();
    }
}
