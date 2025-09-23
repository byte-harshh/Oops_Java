package Exception.EmployeeSalary;

public class Salary {
    private double basicSalary;
    private double hra;
    private double da;
    private double deduction;

    public Salary(double basicSalarysalary,double hra,double da,double deduction){
        this.basicSalary = basicSalary;
        this.hra = hra;
        this.da = da;
        this.deduction = deduction;
    }
    public void disp(){
        System.out.println("Basic Salary : "+basicSalary);
        System.out.println("HRA : "+hra);
        System.out.println("DA : "+da);
        System.out.println("Deduction : "+deduction);
    }
    public double calculateNetSalary() throws InvalidSalaryException{
        if(basicSalary <= 0){
            throw new InvalidSalaryException("Salary will be giving on project,you are not in any Project");
        }else{
        double sal = basicSalary + hra + da + deduction;
        return sal;
    }
    }

}
