///////////////////////////////////////////////////////////////////////////////
//                   ALL STUDENTS COMPLETE THESE SECTIONS
// Title:              Assignment6.java
// Files:              MyObject.java, Shape.java, List.java, Sphere.java,
// 										 Cuboid.java, IntegerList.java, StringList.java
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
// Persons:          Identify persons by name, relationship to you, and email.
//                   Describe in detail the the ideas and help they provided.
//
// Online sources:   Avoid web searches to solve your problems, but if you do
//                   search, be sure to include Web URLs and description of
//                   of any information you find.
//////////////////////////// 80 columns wide //////////////////////////////////
/**
 * Main class and superclass of Assignment 6
 *
 * Bugs: None
 *
 * @author Rizq Khateeb
 */
public class Assignment6 {
	private static final String NON_COMPARABLE_MSG = "Contains two or more objects that are not comparable";
	private static final String NON_ADDABLE_MSG = "Contains two or more objects that are not addible";

	/**
	 * sorts array of objects from smallest to largest
	 *
	 * @param objList: list of MyObjects
	 * @return true if sorting successful
	 */
	public static boolean sort(MyObject[] objList) {
		//for all elements in the object list
		for(int i = 0; i < objList.length; i++){
			//if i is less than the length of object list - 1
			if(i<objList.length-1){
				//return false if the objList contains items that cannot be compared
				if(objList[i].isComparableWith(objList[i+1]) == false){
					System.out.println(NON_COMPARABLE_MSG);
					return false;
				}
			}
			//set current minimum and the index
			MyObject currentMin = objList[i];
			int currentMinIndex = i;
			//for each element in the object list
			for(int j = i+1; j<objList.length; j++){
				//if current minimum is larger than objList at interval j
				if (currentMin.isLargerThan(objList[j]) == true){
					//replace current minimum with the new minimum
					currentMin = objList[j];
					currentMinIndex = j;
				}
			}
			//if current minimum index is not i
			if(currentMinIndex != i){
				//replace current minimum index
				objList[currentMinIndex] = objList[i];
				objList[i] = currentMin;
			}
		}
		return true;
	}

	/**
	 * finds the mean of objects in objList
	 *
	 * @param objList: list of MyObjects
	 * @return mean: mean of objects in objList
	 */
	public static MyObject mean(MyObject[] objList) {
		//set a sum and mean to use for later
		MyObject sum = new MyObject();
		MyObject mean = new MyObject();
		// for each object in objList
		for(int i = 0; i < objList.length; i++){
			//if i is less than the length of object list - 1
			if(i<objList.length-1){
				//return null if the objList contains items that cannot be added
				if(objList[i].isAddibleWith(objList[i+1]) == false){
					System.out.println(NON_ADDABLE_MSG);
					return null;
				}
			}
			//sum up all the objects in objList
			sum = objList[i].add(sum);
		}
		//find mean by dividing sum by length of objList
		mean = sum.divideByInteger(objList.length);
		return mean;
	}

	/**
	 * finds index of first object in objList that equals target
	 *
	 * @param objList: list of MyObjects
	 * @param target: MyObject you want to find equal value of in objList
	 * @return i: index of objList where value equals target
	 */
	public static int findIndex(MyObject[] objList, MyObject target) {
		//for each object in objList
		for(int i = 0; i < objList.length; i++){
			//if item at index i of objList equals target
			if(objList[i].equals(target) == true){
				return i;
			}
		}
		return -1;
	}

	/**
	 * first unit test for sort method
	 *
	 * @return true if unit test passes
	 */
	public static boolean testSortOne() {
		//create integer lists and assign to intList
		IntegerList intListOne = new IntegerList(new int[]{2, 4, 6, 8});
		IntegerList intListTwo = new IntegerList(new int[]{3, 6, 9, 12});
		IntegerList intListThree = new IntegerList(new int[]{1, 2, 3, 4});
		IntegerList[] intList = new IntegerList[3];
		intList[0] = intListOne;
		intList[1] = intListTwo;
		intList[2] = intListThree;
		//sort int list
		sort(intList);
		//if item in intList is not in correct indices, return false
		if(intList[0] != intListThree || intList[1] != intListOne ||
		intList[2] != intListTwo){
			System.out.println("Error in sort 1");
			return false;
		}
		return true;
	}

