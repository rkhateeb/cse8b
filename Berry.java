///////////////////////////////////////////////////////////////////////////////
//                   ALL STUDENTS COMPLETE THESE SECTIONS
// Main Class File:    Assignment5.java
// File:               Berry.java
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
public class Berry extends Item {
    private static final String BERRY = "Berry";

    private int luckiness;
    private int speedBoost;

    /**
     * no-arg constructor for Berry
     */
    public Berry() {
      setName(BERRY);
    }

    /**
     * arg constructor for Berry
     *
     * @param name: name of berry
     * @param luckiness: luckiness of berry
     * @param speedBoost: speedBoost of berry
     */
    public Berry(String name, int luckiness, int speedBoost) {
      setName(name);
      this.luckiness = luckiness;
      this.speedBoost =  speedBoost;
    }

    /**
     * getter for luckiness of berry
     *
     * @return luckiness: luckiness of berry
     */
    public int getLuckiness() {
      return luckiness;
    }

    /**
     * setter for luckiness of berry
     *
     * @param luckiness: luckiness of berry
     */
    public void setLuckiness(int luckiness) {
      this.luckiness = luckiness;
    }

    /**
     * setter for speedBoost
     *
     * @return speedBoost: speedBoost of berry
     */
    public int getSpeedBoost() {
      return speedBoost;
    }

    /**
     * setter for speedBoost
     *
     * @param speedBoost: speedBoost of berry
     */
    public void setSpeedBoost(int speedBoost) {
      this.speedBoost = speedBoost;
    }
}
