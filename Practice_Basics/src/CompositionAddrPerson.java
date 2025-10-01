package Basics;

class Address{
	private String street;
    private String city;
    private String state;
    
    Address(String street,String city,String state){
         this.street = street;
         this.city = city;
         this.state = state;
    }
    @Override
    public String toString(){
          return "Address :"+street+" "+city+" "+state;
    }
}
class Person{
	private String name;
	private Address address;
	Person(String name,Address address){
		this.name =name;
        this.address=address;
	}
	@Override
	public String toString(){
		return "Name : "+name+"\n"+address;
	}
}
class Main{
	public static void main(String[] args) {
	Address add = new Address("Shrisailem Highway","Hyd","Telangana");
	Person p = new Person("Harsh Jagtap",add);
	System.out.println(p);
 }
}