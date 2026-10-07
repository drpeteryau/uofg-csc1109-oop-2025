/**
 * CSC1109 Object-Oriented Programming
 * Author: Dr Peter Yau (PeterCY.Yau@glasgow.ac.uk)
 * School of Computing Science, University of Glasgow
 */

package com.example.assessments.test02;

/**
 * TEST 02 STARTER (exercise version).
 *
 * <p>TODO: program this class, designing and modifying it from the given file:
 * <ol>
 *   <li>Show the name and score for each of the subjects on the screen.</li>
 *   <li>Compute the average score for the student and print it out on the screen.</li>
 *   <li>Handle appropriate exceptions.</li>
 *   <li>Output a file named "results.txt" including the data from (a) and (b).</li>
 * </ol>
 * A reference solution is in the {@code solution} package.
 */
public class StudentManager {
    private final StudentRecord[] studentRecords;

    public StudentManager() {
        this.studentRecords = StudentRecordGenerator.generateRandomRecords();
    }

    public void displayStudentRecords() {
        System.out.println("Student Records:");
        for (StudentRecord record : studentRecords) {
            System.out.println(record);
        }
    }

    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        manager.displayStudentRecords();
    }
}
