/**
 * CSC1109 Object-Oriented Programming (Advanced)
 * Author: Dr Peter Yau (PeterCY.Yau@glasgow.ac.uk)
 * School of Computing Science, University of Glasgow
 */

package com.example.advanced.composition;

/** Handles loan payments. */
public class LoanService {

    public void payLoan(double amount) {
        System.out.println("Loan payment made: $" + amount);
    }
}
