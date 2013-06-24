package systemEntities;

import java.beans.XMLEncoder;
import java.io.FileOutputStream;
import dataStorage.PersonSetAccess;

/**
 * Upon closing of the program all data in the current session is saved for next session.
 * @author Bo Dong and Tyler Spink
 */
public class SaveHashtable {

	/**
	 * Saves data stored in the hash table to an XML file.
	 */
	public static void saveHashtable()
	{
		try 
		{
		      XMLEncoder encoder = new XMLEncoder(new FileOutputStream("Hashtable.xml"));
		      
		      encoder.writeObject(PersonSetAccess.personList());
		      
		      //encoder.flush();
		      encoder.close();
	    } 
		catch (Exception e) 
	    {
		      e.printStackTrace(System.out);
	    }
	}
}
