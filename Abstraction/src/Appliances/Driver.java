package Appliances;

public class Driver {
    public static void main(String[] args) {
        Appliances w = new WashingMachine("Godrej",200);
        w.turnOn();
        System.out.println();
        Appliances r = new Refrigerator("Whirlpool",500);
        r.turnOn();
        System.out.println();
        Appliances m = new MicroWave("Bajaj",150);
        m.turnOn();
    }
}

