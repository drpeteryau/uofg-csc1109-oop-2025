/**
 * CSC1109 Object-Oriented Programming (Advanced)
 * Author: Dr Peter Yau (PeterCY.Yau@glasgow.ac.uk)
 * School of Computing Science, University of Glasgow
 */

package com.example.advanced.inheritance;

/**
 * Base class for the inheritance version of the banking example.
 *
 * <p>Compare with {@code com.example.advanced.composition}: here every account type
 * inherits ALL behaviour, whether it makes sense or not (a loan account can "deposit").
 */
public class BankAccount {
    protected String accountNumber;
    protected double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        System.out.println("Deposited: $" + amount);
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds for withdrawal.");
        } else {
            System.out.println("Withdrawn: $" + amount);
            balance -= amount;
        }
    }

    public double getBalance() {
        return balance;
    }

    public void showBalance() {
        System.out.println("Account: " + accountNumber + ", Balance: $" + balance);
    }
}
