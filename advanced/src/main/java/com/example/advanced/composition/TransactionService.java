/**
 * CSC1109 Object-Oriented Programming (Advanced)
 * Author: Dr Peter Yau (PeterCY.Yau@glasgow.ac.uk)
 * School of Computing Science, University of Glasgow
 */

package com.example.advanced.composition;

/** Handles deposits and withdrawals; reusable by any class that HAS-A transaction service. */
public class TransactionService {

    public void deposit(double amount) {
        System.out.println("Deposited: $" + amount);
    }

    /** @return {@code true} if the withdrawal is allowed for the given balance */
    public boolean withdraw(double amount, double balance) {
        if (amount > balance) {
            System.out.println("Insufficient funds for withdrawal.");
            return false;
        }
        System.out.println("Withdrawn: $" + amount);
        return true;
    }
}
