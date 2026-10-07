/**
 * CSC1109 Object-Oriented Programming
 * Author: Dr Peter Yau (PeterCY.Yau@glasgow.ac.uk)
 * School of Computing Science, University of Glasgow
 */

package com.example.examples.abstractinterface;

/** A second {@link Payment} that is NOT {@link Auditable}: the interface is opt-in. */
public class CashPayment extends Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " in cash");
    }
}
