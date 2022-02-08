import java.io.*;
import java.util.*;

//////////////////////////////////////////////////////////////////////////////
//                   ALL STUDENTS COMPLETE THESE SECTIONS
// Main Class File:    Assignment7.java
// File:               MazeSolver.java
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
 * Reads maze file, solves maze, and copies to new file
 *
 * Bugs: None
 *
 * @author Rizq Khateeb
 */
public class MazeSolver {
    private MazeElement[][] maze;

    /**
     * Public getter that retrieves private member variables - maze. DO NOT CHANGE.
     *
     * @return return the member variable - maze.
     */
    public MazeElement[][] getMaze() {
        return this.maze;
    }

    /**
     * Public setter that overrides private member variables - maze. DO NOT CHANGE.
     *
     * @param maze Maze to be stored.
     */
    public void setMaze(MazeElement[][] maze) {
        this.maze = maze;
    }

    /**
     * Public no-arg constructor. DO NOT CHANGE.
     */
    public MazeSolver() {}

    /**
     * arg constructor for MazeSolver
     *
     * @param fileToRead: file that is read in and later solved
     */
    public MazeSolver(String fileToRead) {
      File file = new File(fileToRead);
      int rows = 0;
      int columns = 0;
      //initialize scanner to initialize
      //open the scanner and read the file
      try (Scanner fileReader = new Scanner(new File(fileToRead))){
        //gets rows and columns from the file
        rows = fileReader.nextInt();
        columns = fileReader.nextInt();
        //System.out.println("rows = "+rows+" columns  = "+columns);
        //initialize maze dimensions
        this.maze = new MazeElement[rows][columns];
        for(int r = 0; r < rows ; r++){
          for(int c = 0; c < columns ; c++){
            String character = fileReader.next();
            MazeElement m = new MazeElement(character);
            //assign each MazeElement to its row and column
            maze[r][c] = m;
          }
        }
      }
      //handle exception if invalid symbol
      catch (InvalidSymbolException ex) {
        System.out.println(ex.getMessage());
      }
      //handle exception if file not found
      catch (FileNotFoundException ex) {
        System.out.println(ex.getMessage());
      }
    }

    /**
     * method to solve maze
     */
    public void solveMaze() {
      //initialize current row and current column to 0
      int currentRow = 0;
      int currentColumn = 0;
      //initialize max rows and columns as dimensions of maze
      int maxRows = maze.length;
      int maxColumns = maze[0].length;
      //initial boolean that will solve as true
      boolean keepSolving = true;
      try{
        while (keepSolving == true){
          //if current position of maze is EMPTY symbol, set to PATH symbol
          if(maze[currentRow][currentColumn].isEmpty() == true){
            maze[currentRow][currentColumn].setToPath();
            //System.out.println("going to row "+currentRow+"  column "+currentColumn);
            if (currentRow == maxRows-1 && currentColumn == maxColumns-1){
              System.out.println("Solved maze");
              keepSolving = false;
              continue;
            }
            //if the current row +1 (because indexing) is less than max rows,
            //increment down a row
            if (currentRow+1 < maxRows){
              if(maze[currentRow+1][currentColumn].isEmpty() == true){
                currentRow++;
              }
              else{
                //if the current column +1 (because indexing) is less than max
                //columns, increment down a column
                if (currentColumn+1 < maxColumns){
                  if (maze[currentRow][currentColumn+1].isEmpty() == true){
                    currentColumn++;
                  }
                  //if these conditions are not met, turn keepSolving to false
                  //so while loop will stop
                  else{
                    keepSolving = false;
                    throw new UnsolvableMazeException();
                  }
                }
              }
            }
            //if these conditions are not met, turn keepSolving to false
            //so while loop will stop
            else{
              keepSolving = false;
              throw new UnsolvableMazeException();
            }
          }
          else{
            keepSolving = false;
            throw new UnsolvableMazeException();
          }
        }
        //if MazeSolver does not end at last element,
        //throw UnsolvableMazeException
        if (maze[maxRows-1][maxColumns-1].isPath() != true){
          throw new UnsolvableMazeException();
        }
      }
      catch (UnsolvableMazeException ex) {
        System.out.println(ex.getMessage());
        throw ex;
      }
    }

    /**
     * writes maze to a file
     *
     * @param fileToWrite: file you want to write maze to
     */
    public void writeMaze(String fileToWrite) {
      File writingFile = null;
      PrintWriter output = null;

      try {
        writingFile = new File(fileToWrite);
        output = new PrintWriter(writingFile);
      }
      //handle exception if file not found
      catch (FileNotFoundException ex) {
        System.out.println(ex.getMessage());
      }
      //initialize rows and columns
      int rows = maze.length;
      int columns = maze[0].length;
      //write maze dimensions
      output.print(rows + " " + columns+"\n");
      for(int r = 0; r < rows ; r++){
        for(int c = 0; c < columns ; c++){
          //if last entry in row, move to next line
          if (c == columns-1){
            output.print(maze[r][c].getSymbol()+"\n");
          }
          //if not last entry in row, add space
          else{
            output.print(maze[r][c].getSymbol()+" ");
          }
        }
      }
      //close PrintWriter
      output.close();

    }

    /**
     * compares two MazeElement
     *
     * @param maze1: One of the MazeElement you want to compare
     * @param maze2: One of the MazeElement you want to compare
     * @return true if mazes are deep equal to each other
     */
    public static boolean mazeMatch(MazeElement[][] maze1, MazeElement[][] maze2) {
      //compare rows
      if (maze1.length != maze2.length){
        return false;
      }
      //compare columns
      if (maze1[0].length != maze2[0].length){
        return false;
      }
      //compare each symbol in each element
      for (int r = 0; r < maze1.length; r++){
        for (int c = 0; c < maze1[0].length; c++){
          if (maze1[r][c].getSymbol().equals(maze2[r][c].getSymbol()) != true){
           return false;
          }
        }
      }
      return true;
    }
}
