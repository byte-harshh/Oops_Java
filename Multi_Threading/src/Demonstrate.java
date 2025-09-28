class Demo extends Thread{
    public void run(){
        System.out.println("Name of Current Thread : "+Thread.currentThread().getName());
        System.out.println("Priority of current Thread : "+Thread.currentThread().getPriority());
    }
}
public class Demonstrate {
    public static void main(String[] args) {
        Demo t1 = new Demo();
        Demo t2 = new Demo();
        Demo t3 = new Demo();
        t2.setPriority(Thread.MAX_PRIORITY);
        t2.start();
        t1.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t3.setPriority(Thread.NORM_PRIORITY);
        t3.start();
    }
}
