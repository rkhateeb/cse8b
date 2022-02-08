///////////////////////////////////////////////////////////////////////////////
//                   ALL STUDENTS COMPLETE THESE SECTIONS
// Main Class File:    Assignment9.java
// File:               FSComponent.java
// Quarter:            Fall 2021
//
// Author:             Rizq Khateeb, rkhateeb@ucsd.edu
// Instructor's Name:  Ben Ochoa
//
//////////////////// STUDENTS WHO GET HELP FROM OTHER THAN THEIR PARTNER //////
//                   fully acknowledge and credit all sources of help,
//                   other than Instructors and TAs.
//
// Persons:          Identify persons by name, relationship to you, and email.
//                   Describe in detail the the ideas and help they provided.
//
// Online sources:   Avoid web searches to solve your problems, but if you do
//                   search, be sure to include Web URLs and description of
//                   of any information you find.
//////////////////////////// 80 columns wide //////////////////////////////////
/**
 * abstract class that extends File and Directory
 *
 * Bugs: none
 *
 * @author Rizq Khateeb
 */
public abstract class FSComponent {
    private String name;

    /**
     * No-arg constructor. DO NOT CHANGE!
     */
    public FSComponent() {}

    /**
     * Public constructor that takes in a String.
     * DO NOT CHANGE!
     *
     * @param name the name of the FSComponent
     */
    public FSComponent(String name) {
        this.name = name;
    }

    /**
     * Public getter that retrieves instance variable - name
     * DO NOT CHANGE!
     * @return instance variable - name
     */
    public String getName() {
        return name;
    }

    /**
     * Public setter that mutates instance variable - name
     * DO NOT CHANGE!
     * @param name instance variable - name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Overrides equals from Object class
     *
     * @param obj: Object you are tyring to equate to FSComponent
     * @return true if both objects are equal
     */
    @Override
    public boolean equals(Object obj) {
      //cast to FSComponent to get name
      FSComponent obj2 = (FSComponent)obj;
      //if same class and same name, return true
      if(this.getClass() == obj2.getClass() &&
       this.getName().equals(obj2.getName())){
        return true;
      }
      //if not same class and same name, return false
      else{
        return false;
      }
    }

    /* The following three abstract methods needs to be implemented
     * by its subclasses. DO NOT CHANGE! */
    public abstract String toString();
    public abstract void setParentDir(Directory dir);

    /* For Assignment 9, the following abstract method needs
     * to be implemented by its subclasses. DO NOT CHANGE! */
    public abstract int getSize();
}
