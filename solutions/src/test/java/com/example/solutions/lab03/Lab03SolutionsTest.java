package com.example.solutions.lab03;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.util.Calendar;
import org.junit.jupiter.api.Test;

class Lab03SolutionsTest {
    @Test
    void vowelCounterMatchesHandCount() {
        // Laboratory(4) Exercise(4) Completed(3)
        assertEquals(11, StringVowelCounter.countVowels("Laboratory Exercise Completed!"));
    }

    @Test
    void hypotenuseOf8And12() {
        assertEquals(Math.sqrt(208), MathCalculationExample.hypotenuse(8, 12), 1e-12);
    }

    @Test
    void sevenDaysAcrossMonthEnd() {
        assertEquals("04/02/2025", DateManipulationExample.plusDays(LocalDate.of(2025, 1, 28), 7));
        Calendar c = Calendar.getInstance();
        c.set(2025, Calendar.JANUARY, 28);
        assertEquals("04/02/2025", DateManipulationExample.plusDaysLegacy(c, 7));
    }
}
