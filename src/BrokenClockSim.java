/**
 * The `Clock` class represents a broken clock with the ability to calculate
 * the number of times it is wrong based on the number of times it is right.
 */
class Clock {
    private int dayTime; // Total seconds in a day
    private int brokenRight; // Number of times the broken clock is right

    /**
     * Constructor to initialize the Clock object with total day time
     * and an initial count of times the clock is right.
     *
     * @param dayTime     Total seconds in a day.
     * @param brokenRight Initial number of times the clock is right.
     */
    public Clock(int dayTime, int brokenRight) {
        this.dayTime = dayTime;
        this.brokenRight = brokenRight;
    }

    /**
     * Calculates the number of times the broken clock is wrong.
     *
     * @return The number of times the broken clock is wrong.
     */
    public int calculateBrokenWrong() {
        // Subtracting the number of times the clock is right from the total day time
        return dayTime - brokenRight;
    }
}

/**
 * The `BrokenClockSim` class contains the main method to demonstrate the
 * functionality of the `Clock` class by calculating and printing the number
 * of times a broken clock is wrong.
 */
public class BrokenClockSim {
    public static void main(String[] args) {
        // Total seconds in a day
        int totalDayTime = 86400;
        // Number of times the broken clock is right
        int brokenRight = 2;
        // Creating a Clock object with initial values
        Clock brokenClock = new Clock(totalDayTime, brokenRight);
        // Calling the calculateBrokenWrong method to get the number of times the clock is wrong
        int brokenWrong = brokenClock.calculateBrokenWrong();
        // Printing the statement with the calculated value
        System.out.println("A broken clock is wrong " + brokenWrong + " times a day.");
    }
}
