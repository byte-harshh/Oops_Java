package Exception.negativebalance;

public class Account {
    String accType;
    long accNo;
    double minBal;
    double time;


    public Account(String accType, long accNo, double minBal, double time) {
        this.accType = accType;
        this.accNo = accNo;
        this.minBal = minBal;
        this.time = time;
    }

    public void disp() {
        System.out.println("Account Type : " + accType);
        System.out.println("Account No. : " + accNo);
        System.out.println("Balance : " + minBal);
        System.out.println("Time period : " + time);
    }


    public double calculateIntrest() throws NegativeBalanceException {
        if(minBal > 0){
           double si = minBal * 8.6 * time / 100;
           return si;
        }else{
            throw new NegativeBalanceException("Insuficient Balance");
        }

    }
}