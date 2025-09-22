package Animal_Interface;

public class Driver {
    public static void main(String[] args) {
        Animal d = new Dog();
        d.makeSound();
        d.eat();
        System.out.println();
        Animal c = new Cat();
        c.makeSound();
        c.eat();
    }
}
