///////////////////////////////////////////////////////////////////////////////
// Title:              Virtual File System
// File:               Assignment9.java
// Quarter:            Fall 2021
//
// Author:             CSE 8B Staff
// Email:              N/A
// Instructor's Name:  Benjamin Ochoa
///////////////////////////////////////////////////////////////////////////////

/**
 * The {@code Assignment9} class contains testers to test the functionality of
 * all other java classes.
 *
 * Bugs: None
 *
 * @author CSE 8B Staff
 */
public class Assignment9 {
     /**
      * A tester for the file system.
      * tests printStructure() to make sure we get expected output
      *
      * @return true if the tester passes
      */
     private static boolean testOne() {
         RootDirectory root = new RootDirectory("HOME");
         SubDirectory one = new SubDirectory("folder1");
         SubDirectory two = new SubDirectory("folder2");
         SubDirectory three = new SubDirectory("folder3");
         ProtectedFile config = new ProtectedFile(".config", 4);
         root.addComponent(one);
         one.addComponent(two);
         two.addComponent(three);
         three.addComponent(config);

         root.printStructure();
         System.out.println();

         /**
          * I expect `printStructure()` to show the following:
          * * * * * * * * * * * * * * * * * * * *
          *  Root Directory: Home
          *     Sub Directory: folder1
          *       Sub Directory: folder2
          *         Sub Directory: folder3
          *           Protected File: .config
          * * * * * * * * * * * * * * * * * * * *
          */

         return true;
    }

    /**
     * A tester for the file system.
     * tests delete() for NormalFile
     *
     * @return true if the tester passes
     */
    private static boolean testTwo() {
        RootDirectory root = new RootDirectory("HOME");
        SubDirectory one = new SubDirectory("folder1");
        SubDirectory two = new SubDirectory("folder2");
        SubDirectory three = new SubDirectory("folder3");
        NormalFile pdf = new NormalFile(".pdf", 2);

        root.addComponent(one);
        one.addComponent(two);
        two.addComponent(three);
        three.addComponent(pdf);

        root.printStructure();
        System.out.println();

        //we expect the delete to work, since there are no ProtectedFiles
        two.delete();
        root.printStructure();
        System.out.println();

        return true;
    }


     /**
      * A tester for the file system.
      * tests new delete() for SubDirectory
      *
      * @return true if the tester passes
      */
     private static boolean testThree() {
         RootDirectory root = new RootDirectory("HOME");
         SubDirectory one = new SubDirectory("folder1");
         SubDirectory oneFive = new SubDirectory("folder1.5");
         SubDirectory two = new SubDirectory("folder2");
         SubDirectory three = new SubDirectory("folder3");
         ProtectedFile config = new ProtectedFile(".config", 4);
         ProtectedFile redo = new ProtectedFile(".redo", 5);
         root.addComponent(one);
         root.addComponent(oneFive);
         one.addComponent(two);
         two.addComponent(three);
         three.addComponent(config);
         three.addComponent(redo);

         root.printStructure();
         System.out.println();

         //we expect the delete to not work, since there are ProtectedFiles
         if(two.delete() == false){
           root.printStructure();
           System.out.println();
           return true;
         }

         return false;
    }

    /**
     * A tester for the file system.
     * tests getSize() for ProtectedFiles
     *
     * @return return true if the tester passes
     */
    private static boolean testFour() {
        RootDirectory root = new RootDirectory("HOME");
        SubDirectory one = new SubDirectory("folder1");
        SubDirectory two = new SubDirectory("folder2");
        SubDirectory three = new SubDirectory("folder3");
        ProtectedFile config = new ProtectedFile(".config", 4);
        ProtectedFile redo = new ProtectedFile(".redo", 5);
        root.addComponent(one);
        one.addComponent(two);
        two.addComponent(three);
        three.addComponent(config);
        three.addComponent(redo);

        root.printStructure();
        System.out.println();

        //we expect the getSize() to return 9 here
        System.out.println("Sum of file sizes is " + root.getSize());

        return true;
   }

   /**
    * A tester for the file system.
    * tests getSize() for NormalFiles ProtectedFiles
    *
    * @return return true if the tester passes
    */
   private static boolean testFive() {
       RootDirectory root = new RootDirectory("HOME");
       SubDirectory one = new SubDirectory("folder1");
       SubDirectory oneFive = new SubDirectory("folder1.5");
       SubDirectory two = new SubDirectory("folder2");
       SubDirectory three = new SubDirectory("folder3");
       ProtectedFile config = new ProtectedFile(".config", 4);
       ProtectedFile redo = new ProtectedFile(".redo", 5);
       NormalFile pdf = new NormalFile(".pdf", 2);

       root.addComponent(one);
       root.addComponent(oneFive);
       one.addComponent(two);
       two.addComponent(three);
       three.addComponent(config);
       three.addComponent(redo);
       oneFive.addComponent(pdf);

       root.printStructure();
       System.out.println();

       //we expect the getSize() to return 11 here
       System.out.println("Sum of file sizes is " + root.getSize());

       return true;
  }


    /**
     * All unit tests. This method should be executed to ensure that all
     * methods are correctly implemented.
     *
     * @return true if all unit tests passed, false otherwise.
     */
    public static boolean unitTests() {
        if (testOne() == true &&
        testTwo() == true &&
        testThree() == true &&
        testFour() == true &&
        testFive() == true){
          return true;
        }
        else{
          return false;
        }
    }

    /**
     * The main method, where program execution begins.
     *
     * @param args Any command-line arguments.
     */
    public static void main(String[] args) {
        if (unitTests()) {
            System.out.println("All unit tests passed.\n");
        } else {
            System.out.println("Failed test.\n");
        }
    }
}
