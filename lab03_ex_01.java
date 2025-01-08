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

public class StringExample {
    public static void main(String[] args) {
        String greeting = "Hello, Java Students!";
        System.out.println("Original: " + greeting);
        
        // Concatenation
        String welcome = greeting.concat(" Welcome to the lab.");
        System.out.println("Concatenated: " + welcome);

        // Substring
        String java = greeting.substring(7, 11);
        System.out.println("Substring: " + java);

        // Uppercase
        String upper = greeting.toUpperCase();
        System.out.println("Uppercase: " + upper);

        // Replacement
        String replaced = greeting.replace('J', 'G');
        System.out.println("Replaced: " + replaced);
    }
}