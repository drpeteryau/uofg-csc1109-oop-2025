package com.example.advanced;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertThrows;

import com.example.advanced.cloning.BankAccount;
import com.example.advanced.immutability.BankTransaction;
import com.example.advanced.reflection.ReflectionFinancialDemo;
import java.time.LocalDateTime;
import java.util.List;
import org.junit.jupiter.api.Test;

class AdvancedTest {
    @Test
    void cloneIsIndependentIncludingMutableHistory() {
        BankAccount original = new BankAccount("1", 1000);
        BankAccount copy = original.clone();
        copy.withdraw(300);
        assertNotSame(original, copy);
        assertEquals(1000, original.getBalance());
        assertEquals(700, copy.getBalance());
        assertEquals(List.of(), original.getHistory());
        assertEquals(List.of("withdraw 300.0"), copy.getHistory());
    }

    @Test
    void composedAccountRefusesOverdraft() {
        var account = new com.example.advanced.composition.BankAccount("1", 100);
        account.withdraw(500);
        assertEquals(100, account.getBalance());
        account.deposit(50);
        account.withdraw(120);
        assertEquals(30, account.getBalance());
    }

    @Test
    void inheritedAccountsBehaveLikeBaseAccount() {
        var loan = new com.example.advanced.inheritance.LoanAccount("2", 5000);
        loan.payLoan(1000);
        assertEquals(4000, loan.getBalance());
    }

    @Test
    void transactionValidatesAndIsStable() {
        LocalDateTime t = LocalDateTime.of(2025, 3, 19, 14, 30);
        BankTransaction tx = new BankTransaction("TXN1", "9", 500, t);
        assertEquals(t, tx.getTimestamp());
        assertThrows(IllegalArgumentException.class, () -> new BankTransaction("", "9", 1));
        assertThrows(IllegalArgumentException.class, () -> new BankTransaction("T", " ", 1));
        assertThrows(IllegalArgumentException.class, () -> new BankTransaction("T", "9", Double.NaN));
    }

    @Test
    void reflectionFindsOnlyAnnotatedMethods() {
        assertEquals(List.of("withdraw"),
                ReflectionFinancialDemo.sensitiveMethodNames(com.example.advanced.reflection.BankAccount.class));
    }
}
