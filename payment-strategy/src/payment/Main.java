package payment;
/**
 * Application entry point.
 * Demonstrates how different payment strategies can be used.
 */
public class Main {
    public static void main(String[] args) {

        // Start with credit card payment.
        PaymentService service =
                new PaymentService(new CreditCardPayment());
        service.processPayment(100.0);

        // Switch to PayPal without modifying PaymentService.
        service.setPaymentStrategy(new PayPalPayment());
        service.processPayment(75.5);

        // Use another payment strategy: bank transfer.
        service.setPaymentStrategy(new BankTransferPayment());
        service.processPayment(250.0);
    }
}
