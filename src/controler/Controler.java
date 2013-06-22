package controler;

import gui.Panel;
//import java.util.Hashtable;
//import systemEntities.Person;
import systemEntities.GraduateStudent;
import systemEntities.Person;
import systemEntities.UndergradStudent;
//import commands.AddGraduateCommand;
//import commands.AddPersonCommand;
//import commands.AddUndergradCommand;
import dataStorage.PersonSetAccess;

public class Controler {
//	Hashtable<String, Person> databaseHashtable;
//	
//	public void createPersonFromGUI(Person newGuy){
//		databaseHashtable.put(newGuy.getName(), newGuy);
//		updateList();
//	}
	
	private String eventLog;
	Panel mainPanel;
	
	public void setPanel(Panel a){
		this.mainPanel = a;
	}
	public Panel getPanel(){
		return mainPanel;
	}
	public void deletePerson(Person aPerson){
		PersonSetAccess.personList().remove(aPerson.getName());
	}
	public void addPerson(String firstName, String middleInitial, String lastName, String streetAddress, String city, 
			String prov, String postalCode, String homePhone, String workPhone, String emailAddress)
	{
		Person p = new Person();
		
		p.setName(firstName, middleInitial, lastName);
		p.setAddress(streetAddress, city, prov, postalCode);
		p.setHomePhoneNum(homePhone);
		p.setWorkPhoneNum(workPhone);
		p.setEmail(emailAddress);
		
		PersonSetAccess.personList().put(p.getName(), p);
		mainPanel.updateList();
//		System.out.println(p.getAddress() + p.getEmail() + p.getHomePhoneNum() + p.getName() + p.getWorkPhoneNum());
		setEventLog("Person added.");
	}
	
	public void addUndergrad(String firstName, String middleInitial, String lastName, String streetAddress, String city, 
			String prov, String postalCode, String homePhone, String workPhone, String emailAddress,
			String yearRegistered, String degreeProgram, String currentYear, String marks, String totalCredits)
	{
		UndergradStudent u = new UndergradStudent();
		
		u.setName(firstName, middleInitial, lastName);
		u.setAddress(streetAddress, city, prov, postalCode);
		u.setHomePhoneNum(homePhone);
		u.setWorkPhoneNum(workPhone);
		u.setEmail(emailAddress);
		
		u.setYearRegistered(yearRegistered);
		u.setDegreeProgram(degreeProgram);
		u.setYearInProgram(currentYear);
		u.setGPA(marks);
		u.setTotalCredits(totalCredits);
		
		PersonSetAccess.personList().put(u.getName(), u);
		mainPanel.updateList();
		setEventLog("Undergrad student added.");
	}
	
//	public void addGraduate()
//	{
//		// These values will take input from GUI (temp values filled in)
//		String firstName = "Joe";
//		String middleInitial = "A";
//		String lastName = "Doe";
//		String streetAddress = "123 Anywhere Street";
//		String city = "Saskatoon";
//		String prov = "SK";
//		String postalCode = "A1B2C3";
//		String homePhone = "1234567";
//		String workPhone = "3456789";
//		String emailAddress = "j.doe@server.ca";
//		
//		int yearRegistered = 2013;
//		String degreeProgram = "Medicine";
//		int currentYear = 2;
//		int marks = 98;
//		int totalCredits = 64;
//		
//		String supervisor = "Prof. Smith";
//		String thesisTitle = "The Human Body";
//		String thesisArea = "Cure for the common cold.";
//		int scholarship = 1000;
//		String degreeType = "MedDoc";
//		
//		AddGraduateCommand addG = new AddGraduateCommand();
//		addG.addGraduate(firstName, middleInitial, lastName, streetAddress, city, 
//							prov, postalCode, homePhone, workPhone, emailAddress, 
//							yearRegistered, degreeProgram, currentYear, marks, totalCredits, 
//							supervisor, thesisTitle, thesisArea, scholarship, degreeType);
//		
//		setEventLog("Graduate student added.");
//		//updateList();
//	}
	
	public void addGraduate(String firstName, String middleInitial, String lastName, String streetAddress, String city, 
			String prov, String postalCode, String homePhone, String workPhone, String emailAddress,
			String yearRegistered, String degreeProgram, String currentYear, String marks, String totalCredits,
			String supervisor, String thesisTitle, String thesisArea, String scholarship, String degreeType)
	{
		GraduateStudent g = new GraduateStudent();
		
		g.setName(firstName, middleInitial, lastName);
		g.setAddress(streetAddress, city, prov, postalCode);
		g.setHomePhoneNum(homePhone);
		g.setWorkPhoneNum(workPhone);
		g.setEmail(emailAddress);
		
		g.setYearRegistered(yearRegistered);
		g.setDegreeProgram(degreeProgram);
		g.setYearInProgram(currentYear);
		g.setGPA(marks);
		g.setTotalCredits(totalCredits);
		
		g.setThesisSupervisor(supervisor);
		g.setThesis(thesisTitle, thesisArea);
		g.setScholarShipAmount(scholarship);
		g.setDegreeType(degreeType);
		
		PersonSetAccess.personList().put(g.getName(), g);
		mainPanel.updateList();
		setEventLog("Graduate student added.");
	}
	
	public void setEventLog(String event)
	{
		eventLog += event + "/n";
	}
	
	public String getEventLog()
	{
		return eventLog;
	}
}
