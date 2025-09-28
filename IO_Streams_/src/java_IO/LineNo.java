package java_IO;

import java.io.*;

public class LineNo {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("D:/Oops_Java/File_Handelling/src/java_IO/LineNo.java");
        BufferedReader br = new BufferedReader(fr);
        FileWriter fw = new FileWriter("C:/Desktop/IO practice/Lines.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        int num = 1;
        String line ;
        while((line = br.readLine()) != null){
            fw.write("\n"+num+" : "+line+"\n");
            num++;
        }
        fr.close();
        fw.close();
    }
}


