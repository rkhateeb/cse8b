//////////////////////////////////////////////////////////////////////////////
//                   ALL STUDENTS COMPLETE THESE SECTIONS
// Main Class File:    Assignment7.java
// File:               UnsolvableMazeException.java
// Quarter:            Fall 2021
//
// Author:             Rizq Khateeb, rkhateeb@ucsd.edu
// Instructor's Name:  Ben Ochoa
//
//////////////////// STUDENTS WHO GET HELP FROM OTHER THAN THEIR PARTNER //////
//                   fully acknowledge and credit all sources of help,
//                   other than Instructors and TAs.
//
// Persons:          Identify persons by name, relationship to you, and email.
//                   Describe in detail the the ideas and help they provided.
//
// Online sources:   Avoid web searches to solve your problems, but if you do
//                   search, be sure to include Web URLs and description of
//                   of any information you find.
//////////////////////////// 80 columns wide //////////////////////////////////
/**
 * Class for throwing an UnsolvableMazeException, which extends
 * RuntimeException
 *
 * Bugs: None
 *
 * @author Rizq Khateeb
 */
public class UnsolvableMazeException extends RuntimeException {
    private static final String EXCEPT_MSG = "Maze is unsolvable!";

    /**
     * no-arg constructor for UnsolvableMazeException
     */
    public UnsolvableMazeException() {
      super(EXCEPT_MSG);
    }
}
