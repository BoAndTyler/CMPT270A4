package systemEntities;

import java.beans.XMLEncoder;
import java.io.FileOutputStream;

import dataStorage.PersonSetAccess;

public class SaveHashtable {

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
	/**
	 * @param args
	 */
	public static void main(String[] args) 
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
