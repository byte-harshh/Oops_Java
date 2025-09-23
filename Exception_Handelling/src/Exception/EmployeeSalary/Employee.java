package Exception.EmployeeSalary;

public class Employee {
private  int empId;
private String empName;
private String designation;
private String dept;
Salary salary;

public Employee(int empId,String empName,String designation,String dept,Salary salary){
    this.salary =salary;
    this.empId = empId;
    this.empName = empName;
    this.designation = designation;
    this.dept = dept;
}
public void display(){
    System.out.println("Employee ID : "+empId);
    System.out.println("Employee Name : "+empName);
    System.out.println("Employee Designation : "+designation);
    System.out.println("Department : "+dept);
    salary.disp();
   }
public double dispSalary() throws InvalidSalaryException{
    try{
        double r =salary.calculateNetSalary();
        System.out.println("Total Salary : "+r );
    }catch(InvalidSalaryException e){
        System.err.println(e);
    }
    return 0;
   }
}
