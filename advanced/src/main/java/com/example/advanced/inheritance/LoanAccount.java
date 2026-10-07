/**
 * CSC1109 Object-Oriented Programming (Advanced)
 * Author: Dr Peter Yau (PeterCY.Yau@glasgow.ac.uk)
 * School of Computing Science, University of Glasgow
 */

package com.example.advanced.inheritance;

/**
 * A loan account is NOT really a bank account you can deposit into or withdraw from,
 * yet inheritance forces those methods onto it. This is the weakness composition avoids.
 */
public class LoanAccount extends BankAccount {
    public LoanAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    public void payLoan(double amount) {
        System.out.println("Loan payment made: $" + amount);
        balance -= amount;
    }
}
