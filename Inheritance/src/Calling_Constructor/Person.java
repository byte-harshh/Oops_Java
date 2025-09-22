package Calling_Constructor;

public class Person {
    protected int age;
    protected String name;
	public Person(int age,String name) {
       this.age = age;
       this.name = name;
       System.out.println("This is Person class");
       System.out.println("Age :"+age);
       System.out.println("Name : "+name);
	}
	
}
