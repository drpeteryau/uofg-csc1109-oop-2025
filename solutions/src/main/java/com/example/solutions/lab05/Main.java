/**
 * CSC1109 Object-Oriented Programming
 * Author: Dr Peter Yau (PeterCY.Yau@glasgow.ac.uk)
 * School of Computing Science, University of Glasgow
 */

package com.example.solutions.lab05;

/** Lab 05 Q3(b): use {@link Person} and {@link DateUtils} together. */
public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Alice");
        person.setAge(30);
        person.setEmail("alice@example.com");

        System.out.println("Name: " + person.getName());
        System.out.println("Email: " + person.getEmail());
        System.out.println("Current Date: " + DateUtils.getCurrentDateFormatted());
    }
}
