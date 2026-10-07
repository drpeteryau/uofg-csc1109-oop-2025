package com.example.examples.abstractinterface;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class PaymentTest {
    @Test
    void creditCardIsBothPaymentAndAuditable() {
        Object o = new CreditCardPayment();
        assertTrue(o instanceof Payment);
        assertTrue(o instanceof Auditable);
    }

    @Test
    void cashIsNotAuditable() {
        assertFalse((Object) new CashPayment() instanceof Auditable);
    }
}
