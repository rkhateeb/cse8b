///////////////////////////////////////////////////////////////////////////////
//                   ALL STUDENTS COMPLETE THESE SECTIONS
// Main Class File:    Assignment6.java
// File:               Shape.java
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
 * Class for Shapes. Superclass of Cuboid.java and Sphere.java
 *
 * Bugs: None
 *
 * @author Rizq Khateeb
 */
public class Shape extends MyObject {
  private double volume;

  /**
   * no-arg constrcutor for Shape
   */
	public Shape() {
		super("Undefined Shape", "Shape");
		volume = 0.0;
	}

  /**
   * arg constrcutor for shape
   *
   * @param shape: string for shape
   * @param volume: volume of shape
   */
	public Shape(String shape, double volume) {
	  super(shape,"Shape");
    //set volume to 0 if input for volume less than 0
    if (volume < 0){
      this.volume = 0.0;
    }
    else {
      this.volume = volume;
    }
	}

  /**
   * getter for volume of shpae
   *
   * @return volume: colume of shape
   */
	public double getVolume() {
		return volume;
	}

  /**
   * Checks if two shapes are equal
   *
   * @param anotherObj: shape you want to check if MyObject is equal to
   * @return boolean depending on if shapes are equal
   */
	@Override
	public boolean equals(MyObject anotherObj) {
    //if Shape and anotherObj are same type and volume, return true
    if (this.getType() == anotherObj.getType() &&
    this.getVolume() == anotherObj.getVolume()){
      return true;
    }
    else{
      return false;
    }
	}

  /**
   * Checks if a shape is larger than another
   *
   * @param anotherObj: shape you want to check if another MyObject
   * is larger than
   * @return boolean depending on if shape is larger than other
   */
	@Override
	public boolean isLargerThan(MyObject anotherObj) {
    //if Shape and anotherObj are same highLevelType and Shape has a greater
    // volume than anotherObj, return true
    if (this.getHighLevelType() == anotherObj.getHighLevelType() &&
    this.getVolume() > anotherObj.getVolume()){
      return true;
    }
    else{
      return false;
    }
	}

  /**
   * returns Shape as a string
   * @return result: string that includes Shape
   */
	@Override
	public String toString() {
		return super.toString() + " - Volume: " + volume;
	}
}
