///////////////////////////////////////////////////////////////////////////////
//                   ALL STUDENTS COMPLETE THESE SECTIONS
// Title:              Assignment4.java
// Files:              Item.java, Hero.java, Monster.java, Tower.java
// Quarter:            Fall 2021
//
// Author:             Rizq Khateeb
// Email:              rkhateeb@ucsd.edu
// Instructor's Name:  Ben Ochoa
//////////////////// STUDENTS WHO GET HELP FROM OTHER THAN THEIR PARTNER //////
//                   must fully acknowledge and credit those sources of help.
//                   Instructors and TAs do not have to be credited here,
//                   but roommates, relatives, strangers, etc do.
//
// Persons:
//
// Online sources:
//////////////////////////// 80 columns wide //////////////////////////////////
/**
 * Main class for Assignment 4 that combines methods to play game
 *
 * Bugs: None
 *
 * @author Rizq Khateeb
 */
public class Assignment4 {

	/**
	 * sets up tower for game
	 *
	 * @return tower: tower to be used in the game
	 */
	public static Tower setUpTower() {
		// Initialize the tower with 5 levels
		Tower tower = new Tower(5);
		// Initialize the different monsters
		// Parameters: Name, HP, Attack, Defense, Speed
		Monster slime = new Monster("slime", 2, 2, 0, 2);
		Monster mummy = new Monster("mummy", 5, 3, 1, 1);
		Monster ghost = new Monster("ghost", 9, 5, 2, 7);
		Monster yeti = new Monster("yeti", 15, 5, 4, 2);
		Monster wyvern = new Monster("wyvern", 20, 7, 6, 8);
		tower.setOneLevel(0, slime, new Item("Knight Sword"));
		tower.setOneLevel(1, mummy, new Item("HP Elixir"));
		tower.setOneLevel(2, ghost, new Item("Platinum Shield"));
		tower.setOneLevel(3, yeti, new Item("Thunder Hammer"));
		tower.setOneLevel(4, wyvern, new Item("Treasure"));
		return tower;
	}

	/**
	 * plays the game
	 *
	 * @param hero: the hero you are playing as
	 * @param tower: the tower you are playing in
	 */
	public static void playGame(Hero hero, Tower tower) {
		//for each level in the tower
		for(int i = 0; i < tower.getHeight(); i++){
			//get monster and item at this level
			Monster monster = tower.getMonsterAtLevel(i);
			Item item = tower.getItemAtLevel(i);
			System.out.println("\nLevel "+i+": "+hero.getName()+" encounters "
			+monster.getName());
			monster.printStats();
			//while hero is alive
			while (hero.getHealth() > 0){
				//if hero has higher speed, attacks first
				if (hero.isFasterThan(monster) == true){
					hero.attack(monster);
					//if monster alive after attack, attacks next
					if (monster.isStillAlive() == true){
						monster.attack(hero);
					}
					//if monster not alive, equips item to hero and break while loop
					else{
						hero.equipItem(item);
						break;
					}
				}
				//if monster has higher speed, attacks first
				else {
					monster.attack(hero);
					//if hero alive after attack, attacks next
					if (hero.getHealth() > 0){
						hero.attack(monster);
						//if monster not alive, equips item to hero and breaks
						if (monster.isStillAlive() == false){
							hero.equipItem(item);
							break;
						}
					}
				}
			}
			//if hero defeated after attack, breaks
			if (hero.getHealth() <= 0){
				break;
			}
		}
		//prints final message depedning on hero victory or defeat.
		if (hero.isStillAlive() == true){
			System.out.println("The Hero Wins!");
		}
		else {
			System.out.println("Game Over!");
		}
	}

	/**
	 * test for Item.java methods
	 *
	 * @return boolean: false or true depending on success of test
	 */
	private static boolean testItem(){
		Item testItem = new Item("Haste Booster");
		//haste booster stats are 0,0,0,4
		if (testItem.getName() != "Haste Booster") {
			return false;
		}
		if (testItem.getHealth() != 0) {
			return false;
		}
		if (testItem.getAttack() != 0) {
			return false;
		}
		if (testItem.getDefense() != 0) {
			return false;
		}
		if (testItem.getSpeed() != 4) {
			return false;
		}
		return true;
	}

	/**
	 * test for Hero.java methods
	 *
	 * @return boolean: false or true depending on success of test
	 */
	private static boolean testHero(){
		Hero testHero = new Hero("testHero", 2, 1, 2, 1, new Item("HP Potion"));
		//HP potion stats are 6,0,0,0
		//hero stats are now 8,1,2,1
		//create monster to test with
		Monster ghost = new Monster("ghost", 9, 5, 2, 7);
		if (testHero.isFasterThan(ghost) == true){
			return false;
		}
		testHero.equipItem(new Item("Wooden Shield"));
		//wooden shield stats are 0,0,1,0
		//hero stats are 8,1,3,1
		if (testHero.getDefense() != 3){
			return false;
		}
		//ghost attacks hero, causing 2 damage to hero
		ghost.attack(testHero);
		//hero stats are 6,1,2,1 (ghost.attack uses the receiveDamage method)
		if (testHero.getHealth() != 6){
			return false;
		}
		if (testHero.isStillAlive() == false){
			return false;
		}
		return true;
	}

