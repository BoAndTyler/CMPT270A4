package dataStorage;

import java.util.Hashtable;

import systemEntities.Person;

/**
 * A singleton class to access the data structure containing the undergrad students (UndergradStudent Class). 
 * @author Bo Dong and Tyler Spink
 */
public class UndergradSetAccess 
{
	/**
	 * Private constructor to ensure that no instance of this class is created. 
	 */
	private UndergradSetAccess() {}
	
	/**
	 * The hash table list of the undergrad students.
	 */
	private static Hashtable<String, Person> undergradList;
	
	/**
	 * Creates a single instance of a hash table of undergrads and returns it.
	 * @return the table that connects the keys to the undergrad students.
	 */
	public static Hashtable<String, Person> undergradList()
	{
		if (undergradList == null)
		{
			/* Create the initial hash table. */
			undergradList = new Hashtable<String, Person>();
		}
		return undergradList;
	}
}
