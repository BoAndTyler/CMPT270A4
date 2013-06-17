package systemEntities;

public class Person 
{
	private String name;
	private String address;
	private String phoneNumHome;
	private String phoneNumWork;
	private String email;
	
	// Another option is to have no inputs and initialize parameters to null
//	public Person(String pName, String pAddress, String pHomePhone, String pWorkPhone, String pEmail)
//	{
//		name = pName;
//		address = pAddress;
//		phoneNumHome = pHomePhone;
//		phoneNumWork = pWorkPhone;
//		email = pEmail;
//	}
	public Person()
	{
		name = null;
		address = null;
		phoneNumHome = null;
		phoneNumWork = null;
		email = null;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getAddress()
	{
		return address;
	}
	
	public String getHomePhoneNum()
	{
		return phoneNumHome;
	}
	
	public String getWorkPhoneNum()
	{
		return phoneNumWork;
	}
	
	public String getEmail()
	{
		return email;
	}
	
	public void setName(String firstName, String middleInitial, String lastName)
	{
		if(middleInitial == null || middleInitial.equals(""))
		{
			name = lastName + ", " + firstName;
		}
		else
		{
			name = lastName + ", " + firstName + ", " + middleInitial + ".";
		}
	}
	
	public void setAddress(String streetAddress, String city, String prov, String postalCode)
	{
		address = streetAddress + "/n" + city + ", " + prov + ", " + postalCode;
	}
	
	public void setHomePhoneNum(String phoneNum)
	{	
		phoneNumHome = "306-" + phoneNum.substring(0,3) + "-" + phoneNum.substring(3);
	}
	
	public void setWorkPhoneNum(String phoneNum)
	{	
		phoneNumWork = "306-" + phoneNum.substring(0,3) + "-" + phoneNum.substring(3);
	}
	
	public void setEmail(String emailAddress)
	{
		email = emailAddress;
	}
	
	public static void main(String[] args) 
	{
		Person newPerson = new Person();
		
		newPerson.setName("John", "A", "Doe");
		if(!newPerson.getName().equals("Doe, John, A."))
		{
			System.out.println("Failed to set the person's name.");
		}
		
		newPerson.setAddress("123 Anywhere Street", "City", "Province", "A1B2C3");
		if(!newPerson.getAddress().equals("123 Anywhere Street/nCity, Province, A1B2C3"))
		{
			System.out.println("Failed to set the person's address.");
		}
		
		newPerson.setHomePhoneNum("1234567");
		if(!newPerson.getHomePhoneNum().equals("306-123-4567"))
		{
			System.out.println("Failed to set the person's home phone number.");
		}
		
		newPerson.setWorkPhoneNum("9876543");
		if(!newPerson.getWorkPhoneNum().equals("306-987-6543"))
		{
			System.out.println("Failed to set the person's work phone number.");
		}
		
		newPerson.setEmail("j.doe@email.com");
		if(!newPerson.getEmail().equals("j.doe@email.com"))
		{
			System.out.println("Failed to set the person's email address.");
		}
	}
}
