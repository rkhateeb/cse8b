///////////////////////////////////////////////////////////////////////////////
//                   ALL STUDENTS COMPLETE THESE SECTIONS
// Main Class File:    Assignment5.java
// File:               Item.java
// Quarter:            Fall 2021
//
// Author:             Rizq Khateeb rkhateeb@ucsd.edu
// Instructor's Name:  Ben Ochoa
//////////////////// STUDENTS WHO GET HELP FROM OTHER THAN THEIR PARTNER //////
//                   fully acknowledge and credit all sources of help,
//                   other than Instructors and TAs.
//
// Persons:          N/A
//
// Online sources:   N/A
//////////////////////////// 80 columns wide //////////////////////////////////
/**
 * Class for items player uses
 *
 * Bugs: none
 *
 * @author Rizq Khateeb
 */
public class Item {
	private String name;

	/**
	 * no-arg constructor for Item class
	 */
	public Item() {
		name = "Item";
	}

	/**
	 * arg constructor for Item class
	 *
	 * @param name: name of item
	 */
	public Item(String name) {
		this.name = name;
	}

	/**
	 * getter for name of item
	 *
	 * @return name: name of item
	 */
	public String getName() {
		return name;
	}

	/**
	 * setter for name of item
	 *
	 * @param name: name of item that will be set
	 */

	public void setName(String name) {
		this.name = name;
	}
}
