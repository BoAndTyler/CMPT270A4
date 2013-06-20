package commands;

//import systemEntities.Person;
import systemEntities.UndergradStudent;
import dataStorage.PersonSetAccess;

public class AddUndergradCommand 
{
	public void addUndergrad(String firstName, String middleInitial, String lastName, String streetAddress, String city, 
								String prov, String postalCode, String homePhone, String workPhone, String emailAddress,
								int yearRegistered, String degreeProgram, int currentYear, int marks, int totalCredits)
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
	}
}
