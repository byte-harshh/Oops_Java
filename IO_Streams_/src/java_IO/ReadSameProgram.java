package java_IO;
import java.io.*;

public class ReadSameProgram {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("D:/Oops_Java/File_Handelling/src/java_IO/ReadSameProgram.java");
        BufferedReader br = new BufferedReader(fr);
        FileWriter fw = new FileWriter("C:/Desktop/IO practice/result.txt");
        BufferedWriter bw = new BufferedWriter(fw);

        int nl = 0;
        int wc = 0;
        int cc = 0;
        int x;

        while((x = fr.read()) != -1){
            System.out.print((char)x);
            cc++;
            if(x == ' ')
                wc++;
            if(x == '\n')
                nl++;
        }
        fw.write("\n No. of Character : "+cc);
        fw.write("\n No. of words : "+wc);
        fw.write("\n No. of Line : "+nl);
        fw.close();
        fr.close();
    }
}
