//////////////////////////////////////////////////////////////////////////////
//                   ALL STUDENTS COMPLETE THESE SECTIONS
// Main Class File:    Assignment7.java
// File:               MazeElement.java
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
 * Represents maze entries within the maze
 *
 * Bugs: None
 *
 * @author Rizq Khateeb
 */
public class MazeElement {

    private String symbol;  // Internal representation of a symbol in the maze

    // Constants that are used to compare symbols.
    public static final String WALL = "X";
    public static final String EMPTY = "-";
    public static final String PATH = "*";

    /**
     * arg constructor for MazeElement
     *
     * @param symbol: symbol for this MazeElement
     */
    public MazeElement(String symbol) throws InvalidSymbolException {
      if(symbol.equals(WALL) == false && symbol.equals(EMPTY) == false
      && symbol.equals(PATH) == false){
        throw new InvalidSymbolException(symbol);
      }
      else{
        this.symbol = symbol;
      }
    }

    /**
     * return the internal representation of symbol.
     *
     * Precondition: this object has been created and this.symbol has some value
     *
     * Takes no parameters.
     *
     * @return A String value represents the current symbol
     */
    public String getSymbol() {
        return this.symbol;
    }

    /**
     * Checks if this point is a wall or not.
     *
     * Precondition: this object has been created and this.symbol has some value
     *
     * Takes no parameters.
     *
     * @return A boolean value that is true if this symbol is "X", otherwise
     *  false.
     */
    public boolean isWall() {
        return this.symbol.equals(WALL);
    }

    /**
     * Checks if this point is empty or not.
     *
     * Precondition: this object has been created and this.symbol has some value
     *
     * Takes no parameters.
     *
     * @return A boolean value that is true if this symbol is "-", otherwise
     *  false.
     */
    public boolean isEmpty() {
        return this.symbol.equals(EMPTY);
    }

    /**
     * Checks if this point is in the escape path or not.
     *
     * Precondition: this object has been created and this.symbol has some value
     *
     * Takes no parameters.
     *
     * @return A boolean value that is true if this symbol is "*", otherwise
     *  false.
     */
    public boolean isPath() {
        return this.symbol.equals(PATH);
    }

    /**
     * Sets this point to "*", indicating that it is in the escape path.
     *
     * Takes no parameters and returns nothing.
     */
    public void setToPath() {
        this.symbol = PATH;
    }

    /**
     * Sets this point to "-", indicating that it is empty.
     *
     * Takes no parameters and returns nothing.
     */
    public void setToEmpty() {
        this.symbol = EMPTY;
    }

    /**
     * Sets this point to "X", indicating that it is a wall.
     *
     * Takes no parameters and returns nothing.
     */
    public void setToWall() {
        this.symbol = WALL;
    }
}
