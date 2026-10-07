/**
 * CSC1109 Object-Oriented Programming (Advanced)
 * Author: Dr Peter Yau (PeterCY.Yau@glasgow.ac.uk)
 * School of Computing Science, University of Glasgow
 */

package com.example.advanced.cloning;

import java.util.ArrayList;
import java.util.List;

/**
 * Demonstrates {@link Cloneable}.
 *
 * <p>{@code super.clone()} makes a SHALLOW copy: primitives and Strings are fine, but the
 * {@code history} list would be SHARED between the original and the clone. {@link #clone()}
 * therefore copies the list as well (a deep copy of the mutable field).
 */
public class BankAccount implements Cloneable {
    private String accountNumber;
    private double balance;
    private List<String> history = new ArrayList<>();

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds for withdrawal.");
        } else {
            balance -= amount;
            history.add("withdraw " + amount);
            System.out.println("Withdrawn: $" + amount);
        }
    }

    public double getBalance() {
        return balance;
    }

    public List<String> getHistory() {
        return List.copyOf(history);
    }

    public void showBalance() {
        System.out.println("Account: " + accountNumber + ", Balance: $" + balance);
    }

    @Override
    public BankAccount clone() {
        try {
            BankAccount copy = (BankAccount) super.clone();
            copy.history = new ArrayList<>(history); // deep-copy the mutable field
            return copy;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError("Cannot happen: this class implements Cloneable", e);
        }
    }

    public static void main(String[] args) {
        BankAccount original = new BankAccount("123456789", 1000.00);
        original.showBalance();

        BankAccount cloned = original.clone();
        System.out.println("Cloned account created.");

        cloned.withdraw(300);
        cloned.showBalance();

        System.out.println("Original account remains unchanged:");
        original.showBalance();
        System.out.println("Original history: " + original.getHistory());
        System.out.println("Cloned history:   " + cloned.getHistory());
    }
}
