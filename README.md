# Design Patterns Tasks (Java)

This repository contains solutions for the two tasks in the assignment:

1. **Payment Service** using the **Strategy Pattern**.
2. **Configuration Manager** using the **Singleton Pattern**.

The projects use standard Java and do not require Maven or external libraries. JDK 17 or later is recommended.

## Project Structure

```text
Design_Patterns_Java/
├── payment-strategy/
│   ├── src/payment/
│   └── README.md
├── config-singleton/
│   ├── src/config/
│   ├── config.properties
│   └── README.md
└── .gitignore
```

## Task 1: Payment Service — Strategy Pattern

### Explanation
Each payment method is implemented in a separate class that follows the `PaymentStrategy` interface.
`PaymentService` depends on the interface instead of containing hardcoded conditions for each payment type.

### Run on Windows (CMD)

Open CMD inside the `payment-strategy` directory and run:

```bat
javac -d out src\payment\*.java
java -cp out payment.Main
```

### Run on Linux / macOS

```bash
javac -d out src/payment/*.java
java -cp out payment.Main
```

## Task 2: Configuration Manager — Singleton Pattern

### Explanation
`ConfigManager` provides one shared instance to the entire application. The configuration file is loaded once when that instance is initialized.

### Run on Windows (CMD)

Open CMD inside the `config-singleton` directory and run:

```bat
javac -d out src\config\*.java
java -cp out config.Main
```

### Run on Linux / macOS

```bash
javac -d out src/config/*.java
java -cp out config.Main
```

**Important:** Run the program from the `config-singleton` directory so it can find `config.properties`.

## Push the Project to GitHub

1. Extract the ZIP file.
2. Open a terminal in the `Design_Patterns_Java` directory.
3. Create an empty repository on GitHub.
4. Replace the remote URL below with your repository URL, then run:

```bash
git init
git add .
git commit -m "Add Strategy and Singleton design pattern solutions"
git branch -M main
git remote add origin https://github.com/YOUR-USERNAME/YOUR-REPOSITORY.git
git push -u origin main
```

## Notes
- Each task is in a separate directory and can be compiled and run independently.
- Compiled `.class` files and output directories are excluded from Git through `.gitignore`.
- Source code comments and documentation are written in English.
