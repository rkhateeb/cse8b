///////////////////////////////////////////////////////////////////////////////
//                   ALL STUDENTS COMPLETE THESE SECTIONS
// Main Class File:    Assignment6.java
// File:               MyObject.java
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
 * Class for Objects. Superclass of Shape.java and List.java
 *
 * Bugs: None
 *
 * @author Rizq Khateeb
 */
public class MyObject {
  private String type;
	private String highLevelType;

  /**
   * no-arg constructor for MyObject
   */
	public MyObject() {
		type = "Undefined MyObject";
		highLevelType = "MyObject";
	}

  /**
   * arg constructor for MyObject
   *
   * @param type: type of MyObject (Sphere, Cuboid, IntegerList, StringList)
   * @param highLevelType: super type of MyObject(Shape, List)
   */
	public MyObject(String type, String highLevelType) {
		this.type = type;
    this.highLevelType = highLevelType;
	}

  /**
   * gets Type of MyObject
   *
   * @return type: Type of MyObject
   */
	public String getType() {
		return type;
	}

  /**
   * gets highLevelType of MyObject
   *
   * @return @return highLevelType: highLevelType of MyObject
   */
	public String getHighLevelType() {
		return highLevelType;
	}

  /**
   * Checks if two MyObjects are comparable
   *
   * @param anotherObj: object you want to compare MyObject with
   * @return boolean depending on whether objects can be compared or not
   */
	public boolean isComparableWith(MyObject anotherObj) {
    //if type of MyObject is equal to that of anotherObj
    if (this.getType() == anotherObj.getType()){
      return true;
    }
    //if highLevelType of MyObject is equal to that of anotherObj
    if (this.getHighLevelType() == "Shape" &&
    anotherObj.getHighLevelType() == "Shape"){
      return true;
    }
    else{
      return false;
    }
	}

  /**
   * Checks if two MyObjects are addible
   *
   * @param anotherObj: object you want to add to MyObject
   * @return boolean depending on whether objects can be added or not
   */
	public boolean isAddibleWith(MyObject anotherObj) {
    //if type of MyObject is equal to that of anotherObj, and if both
    //highLevelTypes are equal to "List"
    if (this.getType() == anotherObj.getType() &&
    this.getHighLevelType() == "List" &&
    anotherObj.getHighLevelType() == "List") {
      return true;
    }
    else{
      return false;
    }
	}

  /**
   * Checks if two MyObjects are equal
   *
   * @param anotherObj: object you want to check if MyObject is equal to
   * @return this == anotherObj
   */
	public boolean equals(MyObject anotherObj) {
		return this == anotherObj;
	}

  /**
   * Checks if a MyObject is larger than another
   *
   * @param anotherObj: object you want to check if another MyObject
   * is larger than
   * @return false
   */
	public boolean isLargerThan(MyObject anotherObj) {
		return false;
	}

  /**
   * adds a MyObject to another
   *
   * @param anotherObj: object you want to add to another MyObject
   * @return null
   */
	public MyObject add(MyObject anotherObj) {
		return null;
	}

  /**
   * divides a MyObject by an integer
   *
   * @param denominator = integer you want to divide
   * @return null
   */
	public MyObject divideByInteger(int denominator) {
		return null;
	}

  /**
   * gets length of list MyObject
   *
   * @return 0
   */
	public int getListLength() {
		return 0;
	}

  /**
   * gets integer at index of MyObject IntegerList
   *
   * @param i = index you want to get integer at
   * @return 0
   */
	public int getIntegerAt(int i) {
		return 0;
	}

  /**
   * gets string at index of MyObject StringList
   *
   * @param i = index you want to get string at
   * @return null
   */
	public String getStringAt(int i) {
		return null;
	}

  /**
   * gets volume of MyObject Shape
   *
   * @return 0.0
   */
	public double getVolume() {
		return 0.0;
	}

  /**
   * gets length of MyObject Cuboid
   *
   * @return 0.0
   */
	public double getCuboidLength() {
		return 0.0;
	}

  /**
   * gets width of MyObject Cuboid
   *
   * @return 0.0
   */
	public double getCuboidWidth() {
		return 0.0;
	}

  /**
   * gets height of MyObject Cuboid
   *
   * @return 0.0
   */
	public double getCuboidHeight() {
		return 0.0;
	}

  /**
   * gets radius of MyObject Sphere
   *
   * @return 0.0
   */
	public double getSphereRadius() {
		return 0.0;
	}

  /**
   * returns MyObject as a string
   * @return result: string that includes MyObject
   */
	@Override
	public String toString() {
		return type;
	}
}
