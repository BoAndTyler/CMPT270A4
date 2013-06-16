package systemEntities;

public class Person 
{
	private String name;
	private String address;
	private String phoneNumHome;
	private String phoneNumWork;
	private String email;
	
	// Another option is to have no inputs and initialize parameters to null
	public Person(String pName, String pAddress, String pHomePhone, String pWorkPhone, String pEmail)
	{
		name = pName;
		address = pAddress;
		phoneNumHome = pHomePhone;
		phoneNumWork = pWorkPhone;
		email = pEmail;
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
	
	public void setName(String firstName, String lastName, String middleInitial)
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
		phoneNumHome = "306-" + phoneNum.substring(0,4) + "-" + phoneNum.substring(4);
	}
	
	public void setWorkPhoneNum(String phoneNum)
	{	
		phoneNumWork = "306-" + phoneNum.substring(0,4) + "-" + phoneNum.substring(4);
	}
	
	public void setEmail(String emailAddress)
	{
		email = emailAddress;
	}
	
	public static void main(String[] args) 
	{
		// TODO Add test cases

	}
}
