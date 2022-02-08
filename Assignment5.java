///////////////////////////////////////////////////////////////////////////////
//                   ALL STUDENTS COMPLETE THESE SECTIONS
// Title:              Assignment5.java
// Files:              Item.java, Berry.java, Pokeball.java, Pokemon.java,
//                     PalPokemon.java, WildPokemon.java, Player.java,
//                     WildWorld.java
// Quarter:            Fall 2021
//
// Author:             Rizq Khateeb
// Email:              rkhateeb@ucsd.edu
// Instructor's Name:  Ben Ochoa
//
//////////////////// STUDENTS WHO GET HELP FROM OTHER THAN THEIR PARTNER //////
//                   must fully acknowledge and credit those sources of help.
//                   Instructors and TAs do not have to be credited here,
//                   but roommates, relatives, strangers, etc do.
//
// Persons:          N/A
//
// Online sources:   N/A
//////////////////////////// 80 columns wide //////////////////////////////////
/**
 * Main class for Assignment 5
 *
 * Bugs: none
 *
 * @author Rizq Khateeb
 */
public class Assignment5 {

	/**
	 * An example tester that tests the functionality of {@Code canBeCollectedBy}
	 * method in {@Code WildPokemon} class. Notice that this tester assumes
	 * the correctness of the constructors.
	 * @return true if the tester passes
	 */
	public static boolean testWildPokemonCanBeCollectedBy() {
		//set WildPokemon, Berry and Pokeballs for test
		WildPokemon pokemon = new WildPokemon("Pikachu", "pikapika", "electric",
			25, 10);
		Berry berry = new Berry("Golden Berry", 9, 5);
		Pokeball uselessBall = new Pokeball("UselessBall", 1);
		Pokeball ultraBall = new Pokeball("UltraBall", 80);
		//test canBeCollectedBy using the berry and pokeballs
		if(pokemon.canBeCollectedBy(berry, ultraBall, 0)) {
			System.out.println("The pokemon should not be collected due to low speed!");
			return false;
		}
		if(pokemon.canBeCollectedBy(berry, uselessBall, 49)) {
			System.out.println("The pokemon should not be collected due to low performance");
			return false;
		}
		if(!pokemon.canBeCollectedBy(berry, ultraBall, 5)) {
			System.out.println("The pokemon should be collected");
			return false;
		}
		//return true if tests pass
		return true;
	}

	/**
	 * Tester that tests the functionality of {@Code canEscapeFromBall}
	 * method in {@Code WildPokemon} class. Notice that this tester assumes
	 * the correctness of the constructors.
	 * @return true if the tester passes
	 */
	public static boolean testWildPokemonCanEscapeFromBall() {
		//set wildPokemon, berry, and pokeballs for test
		WildPokemon pokemon = new WildPokemon("Pikachu", "pikapika", "electric",
			25, 10);
		Berry berry = new Berry("Golden Berry", 5, 5);
		Pokeball uselessBall = new Pokeball("UselessBall", 1);
		Pokeball ultraBall = new Pokeball("UltraBall", 80);
		//test canEscapeFromBall using the berry and pokeballs
		if(pokemon.canEscapeFromBall(uselessBall, berry) == false) {
			System.out.println("The pokemon should be able to escape due to its power!");
			return false;
		}
		if(pokemon.canEscapeFromBall(ultraBall, berry) == true) {
			System.out.println("The pokemon should not be able to escape due to its lack of power!");
			return false;
		}
		//return true if tests pass
		return true;
	}

	/**
	 * Tester that tests the functionality of {@Code isFasterThan}
	 * method in {@Code WildPokemon} class. Notice that this tester assumes
	 * the correctness of the constructors.
	 * @return true if the tester passes
	 */
	public static boolean testWildPokemonIsFasterThan() {
		//set wildPokemon, berry, pokeballs, and ballSpeed for test
		WildPokemon pokemon = new WildPokemon("Pikachu", "pikapika", "electric",
			25, 10);
		Berry berry = new Berry("Golden Berry", 9, 5);
		Pokeball uselessBall = new Pokeball("UselessBall", 1);
		Pokeball ultraBall = new Pokeball("UltraBall", 80);
		int ballSpeed = 6;
		//test isFasterThan using the berry and ballSpeed
		if(pokemon.isFasterThan(ballSpeed, berry) == true) {
			System.out.println("The pokemon is not faster than both the berry and ball speed combined!!");
			return false;
		}
		//return true if tests pass
		return true;
	}

	/**
	 * Tester that tests the functionality of Item superclass and the Berry and
	 * Pokeball subclasses. Notice that this tester assumes the correctness
	 * of the constructors.
	 * @return true if the tester passes
	 */
	public static boolean testItems() {
		//create berry and pokeball to test
		Berry testBerry = new Berry("Golden Berry", 9, 5);
		Pokeball uselessBall = new Pokeball("UselessBall", 1);
		//use getters for testing Berry
		if (testBerry.getName() != "Golden Berry"){
			return false;
		}
		if (testBerry.getLuckiness() != 9){
			return false;
		}
		if (testBerry.getSpeedBoost() != 5){
			return false;
		}
		//use getters for testing Pokeball
		if (uselessBall.getName() != "UselessBall"){
			return false;
		}
		if (uselessBall.getPerformance() != 1){
			return false;
		}
		//return true if tests pass
		return true;
	}

