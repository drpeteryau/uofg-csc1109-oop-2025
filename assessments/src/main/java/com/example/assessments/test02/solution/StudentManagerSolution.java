/**
 * CSC1109 Object-Oriented Programming
 * Author: Dr Peter Yau (PeterCY.Yau@glasgow.ac.uk)
 * School of Computing Science, University of Glasgow
 */

package com.example.assessments.test02.solution;

import com.example.assessments.test02.StudentRecord;
import com.example.assessments.test02.StudentRecordGenerator;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Locale;

/**
 * Reference solution to Test 02.
 *
 * <p>Design decisions: a score that is NaN or outside 0-100 is invalid and reported with
 * {@link InvalidScoreException}; the student's average is then "N/A" rather than a silently
 * wrong number. A score of exactly 0 is valid (a student can score 0). Output uses
 * {@link Locale#ROOT} so decimals are always printed with a '.' regardless of machine locale.
 */
public class StudentManagerSolution {
    private final StudentRecord[] records;

    public StudentManagerSolution(StudentRecord[] records) {
        this.records = records;
    }

    static double validate(String subject, double score) throws InvalidScoreException {
        if (Double.isNaN(score) || score < 0 || score > 100) {
            throw new InvalidScoreException("Invalid " + subject + " score: " + score);
        }
        return score;
    }

    /** Average of the three scores; throws if any score is invalid. */
    static double average(StudentRecord r) throws InvalidScoreException {
        return (validate("subject 1", r.getScore1())
                + validate("subject 2", r.getScore2())
                + validate("subject 3", r.getScore3())) / 3.0;
    }

    /** Parts (a) and (b) for one student, as text. Never throws: invalid data is reported inline. */
    static String describe(StudentRecord r) {
        String scores = String.format(Locale.ROOT, "%s: subject1=%.2f, subject2=%.2f, subject3=%.2f",
                r.getName(), r.getScore1(), r.getScore2(), r.getScore3());
        try {
            return scores + String.format(Locale.ROOT, ", average=%.2f", average(r));
        } catch (InvalidScoreException e) {
            return scores + ", average=N/A (" + e.getMessage() + ")";
        }
    }

    /** Parts (a), (b), (c): print to the screen. */
    public void display() {
        for (StudentRecord r : records) {
            System.out.println(describe(r));
        }
    }

    /** Part (d): write the same data to {@code file}. */
    public void writeResults(Path file) throws IOException {
        try (PrintWriter out = new PrintWriter(Files.newBufferedWriter(file))) {
            for (StudentRecord r : records) {
                out.println(describe(r));
            }
        }
    }

    public static void main(String[] args) {
        StudentManagerSolution manager = new StudentManagerSolution(StudentRecordGenerator.generateRandomRecords());
        manager.display();
        try {
            manager.writeResults(Path.of("results.txt"));
            System.out.println("Results written to results.txt");
        } catch (IOException e) {
            System.err.println("Could not write results.txt: " + e.getMessage());
        }
    }
}
