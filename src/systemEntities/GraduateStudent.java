package systemEntities;

public class GraduateStudent extends UndergradStudent 
{
	private String thesisSupervisor;
	private String thesis;
	private int scholarShipAmount;
	private String degreeType;

	public GraduateStudent(String pName, String pAddress, String pHomePhone, String pWorkPhone, String pEmail) 
	{
		super(pName, pAddress, pHomePhone, pWorkPhone, pEmail);
		// Can initialize to zero/null or input values when a new Student is created
		thesisSupervisor = null;
		thesis = null;
		scholarShipAmount = 0;
		degreeType = null;
	}
	
	public String getThesisSupervisor()
	{
		return thesisSupervisor;
	}
	
	public String getThesis()
	{
		return thesis;
	}
	
	public int getScholarShipAmount()
	{
		return scholarShipAmount;
	}
	
	public String getDegreeType()
	{
		return degreeType;
	}
	
	public void setThesisSupervisor(String supervisor)
	{
		thesisSupervisor = supervisor;
	}
	
	public void setThesis(String gradThesis)
	{
		thesis = gradThesis;
	}
	
	public void setScholarShipAmount(int amount)
	{
		scholarShipAmount = amount;
	}
	
	public void setDegreeType(String degree)
	{
		degreeType = degree;
	}

	public static void main(String[] args) 
	{
		// TODO Add test cases

	}

}
