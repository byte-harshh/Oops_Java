package Basics;

class Person{
	String name;
	int age;
	String country;
    Person(){                      //default constructor
        System.out.println("***Welcome To Person Class***");
    }
    Person(String n,int a,String c){  //Parameterized constructor
    	name = n;
    	age = a;
    	country = c;
    }
    Person(Person s){             //copying value of one object to another
    	name = s.name;
    	age = s.age;
    	country = s.country;
    }
    void display(){
    	System.out.println("Name of Person : "+name);
    	System.out.println("Age of Person : "+age);
    	System.out.println("Country of Person : "+country);
    }

}
class Main{
	public static void main(String[] args) {
		Person s1 = new Person();
		Person s2 = new Person("Harsh",23,"India");
		Person s3 = new Person(s2); //copying s2 to s3
		System.out.println("");
		s1.display();
		System.out.println();
	    s2.display();
	    System.out.println();
	    s3.display();
	}
}