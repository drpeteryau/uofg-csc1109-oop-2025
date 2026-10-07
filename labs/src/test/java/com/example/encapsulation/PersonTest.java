package com.example.encapsulation;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class PersonTest {
    @Test
    void storesValidValues() {
        Person p = new Person();
        p.setName("Alice");
        p.setAge(30);
        assertEquals("Alice", p.getName());
        assertEquals(30, p.getAge());
    }

    @Test
    void rejectsNonPositiveAge() {
        Person p = new Person();
        assertThrows(IllegalArgumentException.class, () -> p.setAge(0));
        assertThrows(IllegalArgumentException.class, () -> p.setAge(-5));
    }

    @Test
    void immutablePersonWithAgeReturnsNewObject() {
        ImmutablePerson a = new ImmutablePerson("Bob", 20);
        ImmutablePerson b = a.withAge(21);
        assertEquals(20, a.getAge());
        assertEquals(21, b.getAge());
    }
}
