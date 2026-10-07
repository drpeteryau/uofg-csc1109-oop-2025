/**
 * CSC1109 Object-Oriented Programming (Advanced)
 * Author: Dr Peter Yau (PeterCY.Yau@glasgow.ac.uk)
 * School of Computing Science, University of Glasgow
 */

package com.example.advanced.inheritance;

public class InheritanceBankingDemo {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("123456789", 1000.00);
        savings.showBalance();
        savings.deposit(500);
        savings.withdraw(300);
        savings.showBalance();

        LoanAccount loan = new LoanAccount("987654321", 5000.00);
        loan.showBalance();
        loan.payLoan(1000);
        loan.showBalance();

        // Compiles and runs, but is meaningless for a loan: the design smell.
        loan.deposit(10);
    }
}
