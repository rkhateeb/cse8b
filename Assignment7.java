///////////////////////////////////////////////////////////////////////////////
//                   ALL STUDENTS COMPLETE THESE SECTIONS
// Title:              Assignment7.java
// Files:              UnsolvableMazeException.java,
//                     InvalidSymbolException.java, MazeElement.java
//                     MazeSolver.java
// Quarter:            Fall 2021
//
// Author:             Rizq Khateeb
// Email:              rkhateeb@ucsd.edu
// Instructor's Name:  Ben Ochoa
//
//////////////////// STUDENTS WHO GET HELP FROM OTHER THAN THEIR PARTNER //////
//                   must fully acknowledge and credit those sources of help.
//                   Instructors and TAs do not have to be credited here,
//                   but roommates, relatives, strangers, etc do.
//
// Persons:          Identify persons by name, relationship to you, and email.
//                   Describe in detail the the ideas and help they provided.
//
// Online sources:   Avoid web searches to solve your problems, but if you do
//                   search, be sure to include Web URLs and description of
//                   of any information you find.
//////////////////////////// 80 columns wide //////////////////////////////////
/**
 * main class for Assignment7
 *
 * Bugs: None
 *
 * @author Rizq Khateeb
 */
public class Assignment7 {
    /**
     * Test implementation of {@code mazeMatch}. using assert to raise exception
     * if the functionality of incorrect.
     */
    public static void testMazeMatch() {
      // We must try-catch InvalidSymbolException since it is checked exception
      try {
          MazeElement[][] maze1 = {
              {new MazeElement("X"), new MazeElement("X")},
              {new MazeElement("-"), new MazeElement("*")}
          };
          MazeElement[][] maze2 = {
              {new MazeElement("X"), new MazeElement("X")},
              {new MazeElement("-"), new MazeElement("*")}
          };
          MazeElement[][] maze3 = {
              {new MazeElement("X"), new MazeElement("*")},
              {new MazeElement("-"), new MazeElement("*")}
          };

          // Use assert to check our implementation correctness
          assert MazeSolver.mazeMatch(maze1, maze2) : "maze1 and maze2 should match";
          assert !MazeSolver.mazeMatch(maze1, maze3) : "maze1 and maze3 should NOT match";
      }

      // Since there is no invalid symbol, this should not be executed
      catch (InvalidSymbolException e) {
          assert false : "Test case is designed so that this will not run";
      }
    }

    /**
     * Test the implementation of {@code MazeSolver} constructor and {@code writeMaze}.
     * Create a 2D MazeElement object representing the expected maze after solving.
     * Then compare the solved maze with the expected maze.
     */
    public static void testReadWriteInput1() {
      MazeSolver mazeSolver = new MazeSolver("input1");
      mazeSolver.solveMaze();
      // We must try-catch InvalidSymbolException since it is checked exception
      try {
        MazeElement[][] expected = {
            {new MazeElement("*"), new MazeElement("*"), new MazeElement("X")},
            {new MazeElement("X"), new MazeElement("*"), new MazeElement("*")},
            {new MazeElement("X"), new MazeElement("X"), new MazeElement("*")}
        };

        // Use assert to check our implementation correctness
        assert MazeSolver.mazeMatch(expected, mazeSolver.getMaze());
      }
      // Since there is no invalid symbol, this should not be executed
      catch (InvalidSymbolException e) {
          assert false : "Test case is designed so that this will not run";
      }

      // Write the maze into output1. You can then eyeball the correctness of
      // the file content.
      mazeSolver.writeMaze("output1");
    }

    /**
     * Test the implementation of {@code MazeSolver} constructor and {@code writeMaze}.
     * This time we want to solve an unsolvable maze.
     */
    public static void testReadWriteInput2() {
      MazeSolver mazeSolver = new MazeSolver("input2");

      try {
          mazeSolver.solveMaze();
          // This about why the following line should not be reached
          assert false : "This line should not be reached";
      } catch (UnsolvableMazeException e) {
          System.out.println("Successfully caught UnsolvableMazeException");
          System.out.println(e.getMessage());
      }
    }

