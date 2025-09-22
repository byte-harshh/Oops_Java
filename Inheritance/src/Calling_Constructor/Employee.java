package Calling_Constructor;

public class Employee extends Person{
    private int empId;
    private double salary;
	public Employee(int age,String name,int empId,double salary) {
		super(age,name);
		this.empId = empId;
		this.salary = salary;
		System.out.println("This is Employee class");
		System.out.println("Employee ID: "+this.empId);
		System.out.println("Employee Salary: "+this.salary);
	}

}
