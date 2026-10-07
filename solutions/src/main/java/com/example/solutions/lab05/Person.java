/**
 * CSC1109 Object-Oriented Programming
 * Author: Dr Peter Yau (PeterCY.Yau@glasgow.ac.uk)
 * School of Computing Science, University of Glasgow
 */

package com.example.solutions.lab05;

/** Lab 05 Q2: {@code Person} extended with a validated email. */
public final class Person {
    private String name;
    private int age;
    private String email;

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

    public String getEmail() {
        return email;
    }

    /**
     * Sets the email. This is a deliberately simple format check ("@" before a "." in the
     * domain part); real systems validate by sending a confirmation message.
     */
    public void setEmail(String email) {
        if (email == null) {
            throw new IllegalArgumentException("email must not be null");
        }
        int at = email.indexOf('@');
        if (at <= 0 || email.indexOf('.', at) <= at + 1 || email.endsWith(".")) {
            throw new IllegalArgumentException("Invalid email format: " + email);
        }
        this.email = email;
    }
}
