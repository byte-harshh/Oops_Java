package Basics;

//Encapsulation
public class StudentEncapsule{
	private String name;
	private  int age;
	private double gpa;

	public void setData(String name,int age,double gpa){
		this.name = name;
		this.age = age;
		this.gpa = gpa;
	} 
	public void getData(){
       System.out.println("Name of student: "+name);
       System.out.println("Age of Student: "+age);
       System.out.println("GPA : "+gpa);
	}
}
class Main{
	public static void main(String[] args) {
		StudentEncapsule s = new StudentEncapsule();
		s.setData("Harsh Jagtap",23,8.89);
		s.getData();
	}
}