import java.util.Scanner;
// Import the Scanner class
// NOTE: YOU SHOULD NOT HAVE TO IMPORT ANY OTHER PACKAGES TO COMPLETE THIS ASSIGNMENT.
//       If you add extraneous packages (intentionally or not),
//       then your code might fail Gradescope compilation.

// TODO: Complete class header
///////////////////////////////////////////////////////////////////////////////
//                   ALL STUDENTS COMPLETE THESE SECTIONS
// Title:              Assignment2
// Files:              Assignment2.java
// Quarter:            CSE8B Fall 2021
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
// Persons:          None
//
// Online sources:   Google was used to find the correct methods of scanner
//                   to use for char, int, double, etc.
//////////////////////////// 80 columns wide //////////////////////////////////

/**
 * A main class for Assignment 2 that consists od 3 methods, unit tests,
 * and a main method.
 *
 * Bugs: None
 *
 * @author Rizq Khateeb
 */
public class Assignment2 {

    // Feel free to create extra variables if necessary.

    // Method names
    private final static String METHOD1_STR = "tetrahedronVolume";
    private final static String METHOD2_STR = "reciprocalSum";
    private final static String METHOD3_STR = "drawDiamond";

    // Variables used for tetrahedronVolume
    private final static String ERR_MSG_VOL_OUT_OF_RANGE =
            "INVALID INPUT: out of range [0, 15]";
    private final static int MIN_EDGE_LENGTH = 0;
    private final static int MAX_EDGE_LENGTH = 15;
    private final static int CUBED = 3;
    private final static double TETRA_VOL_DENOMINATOR = 6 * Math.sqrt(2);

    // Variables used for reciprocalSum
    private final static String ERR_MSG_REC_OUT_OF_RANGE =
            "INVALID INPUT: out of range [1, 20]";
    private final static int MIN_VALUE = 1;
    private final static int MAX_VALUE = 20;

    // Variables used for drawDiamond
    private final static String ERR_MSG_DIAMOND_OUT_OF_RANGE =
            "INVALID INPUT: out of range [1, 10]";
    private final static int MIN_HEIGHT = 1;
    private final static int MAX_HEIGHT = 10;
    private final static int DOUBLE = 2;

    // Variables used for main
    private final static String PROMPT_MSG_METHOD =
            "Which method do you want to call? Type \"end\" to stop the program.";
    private final static String PROMPT_MSG_EDGE = "Please enter an edge length (as a double).";
    private final static String PROMPT_MSG_VALUE = "Please enter an integer.";
    private final static String PROMPT_MSG_CH = "Please enter a character.";
    private final static String PROMPT_MSG_HEIGHT = "Please enter a height (as an integer).";
    private final static String ERR_MSG_INVALID_METHOD = "Invalid method - " + "options are: tetrahedronVolume, reciprocalSum, and drawDiamond.";
    private final static String END_STR = "end";

    /**
     * Calculates the volume of a tetrahedron given edge length
     *
     * @param edgeLength: double indicating the edge length
     * @return myStr: string indicating volume to 2 decimal places
     */
    public static String tetrahedronVolume(double edgeLength) {
        if ((edgeLength < MIN_EDGE_LENGTH) || (edgeLength > MAX_EDGE_LENGTH)){
          return ERR_MSG_VOL_OUT_OF_RANGE;
        }
        else{
          double vol = (Math.pow(edgeLength, CUBED))/(TETRA_VOL_DENOMINATOR);
          String myStr = String.format("%.2f", vol);
          //System.out.println(myStr);
          return myStr;
        }
    }

    /**
     * Calculates reiprocal sum for an integer
     *
     * @param value: int for which reciprocal sum is to be found
     * @return myStr: string indicating reciprocal sum
     */
    public static String reciprocalSum(int value) {
        if ((value < MIN_VALUE) || (value > MAX_VALUE)){
          return ERR_MSG_REC_OUT_OF_RANGE;
        }
        else {
          double reciprocal_sum = 0;
          for(double i = 1.0; i <= value; i++){
            reciprocal_sum += (1/i);
            //System.out.println(reciprocal_sum);
          }
          String myStr = String.format("%.4f", reciprocal_sum);
          //System.out.println(myStr);
          return myStr;
        }
    }

    /**
     * Draws a diamond using the inputted character and height
     *
     * @param ch: character with which diamond is drawn
     * @param height: height of the diamond
     * @return str: string that draws out diamond
     */
    public static String drawDiamond(char ch, int height) {
        if ((height <= MIN_HEIGHT) || (height >= MAX_HEIGHT)){
          return ERR_MSG_DIAMOND_OUT_OF_RANGE;
        }
        else {
          String str = "";
          // rows from top to middle (top half)
          for(int row=1; row<=height; row++){
            // upper left quarter of diamond
            for(int i=1; i<=height; i++){
              if (i == height-row+1) {
                str = str + ch;
              }
              else {
                str = str + " ";
              }
            }
            // upper right quarter of diamond
            for(int i=height; i>=1; i--){
              if (i == height-row+1) {
                str = str + ch + "\n";
                break;
              }
              else {
                str = str + " ";
              }
            }
          }
          // rows from middle to bottom (lower half)
          for(int row=height; row>=1; row--){
            // bottom left quarter of diamond
            for(int i=1; i<=height; i++){
              if (i == height-row+1) {
                str = str + ch;
              }
              else {
                str = str + " ";
              }
            }
            // bottom right quarter of diamond
            for(int i=height; i>=1; i--){
              if (i == height-row+1) {
                str = str + ch + "\n";
                break;
              }
              else {
                str = str + " ";
              }
            }
          }
          return str;
        }
    }