	/**
	 * Tester that tests the functionality of Pokemon superclass and the
	 * PalPokemon and WildPokemon subclasses. Notice that this tester assumes
	 * the correctness of the constructors.
	 * @return true if the tester passes
	 */
	public static boolean testPokemons() {
		//create pokeball, palPokemon, and wildPokemon to test
		Pokeball ultraBall = new Pokeball("UltraBall", 80);
		PalPokemon pikachu = new PalPokemon("Pikachu", "pikapika", "electric",ultraBall);
		WildPokemon mew = new WildPokemon("Mew", "mew", "psychic", 100, 100);
		//use getters for testing palPokemon
		if (pikachu.getName() != "Pikachu"){
			return false;
		}
		if (pikachu.getSound() != "pikapika"){
			return false;
		}
		if (pikachu.getType() != "electric"){
			return false;
		}
		if (pikachu.getPokeball() != ultraBall){
			return false;
		}
		//use getters for testing wildPokemon
		if (mew.getName() != "Mew"){
			return false;
		}
		if (mew.getSound() != "mew"){
			return false;
		}
		if (mew.getType() != "psychic"){
			return false;
		}
		if (mew.getPower() != 100){
			return false;
		}
		if (mew.getSpeed() != 100){
			return false;
		}
		//return true if the tester passes
		return true;
	}

	/**
	 * Tester that tests the functionality of Player class. Notice that this
	 * tester assumes the correctness of the constructors.
	 * @return true if the tester passes
	 */
	public static boolean testPlayer() {
		//create berry and pokeballs array to test
		Pokeball[] pokeballs = new Pokeball[3];
		pokeballs[0] = new Pokeball("UselessBall", 0);
		pokeballs[1] = new Pokeball("superball", 30);
		pokeballs[2] = new Pokeball("ultraball", 80);
		Berry berry = new Berry("Golden Razz Berry", 10, 5);
		//create player with pokeballs array and berry we initialized earlier
		Player AshKetchum = new Player(pokeballs, berry);
		//use getters for testing player
		if (AshKetchum.getPokeballs() != pokeballs){
			return false;
		}
		if (AshKetchum.getBerry() != berry){
			return false;
		}
		//return true if the tester passes
		return true;
	}

	/**
	 * Tester that tests the functionality of WildWorld class. Notice that this
	 * tester assumes the correctness of the constructors.
	 * @return true if the tester passes
	 */
	public static boolean testWildWorld() {
		//create array of wild pokemons to test
		WildPokemon[] wildPokemons = new WildPokemon[3];
		wildPokemons[0] = new WildPokemon("Pikachu", "pikapika", "electric", 25,
			10);
		wildPokemons[1] = new WildPokemon("Charmander", "char", "fire", 20, 3);
		wildPokemons[2] = new WildPokemon("Mew", "mew", "psychic", 100, 100);
		//create WildWorld using the array of wild pokemons we initialized earlier
		WildWorld world = new WildWorld(wildPokemons);
		// use getters to test WildWorld
		if (world.getWildPokemons() != wildPokemons){
			return false;
		}
		//return true if the tester passes
		return true;
	}

	/**
	 * This method is a simple simulation of how pokemon go works. The expected
	 * result is shown in the writeup.
	 */
	public static void simulation() {
		// create three pokeballs
		Pokeball[] pokeballs = new Pokeball[3];
		pokeballs[0] = new Pokeball("UselessBall", 0);
		pokeballs[1] = new Pokeball("superball", 30);
		pokeballs[2] = new Pokeball("ultraball", 80);

		// create a berry
		Berry berry = new Berry("Golden Razz Berry", 10, 5);

		// create a player with pokeballs and berry equiped
		Player AshKetchum = new Player(pokeballs, berry);

		// create three wild pokemons
		WildPokemon[] wildPokemons = new WildPokemon[3];
		wildPokemons[0] = new WildPokemon("Pikachu", "pikapika", "electric", 25,
			10);
		wildPokemons[1] = new WildPokemon("Charmander", "char", "fire", 20, 3);
		wildPokemons[2] = new WildPokemon("Mew", "mew", "psychic", 100, 100);

		// create a world with the threee wild pokemons
		WildWorld world = new WildWorld(wildPokemons);

		// Ash Ketchum starts his adventure
		world.adventure(AshKetchum);

		// Ash Ketchum show off his collection
		AshKetchum.showOff();
	}

	/**
	 * Unit tests for the methods of the classes
	 *
	 * @return true if the tests pass
	 */
	public static boolean unitTests() {
		if (!testWildPokemonCanBeCollectedBy()) {
			return false;
		}
		//TODO: add five more testers below
		if (!testWildPokemonCanEscapeFromBall()) {
			return false;
		}
		if (!testWildPokemonIsFasterThan()) {
			return false;
		}
		if (!testItems()) {
			return false;
		}
		if (!testPokemons()) {
			return false;
		}
		if (!testPlayer()) {
			return false;
		}
		if (!testWildWorld()) {
			return false;
		}
		return true;
	}

	/**
	 * main method for Assignment5
	 */
	public static void main(String[] args) {
		// Perform unitTests first
		if(unitTests()) {
			System.out.println("All unit tests passed.\n");
		} else {
			System.out.println("Failed test.\n");
			return;
		}
		simulation();
	}
}
