package com.example.sims;

/**
 * A Sim with a career. Demonstrates inheritance and method overriding:
 * {@link SimCharacter} is extended, never modified, so other modules keep working.
 */
public class WorkingSimCharacter extends SimCharacter {

    /** Energy a shift costs, and therefore the minimum energy needed to work. */
    public static final int WORK_ENERGY_COST = 25;
    /** Fixed pay per shift. */
    public static final int PAY_PER_SHIFT = 500;

    private final String jobTitle;
    private int saving;

    /**
     * @param name     Sim name
     * @param age      Sim age
     * @param jobTitle job title
     * @param saving   starting savings
     */
    public WorkingSimCharacter(String name, int age, String jobTitle, int saving) {
        super(name, age);
        this.jobTitle = jobTitle;
        this.saving = saving;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public int getSaving() {
        return saving;
    }

    /** Adds {@code amount} (ignored if negative) to the savings. */
    public void earn(int amount) {
        this.saving += Math.max(0, amount);
    }

    /** Works one shift: costs energy, raises hunger, earns {@link #PAY_PER_SHIFT}. */
    public void work() {
        if (getEnergy() < WORK_ENERGY_COST) {
            System.out.println(getName() + " is too tired to work. Sleep first.");
            return;
        }
        System.out.println(getName() + " goes to work as a " + jobTitle + ".");
        setEnergy(getEnergy() - WORK_ENERGY_COST);
        setHunger(getHunger() + 20);
        earn(PAY_PER_SHIFT);
        System.out.println("Earned $" + PAY_PER_SHIFT + " this shift.");
    }

    /** A working Sim recovers less energy because of stress. */
    @Override
    public void sleep() {
        System.out.println(getName() + " sleeps after a long day at work.");
        setEnergy(getEnergy() + 20);
        setHunger(getHunger() + 15);
    }

    /** Adds career information to the inherited status display. */
    @Override
    public void displayStatus() {
        super.displayStatus();
        System.out.println("Job    : " + jobTitle);
        System.out.println("Saving : $" + saving);
    }
}
