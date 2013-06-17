package systemEntities;

public class UndergradStudent extends Person 
{
	private int yearRegistered;
	private String degreeProgram;
	private int yearInProgram;
	private int GPA;
	private int totalCredits;
	
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
		yearRegistered = 0;
		degreeProgram = null;
		yearInProgram = 0;
		GPA = 0;
		totalCredits = 0;
	}
	
	public int getYearRegistered()
	{
		return yearRegistered;
	}
	
	public String getDegreeProgram()
	{
		return degreeProgram;
	}
	
	public int getYearInProgram()
	{
		return yearInProgram;
	}
	
	public int getGPA()
	{
		return GPA;
	}
	
	public int getTotalCredits()
	{
		return totalCredits;
	}
	
	public void setYearRegistered(int year)
	{
		yearRegistered = year;
	}
	
	public void setDegreeProgram(String degree)
	{
		degreeProgram = degree;
	}
	
	public void setYearInProgram(int years)
	{
		yearInProgram = years;
	}
	
	public void setGPA(int marks)
	{
		GPA = marks;
	}
	
	public void setTotalCredits(int credits)
	{
		totalCredits = credits;
	}

	public static void main(String[] args) 
	{
		UndergradStudent newUndergrad = new UndergradStudent();
		
		newUndergrad.setYearRegistered(2013);
		if(newUndergrad.getYearRegistered() != 2013)
		{
			System.out.println("Failed to set the undergrad student's registration year.");
		}
		
		newUndergrad.setDegreeProgram("Medicine");
		if(!newUndergrad.getDegreeProgram().equals("Medicine"))
		{
			System.out.println("Failed to set the undergrad student's degree program.");
		}
		
		newUndergrad.setYearInProgram(1);
		if(newUndergrad.getYearInProgram() != 1)
		{
			System.out.println("Failed to set the undergrad student's year in program.");
		}
		
		newUndergrad.setGPA(98);
		if(newUndergrad.getGPA() != 98)
		{
			System.out.println("Failed to set the undergrad student's GPA.");
		}
		
		newUndergrad.setTotalCredits(64);
		if(newUndergrad.getTotalCredits() != 64)
		{
			System.out.println("Failed to set the undergrad student's total credits.");
		}
	}

}
