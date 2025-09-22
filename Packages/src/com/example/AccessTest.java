package com.example;
import com.example.access.PublicClass;
import com.example.access.PackagePrivateClass;

public class AccessTest {
    public static void main(String[] args) {
//        PublicClass p = new PublicClass();
//        p.showPublicMassage();
        PackagePrivateClass p1 = new PackagePrivateClass();
       // p1.showPackagePrivateMessage();
    }
}
