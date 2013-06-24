package dataStorage;

import java.util.Hashtable;
import systemEntities.Person;

/**
 * A singleton class to access the data structure containing the people. 
 * @author Bo Dong and Tyler Spink
 */
public class PersonSetAccess 
{
	/**
	 * Private constructor to ensure that no instance of this class is created. 
	 */
	private PersonSetAccess() {}
	
	/**
	 * The hash table list of the people.
	 */
	private static Hashtable<String, Person> personList;
	
	/**
	 * Creates a single instance of a hash table of people and returns it.
	 * @return the table that connects the keys to the people.
	 */
	public static Hashtable<String, Person> personList()
	{
		if (personList == null)
		{
			/* Create the initial hash table. */
			personList = new Hashtable<String, Person>();
		}
		return personList;
	}
	
	/**
	 * Imports the saved data and stores it the hash table.
	 * @param newList saved data that is being imported
	 */
	public static void importList(Hashtable<String, Person> newList)
	{
		personList = newList;
	}
}
