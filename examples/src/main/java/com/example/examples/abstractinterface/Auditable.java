/**
 * CSC1109 Object-Oriented Programming
 * Author: Dr Peter Yau (PeterCY.Yau@glasgow.ac.uk)
 * School of Computing Science, University of Glasgow
 */

package com.example.examples.abstractinterface;

/**
 * Interface: models what a class CAN DO, independent of its class hierarchy.
 * A class can implement MANY interfaces. This one is unrelated to payment logic.
 */
public interface Auditable {

    /** Abstract by default; the implementing class must override it. */
    void audit();

    /** Default method: has a body; the implementing class MAY override it. */
    default void showAuditVersion() {
        System.out.println("Audit system version 1.0");
    }
}
