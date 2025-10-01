package Basics;

class BankAccount{
	String accHolder;
	int accNo;
	String accType;
	double balance;
	static double interestRate;
	static{
		interestRate = 6.5;
	}
	BankAccount(String accHolder,int accNo,String accType,double balance){
		this.accHolder = accHolder;
		this.accNo = accNo;
		this.accType = accType;
		this.balance = balance;
	}
	void deposite(double amount){
		if(amount > 0){
		balance += amount;
		System.out.println("Rs."+amount+" Credited");
        }else{
		System.out.println("Entered Amount is Invalid");
	    }
	}
	void withdraw(double amount){
        if(amount>0 && amount<balance){
        	balance -= amount;
        	System.out.println("Rs."+amount+" Debited");
        }else{
        	System.out.println("Entered Amount is Invalid");
        }
	}
	static double IntrestEarn(double balance,double interestRate){
		  return (balance*interestRate)/100;
	}
	void accountDetails(){
		System.out.println("Account Holder Name : "+accHolder);
		System.out.println("Account Number : "+accNo);
		System.out.println("Account Type : "+accType);
		System.out.println("Balance Amount : Rs."+balance);
		System.out.println("Interest Rate : "+interestRate+" percent");
		System.out.println("intrest Earned on Balance : "+IntrestEarn(balance,interestRate));
	}
}
class Main{
	public static void main(String[] args) {
		BankAccount b1 = new BankAccount("Allu Arjun",11145,"Saving",100000);
		BankAccount b2 = new BankAccount("Mahesh",101045,"Current",145679);
		b1.deposite(15580);
		b1.accountDetails();
		System.out.println();
		b2.withdraw(50000);
		b2.accountDetails();
	}
}