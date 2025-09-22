package Appliances;

abstract class Appliances {
    String brand;
    int pconsumption;
    public Appliances(String brand,int pconsumption){
        this.brand = brand;
        this.pconsumption=pconsumption;
    }
    abstract void turnOn();
}
