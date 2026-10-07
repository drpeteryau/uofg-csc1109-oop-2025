/**
 * CSC1109 Object-Oriented Programming (Advanced)
 * Author: Dr Peter Yau (PeterCY.Yau@glasgow.ac.uk)
 * School of Computing Science, University of Glasgow
 */

package com.example.advanced.composition;

/**
 * A bank account built from collaborating services (HAS-A) instead of inheriting behaviour.
 *
 * <p>The services are injected through the constructor, so tests (or other account types)
 * can supply different implementations.
 */
public class BankAccount {
    private final String accountNumber;
    private double balance;
    private final TransactionService transactionService;
    private final LoanService loanService;

    public BankAccount(String accountNumber, double balance) {
        this(accountNumber, balance, new TransactionService(), new LoanService());
    }

    public BankAccount(String accountNumber, double balance,
                       TransactionService transactionService, LoanService loanService) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.transactionService = transactionService;
        this.loanService = loanService;
    }

    public void deposit(double amount) {
        transactionService.deposit(amount);
        balance += amount;
    }

    public void withdraw(double amount) {
        if (transactionService.withdraw(amount, balance)) {
            balance -= amount;
        }
    }

    public void payLoan(double amount) {
        loanService.payLoan(amount);
    }

    public double getBalance() {
        return balance;
    }

    public void showBalance() {
        System.out.println("Account: " + accountNumber + ", Balance: $" + balance);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456789", 1000.00);
        account.showBalance();
        account.deposit(500);
        account.withdraw(300);
        account.payLoan(200);
        account.showBalance();
    }
}
