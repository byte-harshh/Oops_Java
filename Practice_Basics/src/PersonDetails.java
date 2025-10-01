package Basics;

class Person{
	String name;
	int age;
	String country;

	void SetData(String n,int a,String c){
		name = n;
		age = a;
		country = c;
	}
	void GetData(){
		System.out.println("Name of Person : "+name);
		System.out.println("Age of Person : "+age);
		System.out.println("Country of Person : "+country);
	}
	public static void main(String[] args) {
		Person p = new Person();
		p.SetData("Harsh",23,"India");
		p.GetData();
	}
}