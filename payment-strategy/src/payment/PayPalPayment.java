package payment;

/**
 * Payment strategy that processes payments using PayPal.
 */
public class PayPalPayment implements PaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using PayPal.");
    }
}
