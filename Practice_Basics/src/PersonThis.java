package Basics;

class Person{
	int age;
	String name;
	Person(int age,String name){
		this.age = age;
		this.name = name;
	}
	void display(){
		System.out.println("Age : "+age+", Name : "+name);
		
	}
	void compareAge(Person p){
		if(this.age > p.age){
			System.out.println(this.name+" is older than "+p.name);
		}
		else if (this.age<p.age){
			System.out.println(p.name+" is older than "+ this.name);
		}
		else{
			System.out.println("Both are in same Age");
		}
	}
}
class Main{
	public static void main(String[] args) {
      Person s1 = new Person(22,"Messi");
      s1.display();
      Person s2 = new Person(20,"Virat");
      s2.display();
      System.out.println();
      s1.compareAge(s2);
	}
}