///////////////////////////////////////////////////////////////////////////////
//                   ALL STUDENTS COMPLETE THESE SECTIONS
// Main Class File:    Assignment9.java
// File:               File.java
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
 * class for files
 *
 * Bugs: none
 *
 * @author Rizq Khateeb
 */
public abstract class File extends FSComponent {

    private int size;
    private Directory parentDir;

    /**
     * No-arg constructor. DO NOT CHANGE!
     */
    public File() {
        super("File");
    }

    /**
     * arg constructor
     *
     * @param name: name of file
     * @param size: size of file
     */
    public File(String name, int size) {
      super(name);
      this.size = size;
    }

    /**
     * Public setter that mutates instance variable - size
     * DO NOT CHANGE!
     *
     * @param size instance variable - size
     */
    public void setSize(int size) {
        this.size = size;
    }

    /**
     * Public getter that retrieves instance variable - size
     * DO NOT CHANGE!
     *
     * @return instance variable - size
     */
    @Override
    public int getSize() {
        return this.size;
    }

    /**
     * Public getter that retrieves instance variable - parentDir
     * DO NOT CHANGE!
     *
     * @return instance variable - parentDir
     */
    public Directory getParentDir() {
        return this.parentDir;
    }

    /**
     * Public setter that mutates instance variable - parentDir
     * DO NOT CHANGE!
     *
     * @param parentDir instance variable - parentDir
     */
    @Override
    public void setParentDir(Directory parentDir) {
        this.parentDir = parentDir;
    }
}
