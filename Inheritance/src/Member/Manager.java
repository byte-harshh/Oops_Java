package Member;

public class Manager extends Member{
	String department;
	public Manager(String name,int age,String phNo,String addr,double salary,String department){
		this.name = name;
		this.age = age;
		this.phNo = phNo;
		this.addr = addr;
		this.salary = salary;
		this.department = department;
	}	
	public void getMngData() {
		System.out.println("Name : "+name);
		System.out.println("age : "+age);
		System.out.println("Phone Number : "+phNo);
		System.out.println("Address : "+addr);
		System.out.println("Department : "+department);
		printSalary();
	}
	
}
