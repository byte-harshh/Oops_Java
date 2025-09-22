package Member;

public class Employee extends Member {
    String specialization;
	public Employee(String name,int age,String phNo,String addr,double salary,String specialization){
		this.name = name;
		this.age = age;
		this.phNo = phNo;
		this.addr = addr;
		this.salary = salary;
		this.specialization=specialization; 
	}	
	public void getEmpData() {
		System.out.println("Name : "+name);
		System.out.println("age : "+age);
		System.out.println("Phone Number : "+phNo);
		System.out.println("Address : "+addr);
		System.out.println("Specialization: "+specialization);
		printSalary();
	}
}


