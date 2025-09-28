class Morning extends Thread{
    public void run(){
        System.out.println("Good Morning");
    }
}
class Wel extends Thread{
    public void run(){
        System.out.println("Welcome");
    }
}
public class Greet{
    public static void main(String[] args) {
        while(true){
        new Morning().start();
        new Wel().start();
    }
}}
