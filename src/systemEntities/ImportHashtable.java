package systemEntities;

import java.beans.XMLDecoder;
import java.io.File;
import java.io.FileInputStream;
import java.util.Hashtable;

import dataStorage.PersonSetAccess;

public class ImportHashtable {

	public static void importHashtable()
	{
		File file = new File("Hashtable.xml");
		if(file.exists())
		{
			try 
			{
				XMLDecoder decoder = new XMLDecoder(new FileInputStream("Hashtable.xml"));
	
		      	//Thingy thingy = (Thingy)decoder.readObject();
				//Hashtable temp = PersonSetAccess.personList();
		      	PersonSetAccess.importList((Hashtable<String, Person>) decoder.readObject());
	
		      	//System.out.println(thingy.getHash());
		      	decoder.close();
		    } 
			catch (Exception e) 
		    {
				e.printStackTrace(System.out);
		    }
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		File file = new File("Hashtable.xml");
		if(file.exists())
		{
			try 
			{
				XMLDecoder decoder = new XMLDecoder(new FileInputStream("Hashtable.xml"));
	
		      	//Thingy thingy = (Thingy)decoder.readObject();
				//Hashtable temp = PersonSetAccess.personList();
		      	PersonSetAccess.importList((Hashtable<String, Person>) decoder.readObject());
	
		      	//System.out.println(thingy.getHash());
		      	decoder.close();
		    } 
			catch (Exception e) 
		    {
				e.printStackTrace(System.out);
		    }
		}
	}
}
