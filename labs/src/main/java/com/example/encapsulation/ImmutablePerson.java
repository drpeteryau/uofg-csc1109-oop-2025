/**
 * CSC1109 Object-Oriented Programming
 * Author: Dr Peter Yau (PeterCY.Yau@glasgow.ac.uk)
 * School of Computing Science, University of Glasgow
 */

package com.example.encapsulation;

/**
 * Lab 05 Exercise 3: a {@code final} class cannot be subclassed, which is one of the
 * requirements for immutability (the others: private final fields, no setters).
 */
public final class ImmutablePerson {
    private final String name;
    private final int age;

    public ImmutablePerson(String name, int age) {
        if (age <= 0) {
            throw new IllegalArgumentException("age must be positive: " + age);
        }
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    /** "Modifying" an immutable object means creating a new one. */
    public ImmutablePerson withAge(int newAge) {
        return new ImmutablePerson(name, newAge);
    }
}
