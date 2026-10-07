package com.example.assessments.test02;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.example.assessments.test02.solution.StudentManagerSolution;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Random;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

class StudentManagerSolutionTest {

    @Test
    void generatorIsRepeatableWithSeed() {
        StudentRecord[] a = StudentRecordGenerator.generateRandomRecords(new Random(42));
        StudentRecord[] b = StudentRecordGenerator.generateRandomRecords(new Random(42));
        assertEquals(StudentRecordGenerator.COUNT, a.length);
        for (int i = 0; i < a.length; i++) {
            assertEquals(a[i].toString(), b[i].toString());
        }
    }

    @Test
    void resultsFileHasAverageAndFlagsInvalidScores(@TempDir Path dir) throws IOException {
        StudentRecord[] records = {
            new StudentRecord(1, "Ann", 90, 60, 30),
            new StudentRecord(2, "Ben", 50, Double.NaN, 70),
            new StudentRecord(3, "Cat", 0, 0, 0),
        };
        Path out = dir.resolve("results.txt");
        new StudentManagerSolution(records).writeResults(out);
        List<String> lines = Files.readAllLines(out);
        assertEquals(3, lines.size());
        assertTrue(lines.get(0).endsWith("average=60.00"), lines.get(0));
        assertTrue(lines.get(1).contains("average=N/A"), lines.get(1));
        assertTrue(lines.get(2).endsWith("average=0.00"), lines.get(2)); // 0 is a valid score
    }
}
