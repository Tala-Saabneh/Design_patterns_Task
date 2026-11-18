# Payment Service — Strategy Pattern

## Why Strategy Pattern?

The application supports multiple payment methods, and each method performs payment differently.
Instead of using `if/else` or `switch` statements inside `PaymentService`, each payment method is implemented in a separate class that follows the `PaymentStrategy` interface.

## Run the Project

From this directory, run:

```bat
javac -d out src\payment\*.java
java -cp out payment.Main
```

On Linux or macOS, use:

```bash
javac -d out src/payment/*.java
java -cp out payment.Main
```

## Adding a New Payment Method

Create a new class that implements `PaymentStrategy`, then pass an instance of that class to `PaymentService`.
The `PaymentService` class does not need to be modified.
