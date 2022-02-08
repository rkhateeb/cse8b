///////////////////////////////////////////////////////////////////////////////
//                   ALL STUDENTS COMPLETE THESE SECTIONS
// Main Class File:    Assignment6.java
// File:               List.java
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
 * Class for Lists. Superclass of IntegerList.java and StringList.java
 *
 * Bugs: None
 *
 * @author Rizq Khateeb
 */
public class List extends MyObject {
	private int length;

	/**
	 * no-arg constructor for List
	 */
	public List() {
		super("Undefined List", "List");
		length = 0;
	}

	/**
	 * arg constructor for List
	 *
	 * @param listType: type of list
	 * @param length: length of list
	 */
	public List(String listType, int length) {
		super(listType,"List");
		//if length less than 0, set length of list as 0
		if (length < 0){
      this.length = 0;
    }
    else {
      this.length = length;
    }
	}

	/**
	 * getter for list length
	 *
	 * @return length: length of list
	 */
	public int getListLength() {
		return length;
	}

	/**
   * Checks if two shapes are equal
   *
   * @param anotherObj: list you want to check if MyObject is equal to
   * @return boolean depending on if lists are equal
   */
	@Override
	public boolean equals(MyObject anotherObj) {
		//if List and anotherObj are same type and length, return true
		if (this.getType() == anotherObj.getType() &&
    this.getListLength() == anotherObj.getListLength()){
      return true;
    }
    else{
      return false;
    }
	}

	/**
   * Checks if a list is larger than another
   *
   * @param anotherObj: list you want to check if another MyObject
   * is larger than
   * @return boolean depending on if list is larger than other
   */
	@Override
	public boolean isLargerThan(MyObject anotherObj) {
		//if List and anotherObj are same highLevelType and List has a greater
    // length than anotherObj, return true
		if (this.getHighLevelType() == anotherObj.getHighLevelType() &&
    this.getListLength() > anotherObj.getListLength()){
      return true;
    }
    else{
      return false;
    }
	}

	/**
   * returns List as a string
   * @return result: string that includes List
   */
	@Override
	public String toString() {
		return super.toString() + " - Length: " + length;
	}
}
