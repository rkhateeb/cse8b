///////////////////////////////////////////////////////////////////////////////
//                   ALL STUDENTS COMPLETE THESE SECTIONS
// Main Class File:    Assignment9.java
// File:               NormalFile.java
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
public class NormalFile extends File
  implements Mutable{

  /**
   * No-arg constructor. DO NOT CHANGE!
   */
  public NormalFile() {}

  /**
   * arg constructor
   *
   * @param name: name of file
   * @param size: size of file
   */
  public NormalFile(String name, int size) {
    super(name,size);
  }

  /**
   * renames a NormalFile in componentList
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
         //if instance of file and equal names, return false
         if(this.getParentDir().getComponentList().get(i) instanceof File
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
   * deletes the NormalFile from componentList
   *
   * @return true if can be deleted
   */
  @Override
  public boolean delete() {
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
   * moves a NormalFile from one Directory to another
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
        if(dir.getComponentList().get(i) instanceof File &&
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
   * returns NormalFile as a string
   *
   * @return string containing NormalFile
   */
  @Override
  public String toString() {
      return "Normal file: " + this.getName();
  }
}
