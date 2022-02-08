///////////////////////////////////////////////////////////////////////////////
//                   ALL STUDENTS COMPLETE THESE SECTIONS
// Main Class File:    Assignment6.java
// File:               IntegerList.java
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
 * Class for lists of Integers
 *
 * Bugs: None
 *
 * @author Rizq Khateeb
 */
public class IntegerList extends List {
  private int[] integers;

  /**
   * no-arg instructor for IntegerList
   */
	public IntegerList() {
		super("Integer List", 1);
		integers = new int[1];
	}

  /**
   * arg instructor for IntegerList
   *
   * @param list: list of integers
   */
	public IntegerList(int[] list) {
    super("Integer List", list.length);
		integers = list;
	}

  /**
   * Checks if two IntegerLists are equal
   *
   * @param anotherObj: list you want to check if MyObject is equal to
   * @return boolean depending on if lists are equal
   */
	@Override
	public boolean equals(MyObject anotherObj) {
    //if list types are not equal, return false
    if (this.getType() != anotherObj.getType()){
      return false;
    }
    //if list lengths are not equal return false
    if (this.getListLength() != anotherObj.getListLength()){
      return false;
    }
    //for length of list integers
    for (int i =0; i < integers.length; i++){
      //if list values at index i are not equal return false
      if (integers[i] != anotherObj.getIntegerAt(i)){
        return false;
      }
    }
    return true;
	}

  /**
   * gets integer at certain index of IntegerList
   *
   * @param idx: index for the integer you want to return from list
   * @return integers[idx]: the integer you want to return from the list
   */
	public int getIntegerAt(int idx) {
		return integers[idx];
	}

  /**
	 * Checks if a IntegerList is larger than another
	 *
	 * @param anotherObj: list you want to check if another MyObject
	 * is larger than
	 * @return boolean depending on if list is larger than other
	 */
	@Override
	public boolean isLargerThan(MyObject anotherObj) {
    int sumObjOne = 0;
    int sumObjTwo = 0;
    //for the values in IntegerList
    for (int i = 0; i < this.getListLength(); i++){
      sumObjOne += integers[i];
    }
    //for the values in anotherObj
    for (int i = 0; i < anotherObj.getListLength(); i++){
      sumObjTwo += anotherObj.getIntegerAt(i);
    }
    //return true if sumObjOne greater than sumObjTwo
    if (sumObjOne > sumObjTwo){
      return true;
    }
    else {
      return false;
    }
	}

  /**
   * Adds the elements of one IntegerList to another
   *
   * @param @param anotherObj: IntegerList you want to add to MyObject
   * @return NewIntegerList: IntegerList with the elements of the list added up
   */
	public MyObject add(MyObject anotherObj) {
    int[] newList = new int[0];
    //if list length of IntegerList is greater than anotherObj
    if (this.getListLength() >= anotherObj.getListLength()){
      newList = new int[this.getListLength()];
      //for all the elements in IntegerList copy them
      for(int i = 0; i< this.getListLength(); i++){
        newList[i] = integers[i];
      }
      //for all the elements in anotherObj add them
      for(int j = 0; j < anotherObj.getListLength(); j++){
        newList[j] += anotherObj.getIntegerAt(j);
      }
    }
    //if list length of IntegerList is less than anotherObj
    else if (this.getListLength() < anotherObj.getListLength()){
      newList = new int[anotherObj.getListLength()];
      //for all the elements in anotherObj copy them
      for(int i = 0; i< anotherObj.getListLength(); i++){
        newList[i] = anotherObj.getIntegerAt(i);
      }
      //for all the elements in IntegerList add them
      for(int j = 0; j < this.getListLength(); j++){
        newList[j] += integers[j];
      }
    }
    IntegerList NewIntegerList = new IntegerList(newList);
    return NewIntegerList;
	}

  /**
   * dividesd elements of IntegerList by a certain denominator
   *
   * @param denominator: int you want to divide elements of IntegerList by
   * @return NewIntegerList: IntegerList with the elements of the list divided
   * by denominator
   */
	public MyObject divideByInteger(int denominator) {
    //set denominator to  1 if input is negative
    if (denominator <= 0){
      denominator = 1;
    }
    int[] newList = new int[this.getListLength()];
    //for all the elements in IntegerList divide
    for (int i =0; i < this.getListLength(); i++){
      int dividedInt = integers[i]/denominator;
      newList[i] = dividedInt;
    }
    //create new IntegerList with contents divided
    IntegerList NewIntegerList = new IntegerList(newList);
    return NewIntegerList;
	}

  /**
   * returns IntegerList as a string
   * @return result: string that includes IntegerList
   */
	@Override
	public String toString() {
		String result =  super.toString() + ", Elements: [";
    //for all the elements in IntegerList
    for (int i = 0; i < this.getListLength() - 1; i++) {
			result += "" + integers[i] + ", ";
		}
		result += "" + integers[this.getListLength() - 1] + "]";
    //return IntegerList as a string
    return result;
	}
}
