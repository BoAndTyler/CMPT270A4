package systemEntities;

public class UndergradStudent extends Person 
{
	private int yearRegistered;
	private String degreeProgram;
	private int yearInProgram;
	private int GPA;
	private int totalCredits;
	
	public UndergradStudent(String pName, String pAddress, String pHomePhone, String pWorkPhone, String pEmail) 
	{
		super(pName, pAddress, pHomePhone, pWorkPhone, pEmail);
		// Can initialize to zero/null or input values when a new Student is created
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
		// TODO Add test cases

	}

}
