package Person;

public class Person {
    protected String name;
    protected int age;
    
	public void setData(String name,int age) {
       this.name = name;
       this.age = age;
	}
	
	public void getData() {
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
	}
}
