package com.example.solutions.lab04;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

class Lab04SolutionsTest {
    private Path write(Path dir, String content) throws IOException {
        Path f = dir.resolve("in.txt");
        Files.writeString(f, content);
        return f;
    }

    @Test
    void reversesLines(@TempDir Path dir) throws IOException {
        Path f = write(dir, "a\nb\nc\n");
        assertEquals(List.of("c", "b", "a"), ReverseFileReader.readReversed(f.toString()));
    }

    @Test
    void skipsCommentsIncludingIndentedOnes(@TempDir Path dir) throws IOException {
        Path f = write(dir, "#c1\nkeep\n   # c2\nkeep too\n");
        assertEquals(List.of("keep", "keep too"), SkipCommentsFileReader.readNonComments(f.toString()));
    }

    @Test
    void countsWordAdjacentToPunctuationAndIgnoresCase(@TempDir Path dir) throws IOException {
        Path f = write(dir, "Glasgow, glasgow. GLASGOW\nin Glasgow!\nGlasgowian is not counted\n");
        assertEquals(4, WordCountGlasgow.countWord(f.toString(), "Glasgow"));
    }

    @Test
    void bundledSampleCount() throws IOException {
        // The naive split-on-whitespace version undercounts this file; see WordCountGlasgow javadoc.
        int count = WordCountGlasgow.countWord("../data/lab04_input.txt", "Glasgow");
        assertEquals(EXPECTED_GLASGOW, count);
    }

    private static final int EXPECTED_GLASGOW = 7; // the original split-on-whitespace solution finds only 6
}
