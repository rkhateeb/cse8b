///////////////////////////////////////////////////////////////////////////////
//                   ALL STUDENTS COMPLETE THESE SECTIONS
// Main Class File:    Assignment4.java
// File:               Monster.java
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
 * class for the monster hero must fight
 *
 * Bugs: none
 *
 * @author Rizq Khateeb
 */
public class Monster {

	private String name;
	private int health;
	private int attack;
	private int defense;
	private int speed;

	/**
	 * constructor method for Monster
	 *
	 * @param name: name of Hero
	 * @param health: Hero health stat
	 * @param attack: Hero attack stat
	 * @param defense: Hero defense stat
	 * @param speed: Hero speed stat
	 */
	public Monster(String name, int health, int attack, int defense, int speed) {
		//assigning attributes to monster
		this.name = name;
		this.health = health;
		this.attack = attack;
		this.defense = defense;
		this.speed = speed;
	}

	/**
	 * method for monster to attack hero
	 *
	 * @param hero: the hero being fought
	 */
	public void attack(Hero hero) {
		int damage = 1;
		//hero receives one damage
		if (hero.getDefense() >= attack){
			hero.receiveDamage(1);
		}
		//hero receives damage equal to monster attack minus hero defense
		else {
			damage = attack - hero.getDefense();
			hero.receiveDamage(damage);
		}
		System.out.println(name + " attacks " + hero.getName() + ", causing "
		+ damage + " damage");
		hero.printStats();
	}

	/**
	 * method for checking if monster is alive
	 *
	 * @return boolean: true if monster is alive, false otherwise
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
	 * method dictating how much damage monster receives
	 *
	 * @param damage: amount of damage monster takes
	 */
	public void receiveDamage(int damage) {
		health = health - damage;
	}

	/**
	* getter method for name
	*
	* @return name: the name of monster
	*/
	public String getName() {
		return name;
	}

	/**
	* getter method for health
	*
	* @return health: the health of monster
	*/
	public int getHealth() {
		return health;
	}

	/**
	* getter method for attack stat
	*
	* @return attack: the attack stat of monster
	*/
	public int getAttack() {
		return attack;
	}

	/**
	* getter method for defense stat
	*
	* @return defense: the defense stat of monster
	*/
	public int getDefense() {
		return defense;
	}

	/**
	* getter method for speed stat
	*
	* @return speed: the speed stat of item
	*/
	public int getSpeed() {
		return speed;
	}

	/**
	* method to print stats of monster
	*/
	public void printStats() {
		String str = String.format("\t%s - health: %d, attack: %d, defense: %d, speed: %d", this.name, this.health, this.attack, this.defense, this.speed);
		System.out.println(str);
	}
}
