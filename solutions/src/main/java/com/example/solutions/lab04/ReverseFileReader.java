/**
 * CSC1109 Object-Oriented Programming
 * Author: Dr Peter Yau (PeterCY.Yau@glasgow.ac.uk)
 * School of Computing Science, University of Glasgow
 */

package com.example.solutions.lab04;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/** Lab 04 Q1: print a file's lines in reverse order. */
public class ReverseFileReader {

    public static List<String> readReversed(String filePath) throws IOException {
        List<String> lines = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
        }
        Collections.reverse(lines);
        return lines;
    }

    public static void main(String[] args) {
        String filePath = args.length > 0 ? args[0] : "data/lab04_input.txt";
        try {
            readReversed(filePath).forEach(System.out::println);
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
