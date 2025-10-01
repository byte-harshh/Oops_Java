package Basics;

class Student{
	private int rollno;
	private String name;
	private int age;

	public void SetData(int r,String n,int a){ //setter
		rollno = r;
		name = n;
		age = a;
	} 
	public void GetData(){
		System.out.println(rollno+" "+name+" "+age);
	}
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		Student s1 = new Student();
		Student s2 = new Student();
		System.out.print("Enter Roll No.: ");
		int rolln = sc.nextInt();
		System.out.print("Enter Name : ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.print("Enter Age : ");
		int age = sc.nextInt();
		System.out.println("\nDisplaying by Command Line");
		s1.SetData(rolln,name,age);
		s1.GetData();
		System.out.println("\nDisplaying at Runtime ");
		s2.SetData(33,"Harsh Jagtap",23);
		s2.GetData();
	}

}