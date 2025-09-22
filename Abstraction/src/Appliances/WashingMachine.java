package Appliances;

class WashingMachine extends Appliances {
    public WashingMachine(String brand,int pconsumption) {
        super(brand, pconsumption);
    }
    void turnOn() {
        System.out.println("Brand of Washing Machine : "+brand);
        System.out.println("Power consumption of Washing  Machine : "+pconsumption);
        System.out.println("Washing Machine is Turned On");
    }
}
