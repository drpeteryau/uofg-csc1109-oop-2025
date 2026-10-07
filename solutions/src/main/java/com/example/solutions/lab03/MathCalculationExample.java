/**
 * CSC1109 Object-Oriented Programming
 * Author: Dr Peter Yau (PeterCY.Yau@glasgow.ac.uk)
 * School of Computing Science, University of Glasgow
 */

package com.example.solutions.lab03;

/** Lab 03 Q3: compute (x^2 + y^2)^(1/2). */
public class MathCalculationExample {

    public static double hypotenuse(int x, int y) {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    public static void main(String[] args) {
        System.out.println("Result of (x^2 + y^2)^(1/2): " + hypotenuse(8, 12));
        // Math.hypot does the same and avoids intermediate overflow/underflow.
        System.out.println("Using Math.hypot: " + Math.hypot(8, 12));
    }
}
