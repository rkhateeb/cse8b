///////////////////////////////////////////////////////////////////////////////
// Main Class File:    Assignment3.java
// File:               My2DList.java
// Quarter:            Fall 2021
//
// Author:             Rizq Khateeb, rkhateeb@ucsd.edu
// Instructor's Name:  Ben Ochoa
//
//////////////////// STUDENTS WHO GET HELP FROM OTHER THAN THEIR PARTNER //////
//                   fully acknowledge and credit all sources of help,
//                   other than Instructors and TAs.
//
// Persons:
//
// Online sources:   Stackoverflow.com
//                   w3schools.com
//                   Used to check concepts such as array comparison
//////////////////////////// 80 columns wide //////////////////////////////////
/**
 * Implements a 2-dimesional list with methods to flip, rotate, and transpose
 *
 * Bugs: None
 *
 * @author Rizq Khateeb
 */
public class My2DList {
  int[][] array;

    /**
     * No-arg constructor
     */
    public My2DList() {
      array = null;
    }

    /**
     * Constructor with argument specifying dimensions of list.
     *
     * @param nRow: The number of rows in the list
     * @param nColumn: The number of columns in the list
     */
    public My2DList(int nRow, int nColumn) {
        array = new int[nRow][nColumn];
    }


    /**
     * Getter that retrives {@Code array} member variable
     * @return {@Code array} member variable
     */
    public int[][] getArray() {
        return array;
    }

    /**
     * Setter that mutates {@Code array} member variable
     * @param array {@Code array} member variable
     */
    public void setArray(int[][] newArray) {
        array = newArray;
    }

    /**
     * Horizontally flips an array
     */
    public void horizontalFlip() {
      //create new array with same dimensions
      int[][] newArray = new int[array.length][array[0].length];
      //for each row
      for (int row = 0; row < array.length; row++){
        int newColNum = 0;
        //for each column
        for (int column=array[row].length-1; column >=0 ; column--){
          //copy columns in a reverse order
          newArray[row][newColNum] = array[row][column];
          newColNum++;
        }
      }
      array = newArray;
    }

    /**
     * Vertically flips an array
     */
    public void verticalFlip() {
      //create new array with same dimensions
      int[][] newArray = new int[array.length][array[0].length];
      //for each row
      for (int row = array.length-1; row >= 0; row--){
        int newRowNum = 0;
        //for each column
        for (int column = 0; column < array[row].length; column++){
          //copy rows in a reverse order
          newArray[newRowNum][column] = array[row][column];
          newRowNum++;
        }
      }
      array = newArray;
    }

    /**
     * Transposes an array (rows to columns, columns to rows)
     */
    public void transpose() {
      //create new array that swtiches column and row dimensions
      int[][] newArray = new int[array[0].length][array.length];
      //for every row
      for (int row = 0; row < newArray.length; row++){
        //for every column
        for (int column = 0; column < newArray[row].length; column++){
          //copy rows to columns and vice versa
          newArray[row][column] = array[column][row];
        }
      }
      array = newArray;
    }

    /**
     * Rotates an array 90 degrees clockwise
     */
    public void rotate() {
        transpose();
        horizontalFlip();
    }

    /**
     * Prints the array (used for checking correctness of methods)
     */
    public void printArray() {
      System.out.println();
      //for each row
      for (int row = 0; row < array.length; row++){
        //for each column
        for (int column = 0; column < array[row].length; column++){
          System.out.printf("%5d", array[row][column]);
        }
        System.out.println();
      }
      System.out.println();
    }

}
