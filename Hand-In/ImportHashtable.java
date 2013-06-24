package systemEntities;

import java.beans.XMLDecoder;
import java.io.File;
import java.io.FileInputStream;
import java.util.Hashtable;
import dataStorage.PersonSetAccess;

/**
 * Upon startup of the program the data from the previous session is loaded back into the current session.
 * @author Bo Dong and Tyler Spink
 */
public class ImportHashtable {

	/**
	 * Imports data from an XML file into the hash table.
	 */
	public static void importHashtable()
	{
		File file = new File("Hashtable.xml");
		
		if(file.exists())
		{
			try 
			{
				XMLDecoder decoder = new XMLDecoder(new FileInputStream("Hashtable.xml"));
	
		      	PersonSetAccess.importList((Hashtable<String, Person>) decoder.readObject());
	
		      	decoder.close();
		    } 
			catch (Exception e) 
		    {
				e.printStackTrace(System.out);
		    }
		}
	}
}
