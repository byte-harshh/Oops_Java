package Payment;

class CreditCardPayment implements Payment {
    public void pay(double amount){
        System.out.println("Credit Card payment : "+amount);
    }
}
