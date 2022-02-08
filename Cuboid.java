///////////////////////////////////////////////////////////////////////////////
//                   ALL STUDENTS COMPLETE THESE SECTIONS
// Main Class File:    Assignment6.java
// File:               Cuboid.java
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
 * Class for Cuboid shapes
 *
 * Bugs: None
 *
 * @author Rizq Khateeb
 */
public class Cuboid extends Shape {
  private double length;
	private double width;
  private double height;

  /**
   * no-arg constructor for Cuboid
   */
	public Cuboid() {
		super("Cuboid", 0.0);
        length = 0.0;
		width = 0.0;
		height = 0.0;
	}

  /**
   * arg constructor for Cuboid
   *
   * @param length: length of cuboid
   * @param width: width of cuboid
   * @param height: height of cuboid
   */
	public Cuboid(double length, double width, double height) {
    super("Cuboid",length*width*height);
    this.length = length;
    this.width = width;
    this.height = height;
	}

  /**
   * getter for cuboid length
   *
   * @return length: length of cuboid
   */
  public double getCuboidLength() {
      return length;
  }

  /**
   * getter for cuboid width
   *
   * @return width: width of cuboid
   */
  public double getCuboidWidth() {
      return width;
  }

  /**
   * getter for cuboid height
   *
   * @return height: height of cuboid
   */
	public double getCuboidHeight() {
		return height;
	}

  /**
   * Checks if two cuboids are equal
   *
   * @param anotherObj: cuboid you want to check if MyObject is equal to
   * @return boolean depending on if cuboids are equal
   */
	@Override
	public boolean equals(MyObject anotherObj) {
    //if Shape from super class equals anotherObj and
    //all dimensions are equal
    if (super.equals(anotherObj) == true &&
    this.getCuboidLength() == anotherObj.getCuboidLength() &&
    this.getCuboidWidth() == anotherObj.getCuboidWidth() &&
    this.getCuboidHeight() == anotherObj.getCuboidHeight()) {
      return true;
    }
    else{
      return false;
    }
	}

  /**
   * returns Cuboid as a string
   * @return result: string that includes Cuboid
   */
	@Override
	public String toString() {
		return super.toString() + ", Length: " + length + ", Width: "
			+ width + ", Height: " + height;
	}
}
