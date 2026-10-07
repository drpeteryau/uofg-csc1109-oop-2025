/**
 * CSC1109 Object-Oriented Programming (Advanced)
 * Author: Dr Peter Yau (PeterCY.Yau@glasgow.ac.uk)
 * School of Computing Science, University of Glasgow
 */

package com.example.advanced.reflection;

public class BankAccount {
    public void deposit(double amount) {
        System.out.println("Deposited: $" + amount);
    }

    @SensitiveTransaction
    public void withdraw(double amount) {
        System.out.println("Withdrew: $" + amount);
    }
}
