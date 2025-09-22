package Payment;

public class Driver {
    public static void main(String[] args) {
        PaymentProcessor p = new PaymentProcessor();
        Payment credit = new CreditCardPayment();
        Payment paypal = new PaypalPayment();
//        credit.pay(456);
//        paypal.pay(8566);
        p.PaymentProcessor(credit,4564);
        p.PaymentProcessor(paypal,74185);

    }
}
