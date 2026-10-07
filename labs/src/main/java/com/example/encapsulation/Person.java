/**
 * CSC1109 Object-Oriented Programming
 * Author: Dr Peter Yau (PeterCY.Yau@glasgow.ac.uk)
 * School of Computing Science, University of Glasgow
 */

package com.example.encapsulation;

/**
 * Lab 05 Exercise 1: a class with private fields and validated setters.
 *
 * <p>Invalid input is rejected with an {@link IllegalArgumentException} instead of being
 * silently ignored, so callers learn about the mistake immediately.
 */
public class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 0) {
            throw new IllegalArgumentException("age must be positive: " + age);
        }
        this.age = age;
    }
}
