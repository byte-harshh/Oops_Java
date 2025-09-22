package Exception.negativebalance;

public class Account {
      String accType;
      long accNo;
      double minBal;
      double time;

   public Account(String accType,long accNo,double minBal,double time){
       this.accType = accType;
       this.accNo = accNo;;
       this.minBal = minBal;
       this.time = time;
   }
   public void calculateInterest(){
       double si = minBal*8.6*time/100;
       System.out.println("Simple Intrest : "+si);
   }

}
