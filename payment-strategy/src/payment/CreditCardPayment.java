package payment;

/**
 * Payment strategy that processes payments using a credit card.
 */
public class CreditCardPayment implements PaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using Credit Card.");
    }
}
