package java_IO;
import java.io.*;
import java.util.*;
public class LongestWord {
    public static void main(String[] args) {
        String longestWord = "";
        try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\HARSH\\Downloads\\JAVA_ASSIGNMENT-11_Harsh_Jagtap.pdf"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                StringBuilder word = new StringBuilder();
                for (int i = 0; i < line.length(); i++) {
                    char ch = line.charAt(i);
                    if (Character.isLetterOrDigit(ch)) {
                        word.append(ch);
                    } else {
                        if (word.length() > longestWord.length()) {
                            longestWord = word.toString();
                        }
                        word.setLength(0);
                    }
                }

                if (word.length() > longestWord.length()) {
                    longestWord = word.toString();
                }
            }
            System.out.println("Longest word: " + longestWord);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }}






