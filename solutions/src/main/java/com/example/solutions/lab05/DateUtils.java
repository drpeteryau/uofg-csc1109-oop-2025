/**
 * CSC1109 Object-Oriented Programming
 * Author: Dr Peter Yau (PeterCY.Yau@glasgow.ac.uk)
 * School of Computing Science, University of Glasgow
 */

package com.example.solutions.lab05;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/** Lab 05 Q3(a): a date utility class. */
public final class DateUtils {
    private static final DateTimeFormatter ISO_DATE = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    private DateUtils() {
    }

    public static String format(LocalDate date) {
        return date.format(ISO_DATE);
    }

    public static String getCurrentDateFormatted() {
        return format(LocalDate.now());
    }
}
