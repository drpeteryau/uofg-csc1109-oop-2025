/**
 * CSC1109 Object-Oriented Programming (Advanced)
 * Author: Dr Peter Yau (PeterCY.Yau@glasgow.ac.uk)
 * School of Computing Science, University of Glasgow
 */

package com.example.advanced.reflection;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/** Uses reflection to discover methods annotated with {@link SensitiveTransaction}. */
public class ReflectionFinancialDemo {

    /**
     * Names of the annotated methods, sorted: {@code getDeclaredMethods()} makes no
     * guarantee about ordering, so never rely on it.
     */
    public static List<String> sensitiveMethodNames(Class<?> type) {
        return Arrays.stream(type.getDeclaredMethods())
                .filter(m -> m.isAnnotationPresent(SensitiveTransaction.class))
                .map(Method::getName)
                .sorted(Comparator.naturalOrder())
                .toList();
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        for (String name : sensitiveMethodNames(BankAccount.class)) {
            System.out.println("Logging sensitive transaction: " + name);
        }

        account.deposit(500);
        account.withdraw(300);
    }
}
