///////////////////////////////////////////////////////////////////////////////
// Main Class File:    Assignment9.java
// File:               Mutable.java
// Quarter:            Fall 2021
//
// Author:             CSE 8B Staff
// Instructor's Name:  Benjamin Ochoa
///////////////////////////////////////////////////////////////////////////////

/**
 * This public interfaces contains three abstract methods that need to be
 * implemented by its subclasses.
 *
 * Bugs: None
 *
 * @author CSE 8B Staff
 */
public interface Mutable {
    boolean delete();
    boolean rename(String name);
    boolean moveTo(Directory dir);
}
