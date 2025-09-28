package java_IO;

import java.io.*;

public class LongestWord {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new FileReader("C:/Desktop/IO practice/result.txt"));
    ////        BufferedWriter bw = new BufferedWriter(new FileWriter("C:/Desktop/IO practice/longest.txt"));
//        String longWord = "";
//        String line;
//        while((line = br.readLine()) != null){
//            String [] s1 = line.split("\\s");
//            for(String x : s1) {
//                String addword = x;
//                if (longWord.length() < line.length())
//                    longWord = line;
//            }
//        }
//        System.out.println("Longest word is : "+longWord);
//        br.close();
//    }

    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("C:/Desktop/IO practice/result.txt");
        String lnWord = "";
        int x;
        while((x = fr.read()) != -1){
            System.out.print((char)x);
        }
        fr.close();

    }
}

