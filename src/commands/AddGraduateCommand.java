package commands;

import systemEntities.GraduateStudent;
//import systemEntities.UndergradStudent;
import dataStorage.PersonSetAccess;

public class AddGraduateCommand 
{
	public void addGraduate(String firstName, String middleInitial, String lastName, String streetAddress, String city, 
							String prov, String postalCode, String homePhone, String workPhone, String emailAddress,
							int yearRegistered, String degreeProgram, int currentYear, int marks, int totalCredits,
							String supervisor, String thesisTitle, String thesisArea, int scholarship, String degreeType)
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
	}
}
