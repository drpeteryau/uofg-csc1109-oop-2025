/**
 * CSC1109 Object-Oriented Programming
 * Author: Dr Peter Yau (PeterCY.Yau@glasgow.ac.uk)
 * School of Computing Science, University of Glasgow
 */

package com.example.assessments.test02;

/** A student's number, name and three subject scores (0-100; may be invalid, see the generator). */
public class StudentRecord {
    private int studentNumber;
    private String name;
    private double score1;
    private double score2;
    private double score3;

    public StudentRecord(int studentNumber, String name, double score1, double score2, double score3) {
        this.studentNumber = studentNumber;
        this.name = name;
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3;
    }

    public int getStudentNumber() { return studentNumber; }
    public void setStudentNumber(int studentNumber) { this.studentNumber = studentNumber; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public double getScore1() { return score1; }
    public void setScore1(double score1) { this.score1 = score1; }
    public double getScore2() { return score2; }
    public void setScore2(double score2) { this.score2 = score2; }
    public double getScore3() { return score3; }
    public void setScore3(double score3) { this.score3 = score3; }

    @Override
    public String toString() {
        return "StudentRecord{studentNumber=" + studentNumber + ", name='" + name + "', score1=" + score1
                + ", score2=" + score2 + ", score3=" + score3 + "}";
    }
}
