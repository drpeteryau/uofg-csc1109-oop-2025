/**
 * CSC1109 Object-Oriented Programming
 * Author: Dr Peter Yau (PeterCY.Yau@glasgow.ac.uk)
 * School of Computing Science, University of Glasgow
 */

package com.example.utils;

/** Lab 05 Exercise 2(a): a utility class in its own package. */
public final class StringUtils {

    private StringUtils() {
        // Utility class: no instances.
    }

    /** Counts the vowels (a, e, i, o, u; case-insensitive) in {@code input}. */
    public static int countVowels(String input) {
        if (input == null) {
            return 0;
        }
        int count = 0;
        for (char ch : input.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(ch) != -1) {
                count++;
            }
        }
        return count;
    }
}
