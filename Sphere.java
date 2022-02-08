///////////////////////////////////////////////////////////////////////////////
//                   ALL STUDENTS COMPLETE THESE SECTIONS
// Main Class File:    Assignment6.java
// File:               Sphere.java
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
 * Class for Sphere shapes
 *
 * Bugs: None
 *
 * @author Rizq Khateeb
 */
public class Sphere extends Shape {
	static final double PI = 3.1415;
  static final double CONSTANT = 4.0/3.0;
  private double radius;

	/**
   * no-arg constrcutor for sphere
   */
	public Sphere() {
		super("Sphere", 0.0);
		radius = 0.0;
	}

	/**
	 * arg constrcutor for sphere
	 *
	 * @param radius: radius of sphere
	 */
	public Sphere(double radius) {
		super("Sphere",CONSTANT*PI*radius*radius*radius);
		this.radius = radius;
	}

	/**
	 * gets radius of sphere
	 *
	 * @return radius: radius of sphere
	 */
	public double getSphereRadius() {
		return radius;
	}

	/**
   * returns Sphere as a string
   * @return result: string that includes MyObject
   */
	@Override
	public String toString() {
		return super.toString() + ", Radius: " + radius;
	}
}
