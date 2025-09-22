package Exception.negativebalance;

public class Customer {
    String name;
    String address;
    long id;
    String phno;
    public Customer(String name,String address,long id,String phno){
        this.name = name;
        this.address = address;
        this.id = id;
        this.phno = phno;
    }
    void disp(){
        System.out.println("Name : "+name);
        System.out.println("Address : "+address);
        System.out.println("ID of Person : "+id);
        System.out.println("Phone Number : "+phno);
    }
}
