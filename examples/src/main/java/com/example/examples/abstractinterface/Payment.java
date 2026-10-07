/**
 * CSC1109 Object-Oriented Programming
 * Author: Dr Peter Yau (PeterCY.Yau@glasgow.ac.uk)
 * School of Computing Science, University of Glasgow
 */

package com.example.examples.abstractinterface;

/**
 * Abstract class: models what payments ARE. It can hold state, constructors and
 * shared behaviour, and a class can extend only ONE abstract class.
 */
public abstract class Payment {

    /** Abstract method: no body; every concrete subclass must implement it. */
    public abstract void pay(double amount);

    /** Concrete method: shared behaviour that subclasses inherit (and may override). */
    public void receipt(double amount) {
        System.out.println("Payment received: $" + amount);
    }
}
