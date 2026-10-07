/**
 * CSC1109 Object-Oriented Programming
 * Author: Dr Peter Yau (PeterCY.Yau@glasgow.ac.uk)
 * School of Computing Science, University of Glasgow
 */

package com.example.solutions.lab03;

/** Lab 03 Q1: count the vowels in a phrase. */
public class StringVowelCounter {

    public static int countVowels(String phrase) {
        int vowelCount = 0;
        for (int i = 0; i < phrase.length(); i++) {
            char ch = Character.toLowerCase(phrase.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
        }
        return vowelCount;
    }

    public static void main(String[] args) {
        System.out.println("Number of vowels: " + countVowels("Laboratory Exercise Completed!"));
    }
}
