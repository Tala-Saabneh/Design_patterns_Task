package payment;

/**
 * Common interface for all payment methods.
 * Every new payment method must implement this interface.
 */
public interface PaymentStrategy {

    // Processes a payment using the specified amount.
    void pay(double amount);
}
