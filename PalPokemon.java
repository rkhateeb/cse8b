///////////////////////////////////////////////////////////////////////////////
//                   ALL STUDENTS COMPLETE THESE SECTIONS
// Main Class File:    Assignment5.java
// File:               PalPokemon.java
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
 * Subclass of Pokemon
 *
 * Bugs: none
 *
 * @author Rizq Khateeb
 */
public class PalPokemon extends Pokemon {
    private Pokeball pokeball;

    /**
     * no-arg constructor for PalPokemon
     */
    public PalPokemon() {
      pokeball = null;
    }

    /**
     * arg constructor for PalPokemon
     *
     * @param name: name of Pokemon
     * @param sound: sound of Pokemon
     * @param type: type of Pokemon
     * @param pokeball: pokeball of Pokemon
     */
    public PalPokemon(String name, String sound, String type,
        Pokeball pokeball) {
      setName(name);
      setSound(sound);
      setType(type);
      this.pokeball = pokeball;
    }

    /**
     * getter for Pokeball
     *
     * @return pokeball: the pokeball pokemon is stored in
     */
    public Pokeball getPokeball() {
      return pokeball;
    }

    /**
     * setter for Pokeball
     *
     * @param pokeball: the pokeball pokemon is stored in
     */
    public void setPokeball(Pokeball pokeball) {
      this.pokeball = pokeball;
    }
}
