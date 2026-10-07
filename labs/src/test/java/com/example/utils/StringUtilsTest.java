package com.example.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class StringUtilsTest {
    @Test
    void countsVowelsCaseInsensitively() {
        assertEquals(3, StringUtils.countVowels("Alice"));
        assertEquals(5, StringUtils.countVowels("AEIOU"));
    }

    @Test
    void handlesEmptyAndNull() {
        assertEquals(0, StringUtils.countVowels(""));
        assertEquals(0, StringUtils.countVowels(null));
    }
}
