package com.example.solutions.lab05;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.time.LocalDate;
import org.junit.jupiter.api.Test;

class Lab05SolutionsTest {
    @Test
    void acceptsValidEmail() {
        Person p = new Person();
        p.setEmail("alice@example.com");
        assertEquals("alice@example.com", p.getEmail());
    }

    @Test
    void rejectsBadEmails() {
        Person p = new Person();
        for (String bad : new String[] {"alice", "alice@", "@example.com", "alice@example", "alice@.com",
                "a.b@c", "alice@example.", ""}) {
            assertThrows(IllegalArgumentException.class, () -> p.setEmail(bad), bad);
        }
        assertThrows(IllegalArgumentException.class, () -> p.setEmail(null));
    }

    @Test
    void circleAreaThroughShapeReference() {
        Shape s = new Circle(5);
        assertEquals(Math.PI * 25, s.calculateArea(), 1e-12);
        assertThrows(IllegalArgumentException.class, () -> new Circle(-1));
    }

    @Test
    void formatsDateAsIso() {
        assertEquals("2025-03-09", DateUtils.format(LocalDate.of(2025, 3, 9)));
    }
}
