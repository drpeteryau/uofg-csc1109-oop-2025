/**
 * CSC1109 Object-Oriented Programming
 * Author: Dr Peter Yau (PeterCY.Yau@glasgow.ac.uk)
 * School of Computing Science, University of Glasgow
 */

package com.example.examples.abstractinterface;

/** Extends an abstract class AND implements an unrelated interface. */
public class CreditCardPayment extends Payment implements Auditable {

    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using credit card");
    }

    /** Overrides the inherited concrete method. {@code @Override} lets the compiler check it. */
    @Override
    public void receipt(double amount) {
        System.out.println("Payment received (override): $" + amount);
    }

    @Override
    public void audit() {
        System.out.println("Audit log recorded");
    }
}
