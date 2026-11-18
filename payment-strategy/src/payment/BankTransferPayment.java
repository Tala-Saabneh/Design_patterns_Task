package payment;

/**
 * Payment strategy that processes payments using a bank transfer.
 * This class demonstrates how to add a new payment method
 * without changing the PaymentService class.
 */
public class BankTransferPayment implements PaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using Bank Transfer.");
    }
}
