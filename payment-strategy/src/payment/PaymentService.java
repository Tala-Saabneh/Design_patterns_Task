package payment;

/**
 * PaymentService does not depend on specific payment implementations.
 * It works with the PaymentStrategy interface to reduce coupling.
 */
public class PaymentService {

    // The strategy responsible for processing the current payment.
    private PaymentStrategy paymentStrategy;

    /**
     * Receives the selected payment strategy from outside the class.
     * This avoids creating specific payment objects inside PaymentService.
     */
    public PaymentService(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    /**
     * Allows the payment strategy to be changed at runtime.
     */
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    /**
     * Delegates the payment operation to the selected strategy.
     */
    public void processPayment(double amount) {
        if (paymentStrategy == null) {
            throw new IllegalStateException("A payment strategy must be selected first.");
        }

        paymentStrategy.pay(amount);
    }
}
