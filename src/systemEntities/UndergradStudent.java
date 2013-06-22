package systemEntities;

public class UndergradStudent extends Person 
{
//	private int yearRegistered;
//	private String degreeProgram;
//	private int yearInProgram;
//	private int GPA;
//	private int totalCredits;
	private String yearRegistered;
	private String degreeProgram;
	private String yearInProgram;
	private String GPA;
	private String totalCredits;
	
	// Can initialize to zero/null or input values when a new Student is created
//	public UndergradStudent(String pName, String pAddress, String pHomePhone, String pWorkPhone, String pEmail) 
//	{
//		super(pName, pAddress, pHomePhone, pWorkPhone, pEmail);
//		
//		yearRegistered = 0;
//		degreeProgram = null;
//		yearInProgram = 0;
//		GPA = 0;
//		totalCredits = 0;
//	}
	public UndergradStudent() 
	{
		super();
		yearRegistered = null;
		degreeProgram = null;
		yearInProgram = null;
		GPA = null;
		totalCredits = null;
	}
	
	public String getYearRegistered()
	{
		return yearRegistered;
	}
	
	public String getDegreeProgram()
	{
		return degreeProgram;
	}
	
	public String getYearInProgram()
	{
		return yearInProgram;
	}
	
	public String getGPA()
	{
		return GPA;
	}
	
	public String getTotalCredits()
	{
		return totalCredits;
	}
	
	public void setYearRegistered(String year)
	{
		yearRegistered = year;
	}
	
	public void setDegreeProgram(String degree)
	{
		degreeProgram = degree;
	}
	
	public void setYearInProgram(String years)
	{
		yearInProgram = years;
	}
	
	public void setGPA(String marks)
	{
		GPA = marks;
	}
	
	public void setTotalCredits(String credits)
	{
		totalCredits = credits;
	}

	public static void main(String[] args) 
	{
		UndergradStudent newUndergrad = new UndergradStudent();
		
		newUndergrad.setYearRegistered("2013");
		if(!newUndergrad.getYearRegistered().equals("2013"))
		{
			System.out.println("Failed to set the undergrad student's registration year.");
		}
		
		newUndergrad.setDegreeProgram("Medicine");
		if(!newUndergrad.getDegreeProgram().equals("Medicine"))
		{
			System.out.println("Failed to set the undergrad student's degree program.");
		}
		
		newUndergrad.setYearInProgram("1");
		if(!newUndergrad.getYearInProgram().equals("1"))
		{
			System.out.println("Failed to set the undergrad student's year in program.");
		}
		
		newUndergrad.setGPA("98");
		if(!newUndergrad.getGPA().equals("98"))
		{
			System.out.println("Failed to set the undergrad student's GPA.");
		}
		
		newUndergrad.setTotalCredits("64");
		if(!newUndergrad.getTotalCredits().equals("64"))
		{
			System.out.println("Failed to set the undergrad student's total credits.");
		}
	}

}
