package systemEntities;

public class Person 
{
	private String firstName;
	private String middleInitial;
	private String lastName;
	private String streetAddress;
	private String city;
	private String province;
	private String postalCode;	
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
		firstName = null;
		middleInitial = null;
		lastName = null;
		streetAddress = null;
		city = null;
		province = null;
		postalCode = null;
		phoneNumHome = null;
		phoneNumWork = null;
		email = null;
	}
	
	public String getName()
	{
		if(middleInitial == null || middleInitial.equals(""))
		{
			return(lastName + ", " + firstName);
		}
		else
		{
			return (lastName + ", " + firstName + ", " + middleInitial + ".");
		}
	}
	public String getFirstName()
	{
		return firstName;
	}
	public String getMiddleInitial()
	{
		return middleInitial;
	}
	public String getLastName()
	{
		return lastName;
	}
	public String getStAddress()
	{
		return streetAddress;
	}
	public String getCity()
	{
		return city;
	}
	public String getProvince()
	{
		return province;
	}
	public String getPostalCode()
	{
		return postalCode;
	}
	public String getAddress()
	{
		return (streetAddress + "\n" + city + ", " + province + ", " + postalCode);

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
	
	public void setName(String aFirstName, String aMiddleInitial, String aLastName)
	{
			lastName = aLastName;
			firstName = aFirstName;
			middleInitial = aMiddleInitial;
		
	}
	
	public void setFirstName(String aFirstName)
	{
		firstName = aFirstName;
	}
	
	public void setMiddleInitial(String aMiddleInitial)
	{
		middleInitial = aMiddleInitial;
	}
	
	public void setLastName(String aLastName)
	{
		lastName = aLastName;
	}
	
	public void setAddress(String aStreetAddress, String aCity, String aProv, String aPostalCode)
	{
		streetAddress = aStreetAddress;
		city = aCity;
		province = aProv;
		postalCode = aPostalCode;
	}
	
	public void setStAddress(String aStreetAddress)
	{
		streetAddress = aStreetAddress;
	}
	
	public void setCity(String aCity)
	{
		city = aCity;
	}
	
	public void setProvince(String aProv)
	{
		province = aProv;
	}
	
	public void setPostalCode(String aPostalCode)
	{
		postalCode = aPostalCode;
	}
	
	// TODO - Get rid of substring
//	public void setHomePhoneNum(String phoneNum)
//	{	
//		phoneNumHome = "306-" + phoneNum.substring(0,3) + "-" + phoneNum.substring(3);
//	}
	public void setHomePhoneNum(String phoneNum)
	{	
		phoneNumHome = phoneNum;
	}
	
//	public void setWorkPhoneNum(String phoneNum)
//	{	
//		phoneNumWork = "306-" + phoneNum.substring(0,3) + "-" + phoneNum.substring(3);
//	}
	public void setWorkPhoneNum(String phoneNum)
	{	
		phoneNumWork = phoneNum;
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
		if(!newPerson.getAddress().equals("123 Anywhere Street\nCity, Province, A1B2C3"))
		{
			System.out.println("Failed to set the person's address.");
		}
		
		newPerson.setHomePhoneNum("1234567");
		if(!newPerson.getHomePhoneNum().equals("1234567"))
		{
			System.out.println("Failed to set the person's home phone number.");
		}
		
		newPerson.setWorkPhoneNum("9876543");
		if(!newPerson.getWorkPhoneNum().equals("9876543"))
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
