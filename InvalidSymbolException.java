//////////////////////////////////////////////////////////////////////////////
//                   ALL STUDENTS COMPLETE THESE SECTIONS
// Main Class File:    Assignment7.java
// File:               InvalidSymbolException.java
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
 * Class that throws InvalidSymbolException, which extends Exception
 *
 * Bugs: None
 *
 * @author Rizq Khateeb
 */
public class InvalidSymbolException extends Exception {
    private static final String EXCEPT_MSG = "Symbol \"%s\" is invalid! " +
    "Must be \"X\", \"*\", or \"-\"";

    /**
     * arg constructor for InvalidSymbolException
     *
     * @param symbol: symbol in maze that is to be invalid
     */
    public InvalidSymbolException(String symbol) {
      super(String.format(EXCEPT_MSG,symbol));
    }
}
