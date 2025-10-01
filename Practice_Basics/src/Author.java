package Basics;

public class Author{
private String name;
private String country;
public Author(String name, String country){
    this.name = name;
    this.country = country;
   }
public String toString(){
     return name+"\n"+"Country : "+country;
 }  
}