    // Magic numbers, comments, and longer than 80 character is OK for testing!
    public static boolean unitTests() {
        // Test(s) for tetrahedronVolume
        // Test case 1: edgeLength = 3
        double edgeLength = 3.0;
        String expectedOutput = "3.18";
        if (!tetrahedronVolume(edgeLength).equals(expectedOutput)) {
            System.out.println("FAILED: tetrahedronVolume 1");
            return false;
        }
        // Test case 2: edgeLength = 2.4
        edgeLength = 2.4;
        expectedOutput = "1.63";
        if (!tetrahedronVolume(edgeLength).equals(expectedOutput)) {
            System.out.println("FAILED: tetrahedronVolume 2");
            return false;
        }
        // Test case 3: edgeLength = 1.5
        edgeLength = 1.5;
        expectedOutput = "0.40";
        if (!tetrahedronVolume(edgeLength).equals(expectedOutput)) {
            System.out.println("FAILED: tetrahedronVolume 2");
            return false;
        }
          // Test case 4: edgeLength = 16
          edgeLength = 16;
          expectedOutput = ERR_MSG_VOL_OUT_OF_RANGE;
          if (!tetrahedronVolume(edgeLength).equals(expectedOutput)) {
              System.out.println("FAILED: tetrahedronVolume 2");
              return false;
          }

        // Test(s) for reciprocalSum
        // Test case 1: value = 5
        int value = 5;
        expectedOutput = "2.2833";
        if (!reciprocalSum(value).equals(expectedOutput)) {
            System.out.println("FAILED: reciprocalSum 1");
            return false;
        }
        // Test case 2: value = 2
        value = 2;
        expectedOutput = "1.5000";
        if (!reciprocalSum(value).equals(expectedOutput)) {
            System.out.println("FAILED: reciprocalSum 1");
            return false;
        }
        // Test case 3: value = 10
        value = 10;
        expectedOutput = "2.9290";
        if (!reciprocalSum(value).equals(expectedOutput)) {
            System.out.println("FAILED: reciprocalSum 1");
            return false;
        }
        // Test case 4: value = 21
        value = 21;
        expectedOutput = ERR_MSG_REC_OUT_OF_RANGE;
        if (!reciprocalSum(value).equals(expectedOutput)) {
            System.out.println("FAILED: reciprocalSum 1");
            return false;
        }

        // Test(s) for drawDiamond
        // Test case 1: ch = '*', height = 5
        char ch = '*';
        int height = 5;
        expectedOutput = "    **\n   *  *\n  *    *\n *      *\n*        *\n*        *\n *      *\n  *    *\n   *  *\n    **\n";
        if (!drawDiamond(ch, height).equals(expectedOutput)) {
            System.out.println("FAILED: drawDiamond 1");
            return false;
        }
        // Test case 2: ch = '!', height = 1
        ch = '!';
        height = 1;
        expectedOutput = ERR_MSG_DIAMOND_OUT_OF_RANGE;
        if (!drawDiamond(ch, height).equals(expectedOutput)) {
            System.out.println("FAILED: drawDiamond 1");
            return false;
        }
        // Test case 3: ch = '!', height = 2
        ch = '!';
        height = 2;
        expectedOutput = " !!\n!  !\n!  !\n !!\n";
        if (!drawDiamond(ch, height).equals(expectedOutput)) {
            System.out.println("FAILED: drawDiamond 1");
            return false;
        }
        // Test case 4: ch = 'a', height = 3
        ch = 'a';
        height = 3;
        expectedOutput = "  aa\n a  a\na    a\na    a\n a  a\n  aa\n";
        if (!drawDiamond(ch, height).equals(expectedOutput)) {
            System.out.println("FAILED: drawDiamond 1");
            return false;
        }
        // All test cases passed
        return true;
    }

    /**
     * Main method for Assignment2
     *
     * @param args: array of strings
     */
     public static void main(String[] args) {
        // Perform unitTests first
     		if (unitTests()) {
     			System.out.println("All unit tests passed.\n");
     		} else {
     			System.out.println("ERROR: Failed test.\n");
     			return;
     		}

        // Start the user-machine interaction
        // Initialize Scanner object
        Scanner userInput = new Scanner(System.in);

        // Continuously loop until the user inputs "end"
        boolean keepRunning = true;
        while (keepRunning == true) {
            // Complete user-machine interaction here
            String chosenMethod;
            System.out.println(PROMPT_MSG_METHOD);
            userInput.reset();
            chosenMethod = userInput.next();
            // based on user input, switch to appropriate method
            switch(chosenMethod) {
              case METHOD1_STR:
                System.out.println(PROMPT_MSG_EDGE);
                double edgeLength = userInput.nextDouble();
                System.out.println(tetrahedronVolume(edgeLength) + "\n");
                break;
              case METHOD2_STR:
                System.out.println(PROMPT_MSG_VALUE);
                int value = userInput.nextInt();
                System.out.println(reciprocalSum(value) + "\n");
                break;
              case METHOD3_STR:
                System.out.println(PROMPT_MSG_CH);
                char ch = userInput.next().charAt(0);
                System.out.println(PROMPT_MSG_HEIGHT);
                int height = userInput.nextInt();
                System.out.println(drawDiamond(ch,height) + "\n");
                break;
              case END_STR:
                keepRunning = false;
                break;
              default:
                System.out.print(ERR_MSG_INVALID_METHOD + "\n\n");
            }
        }
        // closing scanner
        userInput.close();
    }
}
