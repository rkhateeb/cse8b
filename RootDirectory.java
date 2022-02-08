///////////////////////////////////////////////////////////////////////////////
// Main Class File:    Assignment9.java
// File:               RootDirectory.java
// Quarter:            Fall 2021
//
// Author:             CSE 8B Staff
// Instructor's Name:  Benjamin Ochoa
///////////////////////////////////////////////////////////////////////////////

/**
 * The {@code RootDirectory} class is a concrete subclass of {@code Directory}.
 * The {@code RootDirectory} object instance is always the first layer
 * in a file system. This class is complete. DO NOT CHANGE!
 *
 * Bugs: None
 *
 * @author CSE 8B Staff
 */
public class RootDirectory extends Directory {

    /**
     * Public no-arg constructor that initialize its super field {@code name}
     * to {@code "/"}.
     */
    public RootDirectory() {
        super("/");
    }

    /**
     * Public no-arg constructor that initialize its super field {@code name}
     * with parameter {@code name}.
     *
     * @param name the name of the super field
     */
    public RootDirectory(String name) {
        super(name);
    }

    /**
     * Return the string representation of the RootDirectory object.
     * DO NOT CHANGE!
     *
     * @return a string representation of the RootDirectory object.
     */
    @Override
    public String toString() {
        return "Root Directory: " + this.getName();
    }

    /**
     * Empty implementation of the method {@code setParentDir} in
     * {@code FSComponent} class. Since RootDirectory does not need to have
     * a parent dir, we don't need to do anything.
     */
    @Override
    public void setParentDir(Directory newDir) {}
}
