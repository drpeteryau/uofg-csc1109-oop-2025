package com.example.sims;

import java.util.Scanner;

/**
 * Extension demo: the same menu loop as {@link Main}, driving a {@link WorkingSimCharacter}.
 * Because the loop only needs {@link SimCharacter}, polymorphism picks the overridden
 * behaviour automatically; only "Work" needs the subtype.
 */
public class WorkingSimMain {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            WorkingSimCharacter sim = new WorkingSimCharacter("Alex", 28, "Software Engineer", 5000);
            boolean running = true;

            System.out.println("=== Welcome to CLI Sims (Working Sim) ===");

            while (running) {
                System.out.println("\n--- Main Menu ---");
                System.out.println("1. View Sim Status");
                System.out.println("2. Eat");
                System.out.println("3. Sleep");
                System.out.println("4. Work");
                System.out.println("5. Exit");
                System.out.print("Choose an option: ");

                switch (Main.readChoice(scanner)) {
                    case 1 -> sim.displayStatus();
                    case 2 -> sim.eat();
                    case 3 -> sim.sleep();
                    case 4 -> sim.work();
                    case 5, -2 -> {
                        running = false;
                        System.out.println("Goodbye!");
                    }
                    default -> System.out.println("Invalid choice. Try again.");
                }
            }
        }
    }
}
