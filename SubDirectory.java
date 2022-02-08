///////////////////////////////////////////////////////////////////////////////
//                   ALL STUDENTS COMPLETE THESE SECTIONS
// Main Class File:    Assignment9.java
// File:               SubDirectory.java
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
 * extends Directory abstract class
 *
 * Bugs: None
 *
 * @author CSE 8B Staff
 */
public class SubDirectory extends Directory
  implements Mutable{

  private Directory parentDir;

  /**
   * No-arg constructor. DO NOT CHANGE!
   */
  public SubDirectory() {}

  /**
   * arg constructor
   *
   * @param name: name of file
   * @param size: size of file
   */
  public SubDirectory(String name) {
    super(name);
  }

  /**
   * sets parent directory
   *
   * @param parentDir: ParentDir you want to set to
   * @param size: size of file
   */
  public void setParentDir(Directory parentDir){
    this.parentDir = parentDir;
  }

  /**
   * gets parent directory
   *
   * @return parentDir
   */
  public Directory getParentDir(){
    return this.parentDir;
  }

  /**
   * renames a SubDirectory in componentList
   *
   * @param name: string you want to rename NormalFile with
   * @return true if can be renamed
   */
  @Override
  public boolean rename(String name) {
    //rename if no parent directory
    if(this.getParentDir() == null){
      this.setName(name);
      return true;
    }
    else{
      //for all elements in componentList
      for(int i = 0; i < this.getParentDir().getComponentList().size();
      i++){
        //if instance of Directory and equal names, return false
        if(this.getParentDir().getComponentList().get(i) instanceof Directory
        && this.getParentDir().getComponentList().get(i).getName().equals(name)){
          return false;
        }
      }
      //set name and return true
      this.setName(name);
      return true;
    }
  }

  /**
   * recursive helper method for finding a ProtectedFile
   *
   * @param dir: directory for which we are looking at the files within
   * @return true if instance of ProtectedFile found
   */
  public boolean hasProtected(Directory dir){
    //for each element in directory
    for(int i = 0; i < dir.getComponentList().size(); i++){
      //return true if there's a protected file
      if (dir.getComponentList().get(i) instanceof ProtectedFile){
        return true;
      }
      else if (dir.getComponentList().get(i) instanceof Directory) {
        //recursion to check for protected files anywhere in directory
        if (hasProtected((Directory)dir.getComponentList().get(i)) == true){
          return true;
        }
      }
    }
    return false;
  }

  /**
   * deletes the SubDirectory from componentList
   * does not delete if contains a ProtectedFile
   *
   * @return true if can be deleted
   */
  @Override
  public boolean delete() {
    //return false and do not delete if there is a protected file
    if (hasProtected(this) == true){
      return false;
    }
    //for each element in componentList
    for(int i = 0; i < this.getParentDir().getComponentList().size();i++){
      //if element exists in componentList
      if (this.equals(this.getParentDir().getComponentList().get(i))
      == true){
        //remove from componentList, and set parentDir to null
        this.getParentDir().getComponentList().remove(i);
        this.setParentDir(null);
        return true;
      }
    }
    return true;
  }

  /**
   * moves a SubDirectory from one Directory to another
   *
   * @param dir: Directory to move to
   * @return true if can be added
   */
  @Override
  public boolean moveTo(Directory dir) {
    //if componentList empty, delete and add element to new componentList
    if (dir.getComponentList().size() == 0){
      this.delete();
      dir.addComponent(this);
      return true;
    }
    else{
      //for each element in componentList
      for(int i = 0; i < dir.getComponentList().size(); i++){
        //if element a file and has equal name, return false
        if(dir.getComponentList().get(i) instanceof Directory &&
        dir.getComponentList().get(i).getName().equals(this.getName())){
          return false;
        }
        //else, delete and add element to new componentList
        else{
          this.delete();
          dir.addComponent(this);
          return true;
        }
      }
    }
    return false;
  }

  /**
   * returns SubDirectory as a string
   *
   * @return string containing SubDirectory
   */
  @Override
  public String toString() {
      return "Sub Directory: " + this.getName();
  }
}
