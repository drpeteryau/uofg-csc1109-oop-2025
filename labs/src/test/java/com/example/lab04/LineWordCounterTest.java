package com.example.lab04;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

class LineWordCounterTest {

    @Test
    void blankLinesCountAsLinesButNotWords(@TempDir Path dir) throws IOException {
        Path file = dir.resolve("a.txt");
        Files.writeString(file, "hello world\n\n   \none\n");
        assertEquals(new LineWordCounter.Counts(4, 3), LineWordCounter.count(file.toString()));
    }

    @Test
    void emptyFileHasNoLinesOrWords(@TempDir Path dir) throws IOException {
        Path file = dir.resolve("empty.txt");
        Files.writeString(file, "");
        assertEquals(new LineWordCounter.Counts(0, 0), LineWordCounter.count(file.toString()));
    }

    @Test
    void missingFileThrows() {
        assertThrows(IOException.class, () -> LineWordCounter.count("does-not-exist.txt"));
    }

    @Test
    void bundledSampleFileIsReadable() throws IOException {
        // Maven runs tests from the module directory, so the shared data lives one level up.
        LineWordCounter.Counts counts = LineWordCounter.count("../data/lab04_input.txt");
        assertEquals(5, counts.lines());
    }
}
