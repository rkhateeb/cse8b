///////////////////////////////////////////////////////////////////////////////
//                   ALL STUDENTS COMPLETE THESE SECTIONS
// Main Class File:    Assignment5.java
// File:               PLayer.java
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
 * Class that sets up the player of the game (trainer)
 *
 * Bugs: none
 *
 * @author Rizq Khateeb
 */
public class Player {
    private static final String POKEMON_OUT = "%s: %s\n";
    private static final String EMPTY_POKEBALL = "Pokeball %s is empty\n";
    private static final String GO_POKEMON = "Go my pokemons!!!\n";

    private Pokeball[] pokeballs;
    private Berry berry;

    /**
     * constrcutor class for Player
     *
     * @param pokeballs: array of pokeballs
     * @param berry: enhances the pokeball
     */
    public Player(Pokeball[] pokeballs, Berry berry) {
      this.pokeballs = pokeballs;
      this.berry = berry;
    }

    /**
     * getter for pokeballs
     *
     * @return pokeballs: array of pokeballs
     */
    public Pokeball[] getPokeballs() {
      return pokeballs;
    }

    /**
     * setter for pokeballs
     *
     * @param pokeballs: array of pokeballs
     */
    public void setPokeballs(Pokeball[] pokeballs) {
      this.pokeballs = pokeballs;
    }

    /**
     * getter for berry
     *
     * @return berry: enhances the pokeball
     */
    public Berry getBerry() {
      return berry;
    }

    /**
     * setter for berry
     *
     * @param berry: enhances the pokeball
     */
    public void setBerry(Berry berry) {
      this.berry = berry;
    }

    /**
     * Prints all pal pokemons in all the player's pokeballs
     */
    public void showOff() {
      //print the first statement
      System.out.print(GO_POKEMON);
      //for each pokeball in the array
      for (int i = 0; i < pokeballs.length; i++){
        //if pokeball is empty, print statement stating ball is empty
        if (pokeballs[i].isEmpty() == true){
          System.out.printf(EMPTY_POKEBALL,pokeballs[i].getName());
        }
        //if pokeball is not empty, print statement showing the pokemon
        //within ball
        else {
          PalPokemon palPokemonInPokeball = pokeballs[i].getPalPokemon();
          System.out.printf(POKEMON_OUT,palPokemonInPokeball.getName(),
          palPokemonInPokeball.getSound());
        }
      }
    }
}
