/**
 * CSC1109 Object-Oriented Programming (Advanced)
 * Author: Dr Peter Yau (PeterCY.Yau@glasgow.ac.uk)
 * School of Computing Science, University of Glasgow
 */

package com.example.advanced.immutability;

import java.time.LocalDateTime;

/**
 * An immutable value object.
 *
 * <p>Checklist: final class, private final fields, no setters, validated in the constructor.
 * {@link LocalDateTime} is itself immutable, so exposing it is safe; a mutable field such as
 * {@code java.util.Date} or a {@code List} would need a defensive copy.
 */
public final class BankTransaction {
    private final String transactionId;
    private final String accountNumber;
    private final double amount;
    private final LocalDateTime timestamp;

    public BankTransaction(String transactionId, String accountNumber, double amount) {
        this(transactionId, accountNumber, amount, LocalDateTime.now());
    }

    /** Explicit timestamp, so tests and replays are deterministic. */
    public BankTransaction(String transactionId, String accountNumber, double amount,
                           LocalDateTime timestamp) {
        if (transactionId == null || transactionId.isBlank()) {
            throw new IllegalArgumentException("transactionId is required");
        }
        if (accountNumber == null || accountNumber.isBlank()) {
            throw new IllegalArgumentException("accountNumber is required");
        }
        if (Double.isNaN(amount) || Double.isInfinite(amount)) {
            throw new IllegalArgumentException("amount must be a finite number");
        }
        this.transactionId = transactionId;
        this.accountNumber = accountNumber;
        this.amount = amount;
        this.timestamp = timestamp;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getAmount() {
        return amount;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void displayTransaction() {
        System.out.println("Transaction ID: " + transactionId);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Amount: $" + amount);
        System.out.println("Timestamp: " + timestamp);
    }

    public static void main(String[] args) {
        BankTransaction transaction = new BankTransaction("TXN12345", "987654321", 500.00);
        transaction.displayTransaction();

        // Uncommenting either line fails to compile because the fields are private final:
        // transaction.amount = 1000;
        // transaction.accountNumber = "123456789";
    }
}
