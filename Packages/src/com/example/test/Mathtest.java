package com.example.test;
import com.example.math.Calculator;

public class Mathtest {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        double a = c1.addtion(111.255,4455.12);
        double b = c1.substraction(45474.522,32323.452);
        System.out.println("Addition : "+a);
        System.out.println("Substraction : "+b);
    }
}
