class PrintNum extends Thread{
    public void run(){
        for(int i=1;i<=10;i++)
            System.out.print(i+" ");
        try{
            Thread.sleep(500);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}

public class SleepJoin {
    public static void main(String[] args) {
        PrintNum t1 = new PrintNum();
        PrintNum t2 = new PrintNum();
        t1.start();
        try {
            t1.join();
        }catch(Exception e){
            System.out.println(e);
        }
        t2.start();
    }
}
