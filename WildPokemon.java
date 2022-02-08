///////////////////////////////////////////////////////////////////////////////
//                   ALL STUDENTS COMPLETE THESE SECTIONS
// Main Class File:    Assignment5.java
// File:               WildPokemon.java
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
public class WildPokemon extends Pokemon {
    private static final int HUNDRED = 100;

    private int power;
    private int speed;
    private int timesEscapedFromBall;

    /**
     * no-arg constructor for WildPokemon
     */
    public WildPokemon() {
      power = HUNDRED;
      speed = 0;
      timesEscapedFromBall = 0;
    }

    /**
     * no-arg constructor for WildPokemon
     *
     * @param name: name of Pokemon
     * @param sound: sound of pokemon
     * @param type: type of pokemon
     * @param power: power of pokemon
     * @param speed: speed of pokemon
     */
    public WildPokemon(String name, String sound, String type, int power,
        int speed) {
      setName(name);
      setSound(sound);
      setType(type);
      setPower(power);
      setSpeed(speed);
    }

    /**
     * getter for power
     *
     * @return power: power of Wild Pokemon
     */
    public int getPower() {
      return power;
    }

    /**
     * setter for power
     *
     * @param power: power of Wild Pokemon
     */
    public void setPower(int power) {
      this.power = power;
    }

    /**
     * getter for speed
     *
     * @return speed: speed of Wild Pokemon
     */
    public int getSpeed() {
      return speed;
    }

    /**
     * setter for speed
     *
     * @param speed: speed of Wild Pokemon
     */
    public void setSpeed(int speed) {
      this.speed = speed;
    }

    /**
     * getter for timesEscapedFromBall
     *
     * @return timesEscapedFromBall: number of times pokemon escaped
     */
    public int getTimesEscapedFromBall() {
      return timesEscapedFromBall;
    }

    /**
     * setter for timesEscapedFromBall
     *
     * @param timesEscapedFromBall: number of times pokemon escaped
     */
    public void setTimesEscapedFromBall(int timesEscapedFromBall) {
      this.timesEscapedFromBall = timesEscapedFromBall;
    }

    /**
     * testing if pokemon speed is faster than ball speed
     *
     * @param ballSpeed: speed of ball
     * @param berry: berry that provides pokeball with speed boost
     * @return boolean: true or false depending on speed of pokemon
     */
    public boolean isFasterThan(int ballSpeed, Berry berry) {
      //if pokemon speed greater than ballSpeed+berry speedBoost, return true
      if (speed > (ballSpeed + berry.getSpeedBoost())){
        return true;
      }
      //if pokemon speed less than ballSpeed+berry speedBoost, return false
      else {
        return false;
      }
    }

    /**
     * testing if pokemon power is greater than ball power
     *
     * @param pokeball: pokeball that will capture pokemon
     * @param berry that provides luckiness boost for pokeball
     * @return boolean: true or false depending on power of pokemon
     */
    public boolean canEscapeFromBall(Pokeball pokeball, Berry berry) {
      //if pokemon power greater than pokeball performance + berry luckiness,
      //return true
      if (power > (pokeball.getPerformance() + berry.getLuckiness())){
        return true;
      }
      //if pokemon power less than pokeball performance + berry luckiness,
      //return false
      else {
        return false;
      }
    }

    /**
     * determining if pokemon can be caught or not
     *
     * @param berry: berry that enhances pokeball
     * @param pokeball: item used to capture pokemon
     * @param ballSpeed: speed of ball capture
     * @return boolean: true or false depending on power of pokemon
     */
    public boolean canBeCollectedBy(Berry berry, Pokeball pokeball,
        int ballSpeed) {
      //if pokemon speed greater than ballSpeed+berry speedBoost,
      // return false for canBeCollectedBy
      if (isFasterThan(ballSpeed, berry) == true){
        return false;
      }
      //if pokemon power greater than pokeball performance + berry luckiness,
      //return false for canBeCollectedBy
      if (canEscapeFromBall(pokeball,berry) == true){
        timesEscapedFromBall ++;
        return false;
      }
      //return true if pokemon is not faster than the ball and cannot be
      // collected by the ball
      return true;
    }
}