    /**
     * Test the implementation of {@code MazeElement}.
     * Check if mazeElement is valid symbol (this test should pass)
     */
    public static void testMazeElement1() {
      MazeElement testMazeElement1 = null;
      try {
        testMazeElement1 = new MazeElement("-");
      }
      // Since there is no invalid symbol, this should not be executed
      catch (InvalidSymbolException e) {
          assert false : "This MazeElement should be valid";
      }
    }

    /**
     * Test the implementation of {@code MazeElement}.
     * Check if mazeElement is valid symbol (this test should fail)
     */
    public static void testMazeElement2() {
      MazeElement testMazeElement1 = null;
      try {
        testMazeElement1 = new MazeElement("d");
        assert false : "This MazeElement should not be valid";
      }
      // Since there is an invalid symbol, this should be executed
      catch (InvalidSymbolException e) {
        System.out.println("Successfully caught InvalidSymbolException");
        System.out.println(e.getMessage());
      }
    }

    /**
     * Test the implementation of {@code MazeSolver} constructor and {@code writeMaze}.
     * Create a 2D MazeElement object using file output1 representing the expected maze
     * after solving. Then compare the solved maze with the expected maze.
     */
    public static void testOutput1() {
      MazeSolver mazeSolver = new MazeSolver("input1");
      mazeSolver.solveMaze();
      mazeSolver.writeMaze("testOutput1");
      MazeSolver testMazeSolver = new MazeSolver("testOutput1");

      try {
          testMazeSolver.solveMaze();
          // This about why the following line should not be reached
          assert false : "This maze should not be solvable";
      } catch (UnsolvableMazeException e) {
          System.out.println("Successfully caught UnsolvableMazeException for output1");
          System.out.println(e.getMessage());
      }
    }

    /**
     * Test the implementation of {@code MazeSolver} constructor and {@code writeMaze}.
     * Create a 2D MazeElement object representing the expected maze after solving.
     * Then compare the solved maze with the expected maze.
     */
    public static void testBig1() {
      MazeSolver mazeSolver = new MazeSolver("testbig1");
      mazeSolver.solveMaze();
      // We must try-catch InvalidSymbolException since it is checked exception
      try {
          MazeElement[][] expected = {
              {new MazeElement("*"), new MazeElement("*"), new MazeElement("*"), new MazeElement("*")},
              {new MazeElement("X"), new MazeElement("X"), new MazeElement("X"), new MazeElement("*")},
              {new MazeElement("X"), new MazeElement("X"), new MazeElement("X"), new MazeElement("*")},
              {new MazeElement("X"), new MazeElement("X"), new MazeElement("X"), new MazeElement("*")},
              {new MazeElement("X"), new MazeElement("X"), new MazeElement("X"), new MazeElement("*")},
              {new MazeElement("X"), new MazeElement("X"), new MazeElement("X"), new MazeElement("*")}
          };

          // Use assert to check our implementation correctness
          assert MazeSolver.mazeMatch(expected, mazeSolver.getMaze());
      }
      // Since there is no invalid symbol, this should not be executed
      catch (InvalidSymbolException e) {
          assert false : "The two mazes should match";
      }

      // Write the maze into output1. You can then eyeball the correctness of
      // the file content.
      mazeSolver.writeMaze("bigOutput1");
    }

    /**
     * Test the implementation of {@code MazeSolver} constructor and {@code writeMaze}.
     * This time we want to solve an unsolvable maze.
     */
    public static void testBig2() {
      MazeSolver mazeSolver = new MazeSolver("testbig2");

      try {
          mazeSolver.solveMaze();
          // This about why the following line should not be reached
          assert false : "This maze should never be solved";
      }
      catch (UnsolvableMazeException e) {
          System.out.println("Successfully caught UnsolvableMazeException");
          System.out.println(e.getMessage());
      }
    }

    /**
     * method that runs all the unitTests
     */
    public static void unitTests() {
      testMazeMatch();
      testReadWriteInput1();
      testReadWriteInput2();

      testMazeElement1();
      testMazeElement2();
      testOutput1();
      testBig1();
      testBig2();
    }

    /**
     * main method for Assignment7
     *
     * @param args: array of strings
     */
    public static void main(String[] args) {
      unitTests();
      // MazeSolver mz1 =  new MazeSolver("testbig1");
      // mz1.solveMaze();
      // MazeSolver mz2 =  new MazeSolver("testbig2");
      // mz2.solveMaze();
    }
  }
