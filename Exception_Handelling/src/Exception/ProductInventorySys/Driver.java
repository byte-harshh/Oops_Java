package Exception.ProductInventorySys;

public class Driver {
    public static void main(String[] args) throws OutOfStockException {
       Inventory i = new Inventory(0,"Hyderabad");
       Product p = new Product(234,"Table",650,i);
       p.disp();
       p.dispStockQuant();
    }
}
