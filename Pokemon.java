///////////////////////////////////////////////////////////////////////////////
//                   ALL STUDENTS COMPLETE THESE SECTIONS
// Main Class File:    Assignment5.java
// File:               Pokemon.java
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
// Online sources:  N/A
//////////////////////////// 80 columns wide //////////////////////////////////
/**
 * Superclass of PalPokemon and WildPokemon
 *
 * Bugs: none
 *
 * @author Rizq Khateeb
 */
public class Pokemon {
	private static final String POKEMON = "Pokemon";
	private static final String SOUND = "Sound";
	private static final String UNKNOWN = "Unknown";

	private String name;
	private String sound;
	private String type;

	/**
	 * no-arg constructor of Pokemon
	 */
	public Pokemon() {
		name = POKEMON;
		sound = SOUND;
		type = UNKNOWN;
	}

	/**
	 * arg constrcutor of Pokemon
	 *
	 * @param name: name of Pokemon
	 * @param sound: sound of Pokemon
	 * @param type: type of Pokemon
	 */
	public Pokemon(String name, String sound, String type) {
		this.name = name;
		this.sound = sound;
		this.type = type;
	}

	/**
	 * getter for name
	 *
	 * @return name: name of Pokemon
	 */
	public String getName() {
		return name;
	}

	/**
	 * setter for name
	 *
	 * @return name: name of Pokemon
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * getter for sound
	 *
	 * @return sound: sound of Pokemon
	 */
	public String getSound() {
		return sound;
	}

	/**
	 * setter for sound
	 *
	 * @param sound: sound of Pokemon
	 */

	public void setSound(String sound) {
		this.sound = sound;
	}

	/**
	 * getter for type
	 *
	 * @return type: type of Pokemon
	 */
	public String getType() {
		return type;
	}

	/**
	 * setter for type
	 *
	 * @param type: type of Pokemon
	 */
	public void setType(String type) {
		this.type = type;
	}
}
