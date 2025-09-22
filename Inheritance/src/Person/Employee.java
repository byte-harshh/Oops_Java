package Person;

public class Employee extends Person {
    private int empID;
    private double salary;
    
	public void setEmpData(int empID,double salary) {
	   this.empID = empID;
	   this.salary = salary;
	}
	@Override
	public void getData() {
		super.getData();
		System.out.println("Employee ID : "+empID);
		System.out.println("Salary : "+salary);
	}

}
