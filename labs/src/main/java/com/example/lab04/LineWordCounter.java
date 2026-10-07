/**
 * CSC1109 Object-Oriented Programming
 * Author: Dr Peter Yau (PeterCY.Yau@glasgow.ac.uk)
 * School of Computing Science, University of Glasgow
 */

package com.example.lab04;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/** Lab 04 Exercise 2: print a file and count its lines and words. */
public class LineWordCounter {

    /** Result of a count. */
    public record Counts(int lines, int words) {}

    /**
     * Counts lines and words. Blank lines count as a line but contribute zero words
     * ({@code "".split("\\s+")} returns one empty string, which must not be counted).
     */
    public static Counts count(String filePath) throws IOException {
        int lines = 0;
        int words = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                lines++;
                String trimmed = line.trim();
                if (!trimmed.isEmpty()) {
                    words += trimmed.split("\\s+").length;
                }
            }
        }
        return new Counts(lines, words);
    }

    public static void main(String[] args) {
        String filePath = args.length > 0 ? args[0] : FileReaderExample.DEFAULT_PATH;
        try {
            Counts counts = count(filePath);
            System.out.println("Total Lines: " + counts.lines());
            System.out.println("Total Words: " + counts.words());
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
