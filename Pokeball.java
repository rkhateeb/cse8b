///////////////////////////////////////////////////////////////////////////////
//                   ALL STUDENTS COMPLETE THESE SECTIONS
// Main Class File:    Assignment5.java
// File:               Pokeball.java
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
 * Subclass of Item
 *
 * Bugs: none
 *
 * @author Rizq Khateeb
 */
public class Pokeball extends Item {
    private int performance;
    private PalPokemon palPokemon;

    /**
     * no-arg constrcutor for Pokeball
     */
    public Pokeball() {
      setName("Pokeball");
    }

    /**
     * arg constructor for Pokeball
     *
     * @param name: name of Item
     * @param peformance: performance of Pokeball
     */
    public Pokeball(String name, int performance) {
      setName(name);
      this.performance = performance;
    }

    /**
     * getter for performance
     *
     * @return performance: performance of pokeball
     */
    public int getPerformance() {
      return performance;
    }

    /**
     * setter for performance
     *
     * @param performance: performance of pokeball
     */
    public void setPerformance(int performance) {
      this.performance = performance;
    }

    /**
     * setter for palPokemon
     *
     * @param palPokemon: a caught pokemon
     */
    public void setPalPokemon(PalPokemon palPokemon) {
      this.palPokemon = palPokemon;
    }

    /**
     * getter for PalPokemon
     *
     * @return palPokemon: a caught pokemon
     */
    public PalPokemon getPalPokemon() {
      return palPokemon;
    }

    /**
     * checks if the pokeball is empty
     *
     * @return boolean: true or false depending on if palPokemon is empty
     */
    public boolean isEmpty() {
      //return true if pokeball empty, else false
      if (palPokemon == null){
        return true;
      }
      else {
        return false;
      }
    }
}
