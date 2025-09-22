package Member;

public class Driver {
public static void main(String[] args) {
	Employee e = new Employee("Harsh",23,"7745045806","Housing Board",100500,"PGDAC");
	e.getEmpData();
	System.out.println();
	Manager m = new Manager("Allu Arjun",45,"123467899","Jublee Hills",123456,"Production");
	m.getMngData();
}
}
