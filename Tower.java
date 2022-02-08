///////////////////////////////////////////////////////////////////////////////
//                   ALL STUDENTS COMPLETE THESE SECTIONS
// Main Class File:    Assignment4.java
// File:               Tower.java
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
 * class for the tower that hero fights monsters in
 *
 * Bugs: none
 *
 * @author Rizq Khateeb
 */
public class Tower {

	private int height;
	private Monster[] monsterEachLevel;
	private Item[] itemEachLevel;

	/**
	 * constructor method for Tower
	 *
	 * @param height: height of tower
	 */
	public Tower(int height) {
		if (height < 1) {
			this.height = 1;
		}
		else {
			this.height = height;
		}
		monsterEachLevel = new Monster[height];
		itemEachLevel = new Item[height];
	}

	/**
	 * sets monster and item at tower level
	 *
	 * @param level: level of tower
	 * @param monster: monster being set
	 * @param item: item being set
	 */
	public void setOneLevel(int level, Monster monster, Item item) {
		//sets monster and item for a certain level
		monsterEachLevel[level] = monster;
		itemEachLevel[level] = item;
	}

	/**
	 * getter for height
	 *
	 * @return height: height of tower
	 */
	public int getHeight() {
		return height;
	}

  /**
	 * getter for monster at certain level
	 *
	 * @param level: level for the monster
	 *
	 * @return monsterEachLevel[level]: the monster at that level
	 */
	public Monster getMonsterAtLevel(int level) {
		return monsterEachLevel[level];
	}

/**
 * getter for item at certain level
 *
 * @param level: level for the item
 *
 * @return itemEachLevel[level]: the item at that level
 */
	public Item getItemAtLevel(int level) {
		return itemEachLevel[level];
	}
}
