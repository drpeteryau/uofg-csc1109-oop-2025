/**
 * CSC1109 Object-Oriented Programming
 * Author: Dr Peter Yau (PeterCY.Yau@glasgow.ac.uk)
 * School of Computing Science, University of Glasgow
 */

package com.example.solutions.lab04;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Lab 04 Q2: count occurrences of the word "Glasgow".
 *
 * <p>Splitting on whitespace and using {@code equalsIgnoreCase} misses occurrences that touch
 * punctuation, such as "Glasgow," or "Glasgow." A word-boundary regex counts them correctly.
 * Note that {@code \b} also matches in "Glasgow's"; "Glasgow" inside a longer word
 * (e.g. "Glasgowian") is not counted.
 */
public class WordCountGlasgow {

    public static int countWord(String filePath, String word) throws IOException {
        Pattern pattern = Pattern.compile("\\b" + Pattern.quote(word) + "\\b", Pattern.CASE_INSENSITIVE);
        int count = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                Matcher matcher = pattern.matcher(line);
                while (matcher.find()) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String filePath = args.length > 0 ? args[0] : "data/lab04_input.txt";
        try {
            System.out.println("Occurrences of 'Glasgow': " + countWord(filePath, "Glasgow"));
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
