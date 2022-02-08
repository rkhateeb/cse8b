///////////////////////////////////////////////////////////////////////////////
//                   ALL STUDENTS COMPLETE THESE SECTIONS
// Main Class File:    Assignment6.java
// File:               StringList.java
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
 * Class for lists of Strings
 *
 * Bugs: None
 *
 * @author Rizq Khateeb
 */
public class StringList extends List{
  private String[] strings;

  /**
   * no-arg constructor for StringList
   */
	public StringList() {
		super("String List", 1);
		strings = new String[1];
	}

  /**
   * arg constructor for StringList
   *
   * @param list: list of Strings
   */
	public StringList(String[] list) {
    super("String List", list.length);
		strings = list;
	}

  /**
   * Checks if two StringLists are equal
   *
   * @param anotherObj: list you want to check if MyObject is equal to
   * @return boolean depending on if lists are equal
   */
	@Override
	public boolean equals(MyObject anotherObj) {
    //return false if StringList and anotherObj are different type
    if (this.getType() != anotherObj.getType()){
      return false;
    }
    //return false if StringList and anotherObj are different length
    if (this.getListLength() != anotherObj.getListLength()){
      return false;
    }
    //for all the elements in StringList
    for (int i =0; i < strings.length; i++){
      //return false if value at index i for StringList and
      // anotherObj are not equal
      if (strings[i].equals(anotherObj.getStringAt(i)) == false){
        return false;
      }
    }
    return true;
	}

  /**
   * gets string at certain index of StringList
   *
   * @param idx: index for the string you want to return from list
   * @return strings[idx]: the string you want to return from the list
   */
	public String getStringAt(int idx) {
		return strings[idx];
	}

  /**
	 * Checks if a StringList is larger than another
	 *
	 * @param anotherObj: list you want to check if another MyObject
	 * is larger than
	 * @return boolean depending on if list is larger than other
	 */
	@Override
	public boolean isLargerThan(MyObject anotherObj) {
    String sumObjOne = "";
    String sumObjTwo = "";
    //for all the elements in StringList add each element
    for (int i = 0; i < this.getListLength(); i++){
      sumObjOne += strings[i];
    }
    //for all the elements in anotherObj add each element
    for (int i = 0; i < anotherObj.getListLength(); i++){
      sumObjTwo += anotherObj.getStringAt(i);
    }
    //return true if sumObjOne greater than sumObjTwo
    if (sumObjOne.length() > sumObjTwo.length()){
      return true;
    }
    else {
      return false;
    }
	}

  /**
   * Adds the elements of one StringList to another
   *
   * @param @param anotherObj: StringList you want to add to MyObject
   * @return NewStringList: StringList with the elements of the list
   * concatenated
   */
  // NOTE: IT WILL NOT MATTER WHICH STRING IS PREPENDED/APPENDED BECAUSE
  //  THE TESTERS WILL DEPEND ON THE LENGTHS OF STRING, NOT ITS CONTENTS.
	// 	JUST MAKE SURE YOU ARE NOT PERFORMING ARRAY OUT-OF-BOUND ACCESS.
	public MyObject add(MyObject anotherObj) {
    String[] newList = new String[0];
    //if StringList has greater length than anotherObj
    if (this.getListLength() >= anotherObj.getListLength()){
      newList = new String[this.getListLength()];
      //for all elements in StringList copy
      for(int i = 0; i< this.getListLength(); i++){
        newList[i] = strings[i];
      }
      //for all elements in anotherObj concat strings
      for(int j = 0; j < anotherObj.getListLength(); j++){
        newList[j] += anotherObj.getStringAt(j);
      }
    }
    //if anotherObj has greater length than StringList
    else if (this.getListLength() < anotherObj.getListLength()){
      newList = new String[anotherObj.getListLength()];
      //for all elements in StringList copy
      for(int i = 0; i< anotherObj.getListLength(); i++){
        newList[i] = anotherObj.getStringAt(i);
      }
      //for all elements in StringList  concat strings
      for(int j = 0; j < this.getListLength(); j++){
        newList[j] += strings[j];
      }
    }
    //create and return NewStringList with concatenated strings
    StringList NewStringList = new StringList(newList);
    return NewStringList;
	}

  /**
   * divided elements of StringList by a certain denominator to make substrings
   *
   * @param denominator: int you want to divide elements of StringList by
   * @return NewStringList: StringList with the elements of the list divided
   * by denominator*length
   */
	public MyObject divideByInteger(int denominator) {
    //set denominator as 1 if input less than 0
    if (denominator <= 0){
      denominator = 1;
    }
    String[] newList = new String[this.getListLength()];
    //for all elements in StringList
    for (int i =0; i < this.getListLength(); i++){
      String subElement = strings[i].substring(0,
      (strings[i].length()/denominator));
      newList[i] = subElement;
    }
    //create and return NewStringList with divided strings
    StringList NewStringList = new StringList(newList);
    return NewStringList;
	}

  /**
   * returns StringList as a string
   * @return result: string that includes StringList
   */
	@Override
	public String toString() {
		String result =  super.toString() + ", Elements: [";
    //for all the elements in StringList
    for(int i = 0; i < this.getListLength() - 1; i++) {
			result += "" + strings[i] + ", ";
		}
		result += "" + strings[this.getListLength() - 1] + "]";
    //return StringList as a string
    return result;
	}
}
