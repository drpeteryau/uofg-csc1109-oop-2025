/**
 * CSC1109 Object-Oriented Programming
 * Author: Dr Peter Yau (PeterCY.Yau@glasgow.ac.uk)
 * School of Computing Science, University of Glasgow
 */

package com.example.solutions.lab03;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

/** Lab 03 Q2: add 7 days to today's date. */
public class DateManipulationExample {

    /** Legacy approach with {@link Calendar}; mutates the calendar it is given. */
    public static String plusDaysLegacy(Calendar calendar, int days) {
        calendar.add(Calendar.DAY_OF_MONTH, days);
        return new SimpleDateFormat("dd/MM/yyyy").format(calendar.getTime());
    }

    /** Modern approach with {@code java.time}; returns a new immutable value. */
    public static String plusDays(LocalDate date, int days) {
        return date.plusDays(days).format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println("Current Date: " + new SimpleDateFormat("dd/MM/yyyy").format(calendar.getTime()));
        System.out.println("Date after 7 days (legacy): " + plusDaysLegacy(calendar, 7));
        System.out.println("Date after 7 days (java.time): " + plusDays(LocalDate.now(), 7));
    }
}
