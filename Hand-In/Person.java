package systemEntities;

/**
 * The fields of a person and the respective setters and getters to access them.
 * @author Bo Dong and Tyler Spink
 */
public class Person 
{
	/**
	 * The person's first name.
	 */
	private String firstName;
	
	/**
	 * The person's middle initial.
	 */
	private String middleInitial;
	
	/**
	 * The person's last name.
	 */
	private String lastName;
	
	/**
	 * The person's street address.
	 */
	private String streetAddress;
	
	/**
	 * The city where the person lives.
	 */
	private String city;
	
	/**
	 * The province where the person lives.
	 */
	private String province;
	
	/**
	 * The person's postal code.
	 */
	private String postalCode;
	
	/**
	 * The person's home phone number.
	 */
	private String phoneNumHome;
	
	/**
	 * The person's work phone number.
	 */
	private String phoneNumWork;
	
	/**
	 * The person's email address.
	 */
	private String email;
	
	/**
	 * Constructor of person.
	 */
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
	
	/**
	 * Retrieves the person's name.
	 * @return the person's name.
	 */
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
	
	/**
	 * Retrieves the person's first name.
	 * @return the person's first name.
	 */
	public String getFirstName()
	{
		return firstName;
	}
	
	/**
	 * Retrieves the person's middle initial.
	 * @return the person's middle initial.
	 */
	public String getMiddleInitial()
	{
		return middleInitial;
	}
	
	/**
	 * Retrieves the person's last name.
	 * @return the person's last name.
	 */
	public String getLastName()
	{
		return lastName;
	}
	
	/**
	 * Retrieves the person's street address.
	 * @return the person's street address.
	 */
	public String getStAddress()
	{
		return streetAddress;
	}
	
	/**
	 * Retrieves the city where the person lives.
	 * @return the city where the person lives.
	 */
	public String getCity()
	{
		return city;
	}
	
	/**
	 * Retrieves the province where the person lives.
	 * @return the province where the person lives.
	 */
	public String getProvince()
	{
		return province;
	}
	
	/**
	 * Retrieves the person's postal code.
	 * @return the person's postal code.
	 */
	public String getPostalCode()
	{
		return postalCode;
	}
	
	/**
	 * Retrieves the address of the person.
	 * @return the address of the person.
	 */
	public String getAddress()
	{
		return (streetAddress + "\n" + city + ", " + province + ", " + postalCode);

	}
	
	/**
	 * Retrieves the person's home phone number. 
	 * @return the person's home phone number.
	 */
	public String getHomePhoneNum()
	{
		return phoneNumHome;
	}
	
	/**
	 * Retrieves the person's work phone number.
	 * @return the person's work phone number.
	 */
	public String getWorkPhoneNum()
	{
		return phoneNumWork;
	}
	
	/**
	 * Retrieves the person's email address.
	 * @return the person's email address.
	 */
	public String getEmail()
	{
		return email;
	}
	
	/**
	 * Sets the person's full name.
	 * @param aFirstName the person's first name
	 * @param aMiddleInitial the person's middle initial
	 * @param aLastName the person's last name
	 */
	public void setName(String aFirstName, String aMiddleInitial, String aLastName)
	{
			lastName = aLastName;
			firstName = aFirstName;
			middleInitial = aMiddleInitial;
		
	}
	
	/**
	 * Sets the person's first name.
	 * @param aFirstName the person's first name
	 */
	public void setFirstName(String aFirstName)
	{
		firstName = aFirstName;
	}
	
	/**
	 * Sets the person's middle initial.
	 * @param aMiddleInitial the person's middle initial
	 */
	public void setMiddleInitial(String aMiddleInitial)
	{
		middleInitial = aMiddleInitial;
	}
	
	/**
	 * Sets the person's last name.
	 * @param aLastName the person's last name
	 */
	public void setLastName(String aLastName)
	{
		lastName = aLastName;
	}
	
	/**
	 * Sets the address of the person.
	 * @param aStreetAddress the person's street address
	 * @param aCity the city the person lives in
	 * @param aProv the province the person lives in
	 * @param aPostalCode the person's postal code
	 */
	public void setAddress(String aStreetAddress, String aCity, String aProv, String aPostalCode)
	{
		streetAddress = aStreetAddress;
		city = aCity;
		province = aProv;
		postalCode = aPostalCode;
	}
	
	/**
	 * Sets the person's street address.
	 * @param aStreetAddress the person's street address
	 */
	public void setStAddress(String aStreetAddress)
	{
		streetAddress = aStreetAddress;
	}
	
	/**
	 * Sets the city where the person lives.
	 * @param aCity the city where the person lives
	 */
	public void setCity(String aCity)
	{
		city = aCity;
	}
	
	/**
	 * Sets the province where the person lives.
	 * @param aProv the province where the person lives
	 */
	public void setProvince(String aProv)
	{
		province = aProv;
	}
	
	/**
	 * Sets the person's postal code.
	 * @param aPostalCode the person's postal code
	 */
	public void setPostalCode(String aPostalCode)
	{
		postalCode = aPostalCode;
	}
	
	/**
	 * Sets the person's home phone number.
	 * @param phoneNum the person's home phone number
	 */
	public void setHomePhoneNum(String phoneNum)
	{	
		phoneNumHome = phoneNum;
	}
	
	/**
	 * Sets the person's work phone number
	 * @param phoneNum the person's work phone number
	 */
	public void setWorkPhoneNum(String phoneNum)
	{	
		phoneNumWork = phoneNum;
	}
	
	/**
	 * Sets the person's email address.
	 * @param emailAddress the person's email address
	 */
	public void setEmail(String emailAddress)
	{
		email = emailAddress;
	}
	
	/**
	 * Testing the setters and getters of the Person class.
	 */
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
