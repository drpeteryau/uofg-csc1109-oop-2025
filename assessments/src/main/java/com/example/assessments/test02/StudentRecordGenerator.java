/**
 * CSC1109 Object-Oriented Programming
 * Author: Dr Peter Yau (PeterCY.Yau@glasgow.ac.uk)
 * School of Computing Science, University of Glasgow
 */

package com.example.assessments.test02;

import java.util.Random;

/**
 * Generates 20 records with random scores in [0, 100). Source reconstructed from the compiled
 * class used in the original test.
 *
 * <p>To exercise exception handling, at most one record gets {@code score1 = 0} and at most one
 * gets {@code score2 = NaN} (each with probability 1/5 per record until used, so a run may
 * contain neither). Use {@link #generateRandomRecords(Random)} with a seeded {@link Random}
 * for repeatable data.
 */
public class StudentRecordGenerator {
    public static final int COUNT = 20;

    public static StudentRecord[] generateRandomRecords() {
        return generateRandomRecords(new Random());
    }

    public static StudentRecord[] generateRandomRecords(Random random) {
        StudentRecord[] records = new StudentRecord[COUNT];
        boolean zeroUsed = false;
        boolean nanUsed = false;
        for (int i = 0; i < COUNT; i++) {
            double score1 = random.nextDouble() * 100;
            double score2 = random.nextDouble() * 100;
            double score3 = random.nextDouble() * 100;
            if (!zeroUsed && random.nextInt(5) == 0) {
                score1 = 0;
                zeroUsed = true;
            }
            if (!nanUsed && random.nextInt(5) == 0) {
                score2 = Double.NaN;
                nanUsed = true;
            }
            records[i] = new StudentRecord(i + 1, "Student" + (i + 1), score1, score2, score3);
        }
        return records;
    }
}
