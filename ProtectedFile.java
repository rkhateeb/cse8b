///////////////////////////////////////////////////////////////////////////////
//                   ALL STUDENTS COMPLETE THESE SECTIONS
// Main Class File:    Assignment9.java
// File:               ProtectedFile.java
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
 * extends File abstract class
 *
 * Bugs: None
 *
 * @author Rizq Khateeb
 */
public class ProtectedFile extends File{
  /**
   * No-arg constructor
   */
  public ProtectedFile() {}

  /**
   * arg constructor
   *
   * @param name: name of file
   * @param size: size of file
   */
  public ProtectedFile(String name, int size) {
    super(name,size);
  }

  /**
   * returns ProtectedFile as a string
   *
   * @return string containing ProtectedFile
   */
  @Override
  public String toString() {
      return "Protected file: " + this.getName();
  }
}
