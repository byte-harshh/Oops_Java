package Exception.ProductInventorySys;

public class Product {
    private int prodId;
    private String prodName;
    private double price;
    Inventory inventory;
    public Product(int prodId,String prodName,double price,Inventory inventory){
        this.inventory = inventory;
        this.prodId = prodId;
        this.prodName = prodName;
        this.price = price;
    }
    public void disp(){
        System.out.println("Product ID : "+prodId);
        System.out.println("Product Name : "+prodName);
        System.out.println("Price : "+price);
        inventory.display();
    }
    public void dispStockQuant() throws OutOfStockException{
        try{
            int r = inventory.checkAvailability();
            System.out.println(r);
        }catch(OutOfStockException e) {
            System.err.printf(e.getMessage());

        }

    }
}