	/**
	 * second unit test for sort method
	 *
	 * @return true if unit test passes
	 */
	public static boolean testSortTwo() {
		//create string lists and assign to stringList
		StringList stringListOne = new StringList(new String[]{"hey", "hi",
		 "hello"});
		StringList stringListTwo = new StringList(new String[]{"oops", "ouch",
		 "oww"});
		StringList stringListThree = new StringList(new String[]{"lol", "haha"});
		StringList[] stringList = new StringList[3];
		stringList[0] = stringListOne;
		stringList[1] = stringListTwo;
		stringList[2] = stringListThree;
		//sort int list
		sort(stringList);
		//if item in stringList is not in correct indices, return false
		if(stringList[0] != stringListThree || stringList[1] != stringListOne ||
		stringList[2] != stringListTwo){
			System.out.println("Error in sort 2");
			return false;
		}
		return true;
	}

	/**
	 * third unit test for sort method
	 *
	 * @return true if unit test passes
	 */
	public static boolean testSortThree() {
		//create string lists and assign to stringList
		Sphere sphere1 = new Sphere(3.5);
		Cuboid cuboid1 = new Cuboid(2.0,2.0,2.0);
		Sphere sphere2 = new Sphere(6.7);
		Cuboid cuboid2 = new Cuboid(1.5,2.5,3.5);

		MyObject[] objectList = new MyObject[4];
		objectList[0] = sphere1;
		objectList[1] = cuboid1;
		objectList[2] = sphere2;
		objectList[3] = cuboid2;
		//sort object list
		sort(objectList);
		//if item in objectList is not in correct indices, return false
		if(objectList[0] != cuboid1 || objectList[1] != cuboid2 ||
		objectList[2] != sphere1 || objectList[3] != sphere2){
			System.out.println("Error in sort 3");
			return false;
		}
		return true;
	}

	/**
	 * first unit test for mean method
	 *
	 * @return true if unit test passes
	 */
	public static boolean testMeanOne() {
		//create integer lists and assign to intList. expectedMean is mean
		//you expect
		IntegerList intListOne = new IntegerList(new int[]{3, 3, 3});
		IntegerList intListTwo = new IntegerList(new int[]{10,20,30,40});
		IntegerList intListThree = new IntegerList(new int[]{1, 2, 3, 4});
		IntegerList expectedMean = new IntegerList(new int[]{4, 8, 12, 14});
		IntegerList[] intList = new IntegerList[3];
		intList[0] = intListOne;
		intList[1] = intListTwo;
		intList[2] = intListThree;
		//create variable for actual mean of intList
		MyObject actualMean = mean(intList);
		//if expectedMean and actualMean are not equal, return false
		if(expectedMean.equals(actualMean) != true){
			System.out.println("Error in mean 1");
			return false;
		}
		return true;
	}

	/**
	 * second unit test for mean method
	 *
	 * @return true if unit test passes
	 */
	public static boolean testMeanTwo() {
		//create string lists and assign to StringList. expectedMean is mean
		//you expect
		StringList stringListOne = new StringList(new String[]{"hey", "hi",
		 "hello"});
		StringList stringListTwo = new StringList(new String[]{"oops", "ouch",
		 "ow", "oof"});
		StringList stringListThree = new StringList(new String[]{"lol", "haha"});
		StringList expectedMean = new StringList(new String[]{"oop", "ouc", "ow", "o"});
		StringList[] stringList = new StringList[3];
		stringList[0] = stringListOne;
		stringList[1] = stringListTwo;
		stringList[2] = stringListThree;
		//create variable for actual mean of StringList
		MyObject actualMean = mean(stringList);
		//if expectedMean and actualMean are not equal, return false
		if(expectedMean.equals(actualMean) != true){
			System.out.println("Error in mean 2");
			return false;
		}
		return true;
	}