	/**
	 * test for Monster.java methods
	 *
	 * @return boolean: false or true depending on success of test
	 */
	private static boolean testMonster(){
		Monster mummy = new Monster("mummy", 5, 3, 1, 1);
		//create hero to test with
		Hero testHero = new Hero("testHero", 3, 2, 4, 4, new Item("Thunder Hammer"));
		//Thunder hammer stats are 0,12,0,-1
		//hero stats are now 3,14,4,3
		//hero attacks mummy, causing 13 damage to mummy
		testHero.attack(mummy);
		//mummy stats are -8,3,1,1 (testHero.attack uses the receiveDamage method)
		if (mummy.getHealth() != -8){
			return false;
		}
		if (mummy.isStillAlive() == true){
			return false;
		}
		return true;
	}

	/**
	 * test for Hero.java and Monster.java getter methods
	 *
	 * @return boolean: false or true depending on success of test
	 */
	private static boolean testHeroMonsterGetters(){
		Hero testHero = new Hero("testHero", 2, 1, 2, 1, new Item("HP Potion"));
		//hero stats are 8,1,2,1 with HP Potion
		Monster testMonster = new Monster("mummy", 5, 3, 1, 1);
		//test hero getters
		if (testHero.getName() != "testHero"){
			return false;
		}
		if (testHero.getHealth() != 8){
			return false;
		}
		if (testHero.getAttack() != 1){
			return false;
		}
		if (testHero.getDefense() != 2){
			return false;
		}
		if (testHero.getSpeed() != 1){
			return false;
		}
		//test monster getters
		if (testMonster.getName() != "mummy"){
			return false;
		}
		if (testMonster.getHealth() != 5){
			return false;
		}
		if (testMonster.getAttack() != 3){
			return false;
		}
		if (testMonster.getDefense() != 1){
			return false;
		}
		if (testMonster.getSpeed() != 1){
			return false;
		}
		return true;
	}

	/**
	 * test for Tower.java methods
	 *
	 * @return boolean: false or true depending on success of test
	 */
	private static boolean testTower(){
		Tower testTower = new Tower(4);
		//monster to be used for tests
		Monster ghost = new Monster("ghost", 9, 5, 2, 7);
		Item platinumShield = new Item("Platinum Shield");
		if (testTower.getHeight() != 4){
			return false;
		}
		testTower.setOneLevel(2, ghost, platinumShield);
		if (testTower.getItemAtLevel(2) != platinumShield){
			return false;
		}
		if (testTower.getMonsterAtLevel(2) != ghost){
			return false;
		}
		return true;
	}

	/**
	 * unit tests for all the files
	 *
	 * @return boolean: false or true depending on success of test
	 */
	public static boolean unitTests() {
		if (testItem() == false){
			System.out.println("Unit Test failure for testItem");
			return false;
		}
		if (testHero() == false){
			System.out.println("Unit Test failure for testHero");
			return false;
		}
		if (testMonster() == false){
			System.out.println("Unit Test failure for testMonster");
			return false;
		}
		if (testHeroMonsterGetters() == false){
			System.out.println("Unit Test failure for testHeroMonsterGetters");
			return false;
		}
		if (testTower() == false){
			System.out.println("Unit Test failure for testTower");
			return false;
		}
		return true;
	}


	/**
	 * main method of Assignment4
	 *
	 * @return boolean: false or true depending on success of test
	 */
	public static void main(String[] args) {
		/* Perform unitTests first
		if(unitTests()) {
			System.out.println("All unit tests passed.\n");
		} else {
			System.out.println("Failed test.\n");
			return;
		} */

		Tower tower = setUpTower();
		//Hero hero = new Hero("CSE_8B_Hero", 10, 3, 3, 4, new Item("Small Knife"));
		//playGame(hero, tower);

		Question q = new Question();

    String s1 = "cse8b";
    String s2 = new String("cse8b");
    String s3 = "cse8b";
    String s4 = new String("cse8b");

    if (s1 == s3){
      System.out.println("a true");
    }

    if (s2.equals(s4)){
      System.out.println("b true");
    }

    if (s1 == s2){
      System.out.println("c true");
    }

    if (s2 == s4){
      System.out.println("d true");
    }

    if (s2.equals(s3)){
      System.out.println("e true");
    }


	}
	//stats from starter code (10, 3, 3, 4) - referred to when i changed stats
}
