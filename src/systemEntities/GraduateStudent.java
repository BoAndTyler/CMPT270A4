package systemEntities;

public class GraduateStudent extends UndergradStudent 
{
	private String thesisSupervisor;
	private Thesis thesis;
	private int scholarShipAmount;
	private String degreeType;

	// Can initialize to zero/null or input values when a new Student is created
//	public GraduateStudent(String pName, String pAddress, String pHomePhone, String pWorkPhone, String pEmail) 
//	{
//		super(pName, pAddress, pHomePhone, pWorkPhone, pEmail);
//		
//		thesisSupervisor = null;
//		thesis = null;
//		scholarShipAmount = 0;
//		degreeType = null;
//	}
	public GraduateStudent() 
	{
		super();
		thesisSupervisor = null;
		thesis = new Thesis();
		scholarShipAmount = 0;
		degreeType = null;
	}
	
	public String getThesisSupervisor()
	{
		return thesisSupervisor;
	}
	
	public String getThesis()
	{
		return thesis.getTitle() + "/n" + thesis.getArea();
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
	
	public void setThesis(String newTitle, String newArea)
	{
		thesis.setTitle(newTitle);
		thesis.setArea(newArea);
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
		GraduateStudent newGradStudent = new GraduateStudent();
		
		newGradStudent.setThesisSupervisor("Jane Smith");
		if(!newGradStudent.getThesisSupervisor().equals("Jane Smith"))
		{
			System.out.println("Failed to set the grad student's thesis supervisor.");
		}
		
		newGradStudent.setThesis("Thesis Title", "Field of study");
		if(!newGradStudent.getThesis().equals("Thesis Title/nField of study"))
		{
			System.out.println("Failed to set the thesis title.");
		}
		
		newGradStudent.setScholarShipAmount(1000);
		if(newGradStudent.getScholarShipAmount() != 1000)
		{
			System.out.println("Failed to set the grad student's scholarship amount.");
		}
		
		newGradStudent.setDegreeType("MedDoc");
		if(!newGradStudent.getDegreeType().equals("MedDoc"))
		{
			System.out.println("Failed to set the grad student's degree type.");
		}
	}
}
