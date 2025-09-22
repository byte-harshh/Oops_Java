package Appliances;

class Refrigerator extends Appliances {
    public Refrigerator(String brand,int pconsumption){
        super(brand,pconsumption);
    }
    void turnOn(){
        System.out.println("Brand of Refrigerator : "+brand);
        System.out.println("Power consumption of Refrigerator : "+pconsumption);
        System.out.println("Refrigerator is Turned On");
    }
}
