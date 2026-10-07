package com.example.sims;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Scanner;
import org.junit.jupiter.api.Test;

class SimsTest {
    @Test
    void referenceSimStaysWithinBounds() {
        SimCharacter sim = new SimCharacter("Alex", 25);
        for (int i = 0; i < 10; i++) {
            sim.eat();
        }
        assertEquals(0, sim.getHunger());
        for (int i = 0; i < 10; i++) {
            sim.sleep();
        }
        assertEquals(100, sim.getEnergy());
    }

    @Test
    void workingSimEarnsAndTires() {
        WorkingSimCharacter sim = new WorkingSimCharacter("Alex", 28, "Engineer", 0);
        sim.work();
        assertEquals(500, sim.getSaving());
        assertEquals(25, sim.getEnergy());
        assertEquals(70, sim.getHunger());
    }

    @Test
    void workingSimTooTiredDoesNotEarn() {
        WorkingSimCharacter sim = new WorkingSimCharacter("Alex", 28, "Engineer", 0);
        sim.setEnergy(10);
        sim.work();
        assertEquals(0, sim.getSaving());
        assertEquals(10, sim.getEnergy());
    }

    @Test
    void earnIgnoresNegativeAmounts() {
        WorkingSimCharacter sim = new WorkingSimCharacter("Alex", 28, "Engineer", 100);
        sim.earn(-50);
        assertEquals(100, sim.getSaving());
    }

    @Test
    void workingSimSleepOverridesBaseBehaviour() {
        SimCharacter sim = new WorkingSimCharacter("Alex", 28, "Engineer", 0);
        sim.sleep(); // dynamic dispatch: +20 energy, not +30
        assertEquals(70, sim.getEnergy());
    }

    @Test
    void readChoiceParsesDefensively() {
        assertEquals(3, Main.readChoice(new Scanner("3\n")));
        assertEquals(-1, Main.readChoice(new Scanner("abc\n")));
        assertEquals(-1, Main.readChoice(new Scanner("\n")));
        assertEquals(-2, Main.readChoice(new Scanner("")));
    }
}
