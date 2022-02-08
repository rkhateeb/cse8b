Li///////////////////////////////////////////////////////////////////////////////
// Main Class File:    Assignment3.java
// File:               MyList.java
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
 * Implements a list with methods to append, pop, get, and index
 *
 * Bugs: None
 *
 * @author Rizq Khateeb
 */
public class MyList {
    int[] array;
    int size;

    /**
     * No-arg constructor
     */
    public MyList() {
        array = new int[1];
    }

    /**
     * constructor with argument specifying capacity of the initial list
     *
     * @param capacity: int that specifies initial capacity of list
     */
    public MyList(int capacity) {
      if (capacity < 1) {
        array = new int[1];
      }
      else {
        array = new int[capacity];
      }
      size = 0;
    }

    /**
     * Getter that retrives {@Code array} member variable
     * @return {@Code array} member variable
     */
    public int[] getArray() {
        return array;
    }

    /**
     * Getter that retrives {@Code size} member variable
     * @return {@Code size} member variable
     */
    public int getSize() {
        return size;
    }

    /**
     * Setter that mutates {@Code array} member variable
     * @param array {@Code array} member variable
     */
    public void setArray(int[] newArray) {
        array = newArray;
    }

    /**
     * Setter that mutates {@Code size} member variable
     * @param size {@Code size} member variable
     */
    public void setSize(int newSize) {
        size = newSize;
    }

    /**
     * Appends a value to list and increases length by 1
     *
     * @param x: int to be appended
     */
    public void append(int x) {
      if (size < array.length){
        array[size] = Math.abs(x);
        size++;
      }
      else{
        //create new array with double array size
        int[] newArray = new int[array.length * 2];
        //copy every location in the array
        for (int i = 0; i < array.length; i++){
          newArray[i] = array[i];
        }
        //append x to the new array
        newArray[array.length] = Math.abs(x);
        array = newArray;
        size++;
      }
    }

    /**
     * pops the last value off the list
     *
     * @return the element that was popped
     */
    public int pop() {
      if (size == 0){
        return -1;
      }
      else {
        int lastElement = array[size];
        size--;
        return lastElement;
      }
    }

    /**
     * gets the element at a said position
     *
     * @param i: int that serves as index for the value to retrieve
     * @return the element in index i of the list
     */
    public int get(int i) {
      if (i >= array.length) {
        return -1;
      }
      else {
        return array[i];
      }
    }

    /**
     * returns index of first element to match input
     *
     * @param x: int that you want to match with value in list
     * @return the index of the first element that matches x
     */
    public int index(int x) {
      for (int i = 0; i <= array.length; i++) {
        if (x == array[i]) {
          return i;
        }
      }
      return -1;
    }
}
