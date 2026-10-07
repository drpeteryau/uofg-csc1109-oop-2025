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
import java.util.List;

/** Lab 04 Q3: print a file, skipping lines that start with '#'. */
public class SkipCommentsFileReader {

    public static List<String> readNonComments(String filePath) throws IOException {
        List<String> result = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.trim().startsWith("#")) {
                    continue;
                }
                result.add(line);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String filePath = args.length > 0 ? args[0] : "data/lab04_input.txt";
        try {
            readNonComments(filePath).forEach(System.out::println);
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
