///////////////////////////////////////////////////////////////////////////////
// Main Class File:    Assignment5.java
// File:               NumberGenerator.java
// Quarter:            Fall 2021
//
// Author:             Yundong Wang
// Instructor's Name:  Ben Ochoa
//
//////////////////////////// 80 columns wide //////////////////////////////////


import java.util.Random;

/**
 * This class provides functionality to randomly generate an integer from 0 to
 * a given upper limit inclusive.
 *
 * Bugs: Unknown
 *
 * @author Yundong Wang
 */
public class NumberGenerator {

    private static final Random random = new Random(42);  // Do NOT change

    /**
     * Randomly generate an integer from 0 to 100 inclusive.
     * @return A randomly generated integer
     */
    public static int generate() {
        return random.nextInt(101);
    }
}
