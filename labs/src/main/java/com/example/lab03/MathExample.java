/**
 * CSC1109 Object-Oriented Programming
 * Author: Dr Peter Yau (PeterCY.Yau@glasgow.ac.uk)
 * School of Computing Science, University of Glasgow
 */

package com.example.lab03;

/** Lab 03 Exercise 3: {@link Math} utility methods. */
public class MathExample {
    public static void main(String[] args) {
        double a = 25;
        double b = 9;

        System.out.println("Square root of " + a + ": " + Math.sqrt(a));
        System.out.println("Power (a^b): " + Math.pow(a, b));

        int x = 8, y = 12;
        System.out.println("Min of x, y: " + Math.min(x, y));
        System.out.println("Max of x, y: " + Math.max(x, y));
    }
}
