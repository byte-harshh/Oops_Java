package Payment;

class PaypalPayment implements Payment {
    public void pay(double amount){
        System.out.println("Paypal Payment : "+amount);
    }
}
