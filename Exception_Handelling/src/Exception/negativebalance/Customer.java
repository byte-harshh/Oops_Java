package Exception.negativebalance;

public class Customer {
    String name;
    String address;
    long id;
    String phno;
    Account account;

    public Customer(String name,String address,long id,String phno,Account account){
        this.account = account;
        this.name = name;
        this.address = address;
        this.id = id;
        this.phno = phno;
    }
    public void disp() {
        System.out.println("Name : " + name);
        System.out.println("Address : " + address);
        System.out.println("ID of Person : " + id);
        System.out.println("Phone Number : " + phno);
        System.out.println("****** Account details ******");
        account.disp();
    }
    public double showInterest(){
        try{
            double a = account.calculateIntrest();
            System.out.println("Simple Interest : "+a);
        }
        catch(NegativeBalanceException e){
            System.err.println(e);
        }
        return 0;
    }
}



