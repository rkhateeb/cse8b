///////////////////////////////////////////////////////////////////////////////
//                   ALL STUDENTS COMPLETE THESE SECTIONS
// Main Class File:    Assignment5.java
// File:               WildWorld.java
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
 * The wild world with pokemons to be caught
 *
 * Bugs: none
 *
 * @author Rizq Khateeb
 */
public class WildWorld {
    private WildPokemon[] wildPokemons;

    /**
     * no-arg constructor for WildWorld
     *
     * @param (parameter name) (Describe the first parameter here)
     * @param (parameter name) (Do the same for each additional parameter)
     * @return (description of the return value)
     */
    public WildWorld(WildPokemon[] wildPokemons) {
      this.wildPokemons = wildPokemons;
    }

    /**
     * getter for wildPokemons
     *
     * @return wildPokemons: array of WildPokemon
     */
    public WildPokemon[] getWildPokemons() {
      return wildPokemons;
    }

    /**
     * setter for wildPokemons
     *
     * @param wildPokemons: array of WildPokemon
     */
    public void setWildPokemons(WildPokemon[] wildPokemons) {
      this.wildPokemons = wildPokemons;
    }

    /**
     * method for player to catch wild pokemons
     *
     * @param player: the player of the game
     */
    public void adventure(Player player) {
      //create array of pokeballs for player
      Pokeball[] playerPokeballs = player.getPokeballs();
      //for each pokeball in array of playerPokeballs
      for (int i= 0; i < playerPokeballs.length; i++){
        //assign the playerPokeballs and wildPokemons at index i to a variable
        Pokeball pokeballI = playerPokeballs[i];
        WildPokemon wildPokemonI = wildPokemons[i];
        //if pokeball is empty or wildPokemon null, continue
        if (pokeballI.isEmpty() == false || wildPokemonI == null){
          continue;
        }
        else {
          //randomly generate ballSpeed using NumberGenerator
          int ballSpeed = NumberGenerator.generate();
          //if the wildPokemon can be collected by the player
          if (wildPokemonI.canBeCollectedBy(player.getBerry(),
          pokeballI, ballSpeed) == true) {
            //create new PalPokemon with characteristics of wildPokemon
            PalPokemon palPokemonI = new PalPokemon(wildPokemonI.getName(),
            wildPokemonI.getSound(), wildPokemonI.getType(),pokeballI);
            //set the value in the pokeball index to be our new PalPokemon
            pokeballI.setPalPokemon(palPokemonI);
            //nullify the WildPokemon at index i
            wildPokemonI = null;
          }
          else {
            continue;
          }
        }
      }
    }
}
