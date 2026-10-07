/**
 * CSC1109 Object-Oriented Programming
 * Author: Dr Peter Yau (PeterCY.Yau@glasgow.ac.uk)
 * School of Computing Science, University of Glasgow
 */

package com.example.lab03;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.text.SimpleDateFormat;

/**
 * Lab 03 Exercise 2: formatting the current date.
 *
 * <p>{@link Date} and {@link SimpleDateFormat} are the legacy API (shown first because
 * older code still uses them). {@link java.time} is the modern replacement: it is
 * immutable and thread-safe, whereas {@code SimpleDateFormat} is not thread-safe.
 */
public class DateExample {
    public static void main(String[] args) {
        // Legacy API
        Date now = new Date();
        System.out.println("Current Date: " + now);
        System.out.println("Formatted Date (legacy): " + new SimpleDateFormat("dd/MM/yyyy").format(now));

        // Modern API (preferred in new code)
        System.out.println("Formatted Date (java.time): "
                + LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    }
}
