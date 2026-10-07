/**
 * CSC1109 Object-Oriented Programming
 * Author: Dr Peter Yau (PeterCY.Yau@glasgow.ac.uk)
 * School of Computing Science, University of Glasgow
 */

package com.example.assessments.test02.solution;

/** Thrown when a score is not a number or lies outside 0-100. */
public class InvalidScoreException extends Exception {
    public InvalidScoreException(String message) {
        super(message);
    }
}
