package commands;

import dataStorage.PersonSetAccess;
import systemEntities.Person;

public class AddPersonCommand 
{
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
	}
}
