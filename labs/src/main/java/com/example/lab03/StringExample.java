/**
 * CSC1109 Object-Oriented Programming
 * Author: Dr Peter Yau (PeterCY.Yau@glasgow.ac.uk)
 * School of Computing Science, University of Glasgow
 */

package com.example.lab03;

/** Lab 03 Exercise 1: common {@link String} operations. */
public class StringExample {
    public static void main(String[] args) {
        String greeting = "Hello, Java Students!";
        System.out.println("Original: " + greeting);

        // Strings are immutable: every operation below returns a NEW String.
        System.out.println("Concatenated: " + greeting.concat(" Welcome to the lab."));

        // substring(begin, end): begin is inclusive, end is exclusive -> "Java"
        System.out.println("Substring: " + greeting.substring(7, 11));

        System.out.println("Uppercase: " + greeting.toUpperCase());
        System.out.println("Replaced: " + greeting.replace('J', 'G'));

        // The original is unchanged.
        System.out.println("Still original: " + greeting);
    }
}
