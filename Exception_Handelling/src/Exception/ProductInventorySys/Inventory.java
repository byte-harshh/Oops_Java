package Exception.ProductInventorySys;

class OutOfStockException extends Exception{
    public OutOfStockException(String msg){
        super(msg);
    }
}

public class Inventory {
    private int stockQuantity;
    private String warehouseLocation;
    public Inventory(int stockQuantity,String warehouseLocation){
        this.stockQuantity = stockQuantity;
        this.warehouseLocation = warehouseLocation;
    }
    public void display(){
        System.out.println("Ware House Location : "+warehouseLocation);
    }
    public int checkAvailability() throws OutOfStockException{
        if(stockQuantity <= 0){
            throw new OutOfStockException("Stock is not Available");
        }else{
            return stockQuantity;
        }
    }
}
