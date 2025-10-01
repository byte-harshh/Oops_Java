import java.io.FileReader;

class File1 extends Thread{
    int wc = 0;
    public void run(){
        try{
        FileReader fr = new FileReader("C:\\Users\\HARSH\\Downloads\\JAVA_ASSIGNMENT-9_Harsh_Jagtap.pdf");
            int x;
           while((x= fr.read()) != -1){
            if(x == ' ')
                wc++;
          }
            System.out.println("Word count of 1st File : "+wc);
        }catch(Exception e){
        e.printStackTrace();
        }
    }
}


class File2 extends Thread{
    int wc = 0;
    public void run(){
        try{
            FileReader fr = new FileReader("C:\\Users\\HARSH\\Downloads\\JAVA_ASSIGNMENT-8_Harsh_Jagtap.pdf");
            int x;
            while((x= fr.read()) != -1){
                if(x == ' ')
                    wc++;
            }
            System.out.println("Word count of 2nd File : "+wc);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
class File3 extends Thread{
    int wc = 0;
    public void run(){
        try{
            FileReader fr = new FileReader("C:\\Users\\HARSH\\Downloads\\JAVA_ASSIGNMENT-7_Harsh_Jagtap.pdf");
            int x;
            while((x= fr.read()) != -1){
                if(x == ' ')
                    wc++;
            }
            System.out.println("Word count of 3rd File : "+wc);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

public class FileWordCount {
    public static void main(String[] args) throws InterruptedException {
//        new File1().start();
//        new File2().start();
//        new File3().start();

          Thread t1 = new File1();
          t1.start();
          t1.join();
          Thread t2 = new File2();
          t2.start();
          t2.join();
          Thread t3 = new File3();
          t3.start();
          t3.join();


    }
}
