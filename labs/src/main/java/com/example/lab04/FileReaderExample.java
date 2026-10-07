/**
 * CSC1109 Object-Oriented Programming
 * Author: Dr Peter Yau (PeterCY.Yau@glasgow.ac.uk)
 * School of Computing Science, University of Glasgow
 */

package com.example.lab04;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Lab 04 Exercise 1: read a text file line by line.
 *
 * <p>Run from the repository root so the default path resolves:
 * {@code java ... FileReaderExample [path]}.
 */
public class FileReaderExample {
    public static final String DEFAULT_PATH = "data/lab04_input.txt";

    public static void main(String[] args) {
        String filePath = args.length > 0 ? args[0] : DEFAULT_PATH;
        // try-with-resources closes the reader even if an exception is thrown.
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
