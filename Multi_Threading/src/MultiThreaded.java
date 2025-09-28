import java.util.*;
public class MultiThreaded {
    public static void main(String[] args) throws InterruptedException {
        List L1 = new ArrayList();
        List L2 = new ArrayList();

        Thread t1 = new Thread() {
            public void run(){
               for(int i=2;i<=1000;i++){
                    int count = 0;
                    for(int j=1;j<=i/2;j++){
                        if(i % j == 0){
                            count ++;
                        }
                        if(count > 1)
                            break;
                    }
                   if(count == 1){
                       L1.add(i);
                     //  System.out.print(i+" ");
                   }
                }
                //System.out.println();
                System.out.println(L1);
            }
        };
        t1.start();
        t1.join();
        Thread t2 = new Thread() {
            public void run(){
                int a = 0;
                int b = 1;
                int c;
                L2.add(a);
                L2.add(b);
                for(int i=1;i<20;i++){
                    c=  a + b;
                    if(c<1000){
                        //System.out.print(c+" ");
                    L2.add(c);
                    }
                    a=b;
                    b=c;
                }
                System.out.println();
                System.out.println(L2);
            }
        };

        t2.start();
        t2.join();

        Thread t3 = new Thread() {
            public void run(){
                L1.retainAll(L2);
                System.out.print(L1 +" ");
            }
        };
        t3.start();

    }
}
