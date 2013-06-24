package controler;

import gui.Panel;
import systemEntities.GraduateStudent;
import systemEntities.Person;
import systemEntities.UndergradStudent;
import dataStorage.PersonSetAccess;

/**
 * The controller obtains the parameter values for the operation, executes the operation, 
 * then handles the result of the operation and records an event log of each operation.
 * @author Bo Dong and Tyler Spink
 */
public class Controler {
	
	/**
	 * A string to store the events to be logged.
	 */
	private String eventLog;
	
	/**
	 * Access to the main panel.
	 */
	Panel mainPanel;
	
	/**
	 * Sets the main panel.
	 * @param a the panel to set to the main
	 */
	public void setPanel(Panel a){
		this.mainPanel = a;
	}
	
	/**
	 * Retrieves the main panel.
	 * @return the main panel.
	 */
	public Panel getPanel(){
		return mainPanel;
	}
	
	/**
	 * Removes a person from the hash table list.
	 * @param aPerson the person to be deleted
	 */
	public void deletePerson(Person aPerson){
		PersonSetAccess.personList().remove(aPerson.getName());
		setEventLog("Data updated.");
	}
	
	/**
	 * Creates a new person to be added to the hash table with the following fields.
	 * @param firstName first name of the person to be added
	 * @param middleInitial middle initial of the person to be added
	 * @param lastName last name of the person to be added
	 * @param streetAddress the street address that the person lives on
	 * @param city the city the person lives in
	 * @param prov the province the person lives in
	 * @param postalCode the postal code of the person to be added
	 * @param homePhone the home phone number of the person to be added
	 * @param workPhone the work phone number of the person to be added
	 * @param emailAddress the email address of the person to be added
	 */
	public void addPerson(String firstName, String middleInitial, String lastName, String streetAddress, String city, 
							String prov, String postalCode, String homePhone, String workPhone, String emailAddress)
	{
		Person p = new Person();
		
		//p.setName(firstName, middleInitial, lastName);
		p.setFirstName(firstName);
		p.setMiddleInitial(middleInitial);
		p.setLastName(lastName);
		//p.setAddress(streetAddress, city, prov, postalCode);
		p.setStAddress(streetAddress);
		p.setCity(city);
		p.setProvince(prov);
		p.setPostalCode(postalCode);
		p.setHomePhoneNum(homePhone);
		p.setWorkPhoneNum(workPhone);
		p.setEmail(emailAddress);
		
		PersonSetAccess.personList().put(p.getName(), p);
		mainPanel.updateList();
//		System.out.println(p.getAddress() + p.getEmail() + p.getHomePhoneNum() + p.getName() + p.getWorkPhoneNum());
		setEventLog("Person added.");
	}
	
	/**
	 * Creates a new undergrad student to be added to the hash table with the following fields.
	 * @param firstName first name of the undergrad to be added
	 * @param middleInitial middle initial of the undergrad to be added
	 * @param lastName last name of the undergrad to be added
	 * @param streetAddress the street address that the undergrad lives on
	 * @param city the city the undergrad lives in
	 * @param prov the province the undergrad lives in
	 * @param postalCode the postal code of the undergrad to be added
	 * @param homePhone the home phone number of the undergrad to be added
	 * @param workPhone the work phone number of the undergrad to be added
	 * @param emailAddress the email address of the undergrad to be added
	 * @param yearRegistered the first year registered as an undergrad
	 * @param degreeProgram the degree that the undergrad is taking
	 * @param currentYear the current year that undergrad is in their degree
	 * @param marks the GPA of the undergrad
	 * @param totalCredits the total number of credits received by the undergrad
	 */
	public void addUndergrad(String firstName, String middleInitial, String lastName, String streetAddress, String city, 
			String prov, String postalCode, String homePhone, String workPhone, String emailAddress,
			String yearRegistered, String degreeProgram, String currentYear, String marks, String totalCredits)
	{
		UndergradStudent u = new UndergradStudent();
		
		//u.setName(firstName, middleInitial, lastName);
		u.setFirstName(firstName);
		u.setMiddleInitial(middleInitial);
		u.setLastName(lastName);
		//u.setAddress(streetAddress, city, prov, postalCode);
		u.setStAddress(streetAddress);
		u.setCity(city);
		u.setProvince(prov);
		u.setPostalCode(postalCode);
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
	
	/**
	 * Creates a new graduate student to be added to the hash table with the following fields.
	 * @param firstName first name of the graduate to be added
	 * @param middleInitial middle initial of the graduate to be added
	 * @param lastName last name of the graduate to be added
	 * @param streetAddress the street address that the graduate lives on
	 * @param city the city the graduate lives in
	 * @param prov the province the graduate lives in
	 * @param postalCode the postal code of the graduate to be added
	 * @param homePhone the home phone number of the graduate to be added
	 * @param workPhone the work phone number of the graduate to be added
	 * @param emailAddress the email address of the graduate to be added
	 * @param yearRegistered the first year registered as a graduate
	 * @param degreeProgram the degree that the graduate is taking
	 * @param currentYear the current year that graduate is in their degree
	 * @param marks the GPA of the graduate
	 * @param totalCredits the total number of credits received by the graduate
	 * @param supervisor the name of the supervisor for the graduate
	 * @param thesisTitle the title of the graduate's thesis
	 * @param thesisArea the area of the graduate's thesis
	 * @param scholarship amount on money earned from scholarships
	 * @param degreeType type of degree that the graduate is taking
	 */
	public void addGraduate(String firstName, String middleInitial, String lastName, String streetAddress, String city, 
			String prov, String postalCode, String homePhone, String workPhone, String emailAddress,
			String yearRegistered, String degreeProgram, String currentYear, String marks, String totalCredits,
			String supervisor, String thesisTitle, String thesisArea, String scholarship, String degreeType)
	{
		GraduateStudent g = new GraduateStudent();
		
		//g.setName(firstName, middleInitial, lastName);
		g.setFirstName(firstName);
		g.setMiddleInitial(middleInitial);
		g.setLastName(lastName);
		//g.setAddress(streetAddress, city, prov, postalCode);
		g.setStAddress(streetAddress);
		g.setCity(city);
		g.setProvince(prov);
		g.setPostalCode(postalCode);
		g.setHomePhoneNum(homePhone);
		g.setWorkPhoneNum(workPhone);
		g.setEmail(emailAddress);
		
		g.setYearRegistered(yearRegistered);
		g.setDegreeProgram(degreeProgram);
		g.setYearInProgram(currentYear);
		g.setGPA(marks);
		g.setTotalCredits(totalCredits);
		
		g.setThesisSupervisor(supervisor);
		//g.setThesis(thesisTitle, thesisArea);
		g.setThesisTitle(thesisTitle);
		g.setThesisArea(thesisArea);
		g.setScholarShipAmount(scholarship);
		g.setDegreeType(degreeType);
		
		PersonSetAccess.personList().put(g.getName(), g);
		mainPanel.updateList();
		setEventLog("Graduate student added.");
	}
	
	/**
	 * Adds a new event to log.
	 * @param event the new event to be logged
	 */
	public void setEventLog(String event)
	{
		eventLog += event + "/n";
	}
	
	/**
	 * Retrieves the recorded event log.
	 * @return the event log of controller updates.
	 */
	public String getEventLog()
	{
		return eventLog;
	}
}
