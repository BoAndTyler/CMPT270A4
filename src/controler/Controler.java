package controler;

//import gui.Panel;
//import java.util.Hashtable;
//import systemEntities.Person;

import commands.AddGraduateCommand;
import commands.AddPersonCommand;
import commands.AddUndergradCommand;

public class Controler {
//	Hashtable<String, Person> databaseHashtable;
//	Panel mainPanel;
//	
//	public void createPersonFromGUI(Person newGuy){
//		databaseHashtable.put(newGuy.getName(), newGuy);
//		updateList();
//	}
	
	// performed when create button is clicked
	public void addPerson()
	{
		// These values will take input from GUI (temp values filled in)
		String firstName = "Joe";
		String middleInitial = "A";
		String lastName = "Doe";
		String streetAddress = "123 Anywhere Street";
		String city = "Saskatoon";
		String prov = "SK";
		String postalCode = "A1B2C3";
		String homePhone = "1234567";
		String workPhone = "3456789";
		String emailAddress = "j.doe@server.ca";
		
		AddPersonCommand addP = new AddPersonCommand();
		addP.addPerson(firstName, middleInitial, lastName, streetAddress, city, 
						prov, postalCode, homePhone, workPhone, emailAddress);
		
		updateList();
	}
	
	public void addUndergrad()
	{
		// These values will take input from GUI (temp values filled in)
		String firstName = "Joe";
		String middleInitial = "A";
		String lastName = "Doe";
		String streetAddress = "123 Anywhere Street";
		String city = "Saskatoon";
		String prov = "SK";
		String postalCode = "A1B2C3";
		String homePhone = "1234567";
		String workPhone = "3456789";
		String emailAddress = "j.doe@server.ca";
		
		int yearRegistered = 2013;
		String degreeProgram = "Medicine";
		int currentYear = 2;
		int marks = 98;
		int totalCredits = 64;
				
		AddUndergradCommand addU = new AddUndergradCommand();
		addU.addUndergrad(firstName, middleInitial, lastName, streetAddress, city, 
							prov, postalCode, homePhone, workPhone, emailAddress, 
							yearRegistered, degreeProgram, currentYear, marks, totalCredits);
		
		updateList();
	}
	
	public void addGraduate()
	{
		// These values will take input from GUI (temp values filled in)
		String firstName = "Joe";
		String middleInitial = "A";
		String lastName = "Doe";
		String streetAddress = "123 Anywhere Street";
		String city = "Saskatoon";
		String prov = "SK";
		String postalCode = "A1B2C3";
		String homePhone = "1234567";
		String workPhone = "3456789";
		String emailAddress = "j.doe@server.ca";
		
		int yearRegistered = 2013;
		String degreeProgram = "Medicine";
		int currentYear = 2;
		int marks = 98;
		int totalCredits = 64;
		
		String supervisor = "Prof. Smith";
		String thesisTitle = "The Human Body";
		String thesisArea = "Cure for the common cold.";
		int scholarship = 1000;
		String degreeType = "MedDoc";
		
		AddGraduateCommand addG = new AddGraduateCommand();
		addG.addGraduate(firstName, middleInitial, lastName, streetAddress, city, 
							prov, postalCode, homePhone, workPhone, emailAddress, 
							yearRegistered, degreeProgram, currentYear, marks, totalCredits, 
							supervisor, thesisTitle, thesisArea, scholarship, degreeType);
		
		updateList();
	}

	private void updateList() {
		// TODO Auto-generated method stub
		
	}
	
}
