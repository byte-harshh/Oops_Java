package java_IO;
import java.io.*;
public class Read3line {
    public static void main(String[] args) throws IOException  {
        FileReader fr = new FileReader("D:/Oops_Java/File_Handelling/src/java_IO//Read3line.java");
        BufferedReader br = new BufferedReader(fr);
        FileWriter fw = new FileWriter("C:/Desktop/IO practice/3rdLine.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        int ln = 1;
        String line;
        while((line = br.readLine()) != null){
            if(ln < 4)
                fw.write(line + "\n");
            ln++;
        }
        fr.close();
        fw.close();
    }
}
