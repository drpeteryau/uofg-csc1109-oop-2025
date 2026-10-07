package com.example.sims;

import java.util.Scanner;

/**
 * Reference entry point: a CLI menu loop that drives a {@link SimCharacter}.
 *
 * <p>Input is read line by line and parsed defensively, so typing text or pressing Enter
 * shows an error instead of crashing with an exception.
 */
public class Main {

    /** Reads a menu choice; returns {@code -1} for non-numeric input, {@code -2} on end of input. */
    static int readChoice(Scanner scanner) {
        if (!scanner.hasNextLine()) {
            return -2;
        }
        try {
            return Integer.parseInt(scanner.nextLine().trim());
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            SimCharacter sim = new SimCharacter("Alex", 25);
            boolean running = true;

            System.out.println("=== Welcome to CLI Sims ===");

            while (running) {
                System.out.println("\n--- Main Menu ---");
                System.out.println("1. View Sim Status");
                System.out.println("2. Eat");
                System.out.println("3. Sleep");
                System.out.println("4. Exit");
                System.out.print("Choose an option: ");

                switch (readChoice(scanner)) {
                    case 1 -> sim.displayStatus();
                    case 2 -> sim.eat();
                    case 3 -> sim.sleep();
                    case 4, -2 -> {
                        running = false;
                        System.out.println("Goodbye!");
                    }
                    default -> System.out.println("Invalid choice. Try again.");
                }
            }
        }
    }
}
