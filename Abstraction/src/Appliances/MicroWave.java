package Appliances;

class MicroWave extends Appliances {
    public MicroWave(String brand,int pconsumption){
        super(brand,pconsumption);
    }
    void turnOn(){
        System.out.println("Brand of MicroWave : "+brand);
        System.out.println("Power consumption of MicroWave : "+pconsumption);
        System.out.println("MicroWave Turned On");
    }
}
