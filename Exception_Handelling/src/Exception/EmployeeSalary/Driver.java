package Exception.EmployeeSalary;

public class Driver {
   public static void main(String[] args) throws InvalidSalaryException{
        Salary s = new Salary(0,78945,100000,12345);
        Employee e = new Employee(1234,"Spiderman","Director","production",s);
        e.display();
        e.dispSalary();
    }
}
