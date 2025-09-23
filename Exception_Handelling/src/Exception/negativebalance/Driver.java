package Exception.negativebalance;

public class Driver {
    public static void main(String[] args) throws NegativeBalanceException{
        Account acc = new Account("saving",456123,-452,5);
        Customer c = new Customer("Coolie","Green Colony",123456,"7894561230",acc);
        c.disp();
        c.showInterest();
    }
}
