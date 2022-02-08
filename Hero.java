///////////////////////////////////////////////////////////////////////////////
//                   ALL STUDENTS COMPLETE THESE SECTIONS
// Main Class File:    Assignment4.java
// File:               Hero.java
// Quarter:            Fall 2021
//
// Author:             Rizq Khateeb, rkhateeb@ucsd.edu
// Instructor's Name:  Ben Ochoa
//
//////////////////// STUDENTS WHO GET HELP FROM OTHER THAN THEIR PARTNER //////
//                   fully acknowledge and credit all sources of help,
//                   other than Instructors and TAs.
//
// Persons:
//
// Online sources:
//////////////////////////// 80 columns wide //////////////////////////////////
/**
 * class for the hero of game
 *
 * Bugs: none
 *
 * @author Rizq Khateeb
 */
public class Hero {

	private String name;
	private int health;
	private int attack;
	private int defense;
	private int speed;

	/**
	 * constructor method for Hero
	 *
	 * @param name: name of Hero
	 * @param health: Hero health stat
	 * @param attack: Hero attack stat
	 * @param defense: Hero defense stat
	 * @param speed: Hero speed stat
	 * @param initialItem: Hero's initial item
	 */
	public Hero(String name, int health, int attack, int defense, int speed, Item initialItem) {
		//assigning attributes and initial item
		this.name = name;
		this.health = health;
		this.attack = attack;
		this.defense = defense;
		this.speed = speed;
		equipItem(initialItem);
	}

	/**
	 * method for hero to attack monster
	 *
	 * @param monster: the monster being fought
	 */
	public void attack(Monster monster) {
		int damage = 1;
		//monster receives one damage
		if (monster.getDefense() >= attack){
			monster.receiveDamage(1);
		}
		//monster receives damage equal to hero attack minus monster defense
		else {
			damage = attack - monster.getDefense();
			monster.receiveDamage(damage);
		}
		System.out.println(name + " attacks " + monster.getName() + ", causing "
		+ damage + " damage");
		monster.printStats();
	}

	/**
	 * method to equip item and give hero item stats
	 *
	 * @param item: the item the hero obtained
	 */
	public void equipItem(Item item) {
		//adding item attributes to hero
		health += item.getHealth();
		attack += item.getAttack();
		defense += item.getDefense();
		speed += item.getSpeed();
		System.out.println(name + " received " + item.getName());
	}

	/**
	 * method for checking if monster or hero is faster
	 *
	 * @param monster: the monster being fought
	 *
	 * @return boolean: true or false depending on speeds of monster
	 */
	public boolean isFasterThan(Monster monster) {
		if (speed > monster.getSpeed()) {
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * method for checking if hero is alive
	 *
	 * @return boolean: true if hero is alive, false otherwise
	 */
	public boolean isStillAlive() {
		if (health > 0){
			return true;
		}
		else {
			System.out.println(name + " is defeated");
			return false;
		}
	}

	/**
	 * method dictating how much damage hero receives
	 *
	 * @param damage: amount of damage hero takes
	 */
	public void receiveDamage(int damage) {
		health = health - damage;
	}

	/**
	* getter method for name
	*
	* @return name: the name of hero
	*/
	public String getName() {
		return name;
	}

	/**
	* getter method for health
	*
	* @return health: the health of hero
	*/
	public int getHealth() {
		return health;
	}

	/**
	* getter method for attack stat
	*
	* @return attack: the attack stat of hero
	*/
	public int getAttack() {
		return attack;
	}

	/**
	* getter method for defense stat
	*
	* @return defense: the defense stat of hero
	*/
	public int getDefense() {
		return defense;
	}

	/**
	* getter method for speed stat
	*
	* @return speed: the speed stat of hero
	*/
	public int getSpeed() {
		return speed;
	}

	/**
	* method to print stats of hero
	*
	*/
	public void printStats() {
		String str = String.format("\t%s - health: %d, attack: %d, defense: %d, speed: %d", this.name, this.health, this.attack, this.defense, this.speed);
		System.out.println(str);
	}
}