	/**
	 * first unit test for findIndex method
	 *
	 * @return true if unit test passes
	 */
	public static boolean testFindIndexOne() {
		//create int lists and assign to intList. target is intList you want
		//to find equal value to
		IntegerList intListOne = new IntegerList(new int[]{1, 3, 5});
		IntegerList intListTwo = new IntegerList(new int[]{1,1,1,1});
		IntegerList intListThree = new IntegerList(new int[]{1, 2, 3, 4});
		IntegerList target1 = new IntegerList(new int[]{1, 1, 1, 1});
		IntegerList[] intList = new IntegerList[3];
		intList[0] = intListOne;
		intList[1] = intListTwo;
		intList[2] = intListThree;
		//if intList has an index that matches target, return that index
		if(findIndex(intList, target1) != 1){
			System.out.println("Error in findIndex 1");
			return false;
		}
		return true;
	}

	/**
	 * second unit test for findIndex method
	 *
	 * @return true if unit test passes
	 */
	public static boolean testFindIndexTwo() {
		//create string lists and assign to StringList. target is StringList you want
		//want to find equal value to
		StringList stringListOne = new StringList(new String[]{"hey", "hi",
		 "hello"});
		StringList stringListTwo = new StringList(new String[]{"oops", "ouch",
		 "ow"});
		StringList stringListThree = new StringList(new String[]{"lol", "haha"});
		StringList target2 = new StringList(new String[]{"lol", "haha"});
		StringList[] stringList = new StringList[3];
		stringList[0] = stringListOne;
		stringList[1] = stringListTwo;
		stringList[2] = stringListThree;
		//if intList has an index that matches target, return that index
		if(findIndex(stringList, target2) != 2){
			System.out.println("Error in findIndex 2");
			return false;
		}
		return true;
	}

	/**
	 * units tests of methods
	 *
	 * @return true if all unit tests pass
	 */
	public static boolean unitTests() {
		if(testSortOne() != true){
			System.out.println("Unit test fail for testSortOne");
			return false;
		}
		if(testSortTwo() != true){
			System.out.println("Unit test fail for testSortTwo");
			return false;
		}
		if(testSortThree() != true){
			System.out.println("Unit test fail for testSortThree");
			return false;
		}
		if(testMeanOne() != true){
			System.out.println("Unit test fail for testMeanOne");
			return false;
		}
		if(testMeanTwo() != true){
			System.out.println("Unit test fail for testMeanTwo");
			return false;
		}
		if(testFindIndexOne() != true){
			System.out.println("Unit test fail for testFindIndexOne");
			return false;
		}
		if(testFindIndexTwo() != true){
			System.out.println("Unit test fail for testFindIndexTwo");
			return false;
		}
			  // Consider testing:
        //  1. an array of StringList objects
        //  2. an array of IntegerList objects
        //  3. an array of Cuboid objects
        //  4. an array of Sphere objects
        //  5. an array with a combination of objects

		// Magic numbers and strings are okay when testing!

		return true;
	}

	/**
	 * main method of Assignment 6
	 */
	public static void main(String[] args) {
		// Perform unitTests first
		if(unitTests()) {
			System.out.println("All unit tests passed.\n");
		} else {
			System.out.println("Failed test.\n");
			return;
		}

		IntegerList[] intList = new IntegerList[3];
		intList[0] = new IntegerList(new int[]{1, 2, 3, 4});
		intList[1] = new IntegerList(new int[]{3, 4, 4, 6});
		intList[2] = new IntegerList(new int[]{-4, 6, 10});

		IntegerList target1 = new IntegerList(new int[]{-4, 6, 10});
		int idx = findIndex(intList, target1);
		System.out.println("\nindex:\n" + idx);

		System.out.println("\nmean:");
		MyObject mean = mean(intList);
		if(mean != null) {
			System.out.println(mean.toString());
		}

		System.out.println("\nsorted:");
		if(sort(intList)) {
			for(int i = 0; i < intList.length; i++) {
				System.out.println(intList[i].toString());
			}
		}
	}
}
