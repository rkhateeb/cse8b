///////////////////////////////////////////////////////////////////////////////
// Title:              Assignment3
// Files:              Assignment3.java, MyList.java, My2DList.java
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
// Persons:
//
// Online sources:   Stackoverflow.com
//                   w3schools.com
//                   Used to check concepts such as array comparison
//////////////////////////// 80 columns wide //////////////////////////////////
/**
 * Main class that tests the classes MyList and My2DList
 *
 * Bugs: None
 *
 * @author Rizq Khateeb
 */
 // Inside Bird.java
 class Bird {
   String name;
   int age;
   Bird friend;
 }

public class Assignment3 {
//import java.util.ArrayList;
    /**
     * Sample tester that tests functionality of MyList.append()
     * @return true if the tester passes
     */
    private static boolean testMyListAppend() {
        MyList list = new MyList(2);
        for (int i = 0; i < 3; i++) {
            list.append(i);
        }
        if (list.array.length != 4) {
            System.out.println("Array length is incorrect!");
            return false;
        }
        if (list.size != 3) {
            System.out.println("MyList size is incorrect!");
            return false;
        }
        for (int i = 0; i < 3; i++) {
            if (list.array[i] != i) {
                System.out.println("Values after append are unexpected!");
                return false;
            }
        }
        return true;
    }

    /**
     * Sample tester that tests functionality of MyList.get().
     * @return true if the tester passes
     */
    private static boolean testMyListGet() {
        MyList list = new MyList(4);
        list.append(1);
        list.append(6);
        list.append(4);
        list.append(8);
        if (list.get(2) != 4){
          System.out.println("Unit test for MyListGet failed!");
          return false;
        }
        if (list.get(0) != 1){
          System.out.println("Unit test for MyListGet failed!");
          return false;
        }
        return true;
    }

    /**
     * Sample tester that tests functionality of My2DList.transpose()
     * @return true if the tester passes
     */
    private static boolean testMy2DListTranspose() {
        int[][] array = { { 1, 2, 3 }, { 4, 5, 6 }};
        int[][] expectedArray = { {1,4}, {2,5}, {3,6} };
        My2DList list2D = new My2DList();
        list2D.setArray(array);
        list2D.transpose();
        //for every row
        for (int row = 0; row < expectedArray.length; row++){
          //for every column
          for (int column = 0; column < expectedArray[row].length; column++){
            //check if expected entries in both arrays match
            if (expectedArray[row][column] != list2D.array[row][column]){
              System.out.println("Unit test for My2DListTranspose failed!");
              return false;
            }
          }
        }
      return true;
    }

    /**
     * Sample tester that tests functionality of My2DList.rotate()
     * @return true if the tester passes
     */
    private static boolean testMy2DListRotate() {
        int[][] array = { { 1, 2, 3 }, { 4, 5, 6 }};
        int[][] expectedArray = { {4,1}, {5,2}, {6,3} };
        My2DList list2D = new My2DList();
        list2D.setArray(array);
        list2D.rotate();
        //for every row
        for (int row = 0; row < expectedArray.length; row++){
          //for every column
          for (int column = 0; column < expectedArray[row].length; column++){
            //check if expected entries in both arrays match
            if (expectedArray[row][column] != list2D.array[row][column]){
              System.out.println("Unit test for My2DListRotate failed!");
              return false;
            }
          }
        }
      return true;
    }

    /**
     * Unit tests that test sample tasters
     * @return true if unit tests pass
     */
    public static boolean unitTests() {
        if (!testMyListAppend()) {
            return false;
        }
        if (!testMyListGet()) {
            return false;
        }
        if (!testMy2DListTranspose()) {
            return false;
        }
        if (!testMy2DListRotate()) {
            return false;
        }
        return true;
    }

    /**
     * main method
     */
    public static void main(String[] args) {
        if (unitTests()) {
            System.out.println("unitTests() passed.");
        }
        int[][][] array = {null,{{2,3,4}},new int[3][],{{0,1,2,3},{4,5,6},{12,13,14}}};
        System.out.println(array[3][2][1]);

        Bird bird = new Bird();
    System.out.println(bird.friend);
    System.out.println(bird.age);

    //ArrayList<Boolean> myList = new ArrayList<Boolean>();

    //int[][] arr = {{2,4,5},{2,3},{}};
    //System.out.println(arr[2][0]);

    int[] arr = new int[3];
    for (int column = 0; column < arr.length; column++){
      //check if expected entries in both arrays match

        System.out.println(arr[column]);

      }

    }
}
