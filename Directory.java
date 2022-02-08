///////////////////////////////////////////////////////////////////////////////
//                   ALL STUDENTS COMPLETE THESE SECTIONS
// Main Class File:    Assignment9.java
// File:               Directory.java
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
import java.util.ArrayList;
/**
 * class with list of FSComponent objects in componentLists
 *
 * Bugs: none
 *
 * @author Rizq Khateeb
 */
public abstract class Directory extends FSComponent {

    private ArrayList<FSComponent> componentList;

    /**
     * No-arg constructor.
     * DO NOT CHANGE!
     */
    public Directory() {
        super("Directory");
    }

    /**
     * arg constructor
     *
     * @param name: name of Directory
     */
    protected Directory(String name) {
        super(name);
        this.componentList = new ArrayList<FSComponent>();
    }

    /**
     * Public getter that retrieves instance variable - componentList.
     * DO NOT CHANGE!
     *
     * @return the componentList instance variable
     */
    public ArrayList<FSComponent> getComponentList() {
        return this.componentList;
    }

    /**
     * Public setter that mutate instance variable - componentList.
     * DO NOT CHANGE!
     *
     * @param componentList the new componentList variable to be assigned
     */
    public void setComponentList(ArrayList<FSComponent> componentList) {
        this.componentList = componentList;
    }

    /**
     * Add a component to the end of the {@code this.componentList}.
     * DO NOT CHANGE!
     *
     * @param newComp the new component to be appended
     */
    public void appendComponent(FSComponent newComp) {
        this.componentList.add(newComp);
        newComp.setParentDir(this);
    }

    /**
     * adds a new FSComponent to componentList
     *
     * @param newComp: FSComponent you want to add
     * @return true if can be added
     */
    public boolean addComponent(FSComponent newComp) {
      boolean okToAdd = true;
      //if componentList empty, append and set new parent directory
      if(componentList.size() == 0){
        appendComponent(newComp);
        return true;
      }
      else{
          //for every element in the componentList
          for(int i = 0; i< componentList.size(); i++){
            //if newComp a file with the same name as any member of
            //componentList, not ok to add
            if(newComp instanceof File == true &&
            componentList.get(i) instanceof File == true &&
            newComp.getName().equals(componentList.get(i).getName())){
              okToAdd = false;
              break;
            }
            //if newComp a directory with the same name as any member of
            //componentList, not ok to okToAdd
            else if(newComp instanceof Directory == true &&
            componentList.get(i) instanceof Directory == true &&
            newComp.getName().equals(componentList.get(i).getName())){
              okToAdd = false;
              break;
            }
          }
          //if ok to add, append and set new parent directory
          if (okToAdd == true) {
            appendComponent(newComp);
            return true;
          }
          else {
            return false;
          }
      }
    }

    /**
     * prints all files and directories in current directory
     */
    public void printDirectory() {
      System.out.println(this.toString());
      //for every element in the componentList
      for(int i = 0; i < componentList.size(); i++){
        System.out.println("\t"+componentList.get(i).toString());
      }
    }

    /**
     * recursive helper method for printStructure()
     *
     * @param dir: directory we are trying to print
     * @param tabs: string that indicates how many tabs we want before the
     * toString() for an object
     */
    public void printDir(Directory dir, String tabs){
      //print the initial directory
      System.out.println(tabs + dir.toString());
      //for each element in directory
      for(int i = 0; i < dir.getComponentList().size(); i++){
        //if directory, use recursion to go through the next directory
        if (dir.getComponentList().get(i) instanceof Directory) {
          printDir((Directory)dir.getComponentList().get(i), tabs + "\t");
        }
        //else, tab and print the directory component
        else{
          System.out.println(tabs+ "\t"+ dir.componentList.get(i).toString());
        }
      }
    }

    /**
     * prints all the files and directories within each directory
     */
    public void printStructure() {
      printDir(this, "");
    }

    /**
     * recursive helper method for getSize()
     *
     * @param dir: directory for which we are looking at the files within
     * @return sumSize: combined size of files
     */
    public int sumFileSize(Directory dir){
      //initialize sum size
      int sumSize = 0;
      //for each element in directory
      for(int i = 0; i < dir.getComponentList().size(); i++){
        //if file, get size and add to sumSize
        if (dir.getComponentList().get(i) instanceof File) {
          sumSize += dir.getComponentList().get(i).getSize();
        }
        else if (dir.getComponentList().get(i) instanceof Directory){
          sumSize += sumFileSize((Directory)dir.getComponentList().get(i));
        }
      }
      return sumSize;
    }

    /**
     * calculates and returns sum of all file sizes under current folder
     *
     * @return sumFileSize(this): combined size of files for directory upon
     * which it is called
     */
    @Override
    public int getSize() {
      return sumFileSize(this);
    }
}
