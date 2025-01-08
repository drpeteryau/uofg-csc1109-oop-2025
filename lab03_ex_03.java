/**
 * Author: Dr. Peter Yau
 * Email: PeterCY.Yau@glasgow.ac.uk
 * 
 * Copyright 2025
 * School of Computing Science, University of Glasgow
 *  
 * Disclaimer:
 * Programmers should ensure the environment and settings are correct.
 * This code does not confirm 100% accuracy. Remember to change the filename and 
 * class name to match your specific implementation.
 */

public class MathExample {
    public static void main(String[] args) {
        double a = 25;
        double b = 9;

        // Square root
        System.out.println("Square root of " + a + ": " + Math.sqrt(a));

        // Power
        System.out.println("Power (a^b): " + Math.pow(a, b));

        // Min and Max
        int x = 8, y = 12;
        System.out.println("Min of x, y: " + Math.min(x, y));
        System.out.println("Max of x, y: " + Math.max(x, y));
    }
}