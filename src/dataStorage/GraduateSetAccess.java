package dataStorage;

import java.util.Hashtable;

import systemEntities.Person;

/**
 * A singleton class to access the data structure containing the graduate students (GraduateStudent Class). 
 * @author Bo Dong and Tyler Spink
 */
public class GraduateSetAccess 
{
	/**
	 * Private constructor to ensure that no instance of this class is created. 
	 */
	private GraduateSetAccess() {}
	
	/**
	 * The hash table list of the graduate students.
	 */
	private static Hashtable<String, Person> graduateList;
	
	/**
	 * Creates a single instance of a hash table of graduate students and returns it.
	 * @return the table that connects the keys to the graduate students.
	 */
	public static Hashtable<String, Person> graduateList()
	{
		if (graduateList == null)
		{
			/* Create the initial hash table. */
			graduateList = new Hashtable<String, Person>();
		}
		return graduateList;
	}
}
