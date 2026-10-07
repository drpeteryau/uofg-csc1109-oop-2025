/**
 * CSC1109 Object-Oriented Programming
 * Author: Dr Peter Yau (PeterCY.Yau@glasgow.ac.uk)
 * School of Computing Science, University of Glasgow
 */

package com.example.examples.abstractinterface;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Polymorphism through the abstract class reference type
        Payment p = new CreditCardPayment();
        p.pay(100.0);
        p.receipt(100.0);

        // Polymorphism through the interface reference type
        Auditable a = new CreditCardPayment();
        a.audit();
        a.showAuditVersion();

        // One loop, different behaviour per concrete type (dynamic dispatch)
        List<Payment> payments = List.of(new CreditCardPayment(), new CashPayment());
        for (Payment payment : payments) {
            payment.pay(25.0);
            payment.receipt(25.0);
            // instanceof pattern matching: only audit what is auditable
            if (payment instanceof Auditable auditable) {
                auditable.audit();
            }
        }
    }
}
