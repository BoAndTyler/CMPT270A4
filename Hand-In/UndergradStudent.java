package systemEntities;

/**
 * The extended fields of the undergrad student and the respective setters and getters to access them.
 * @author Bo Dong and Tyler Spink
 */
public class UndergradStudent extends Person 
{
	/**
	 * The year the undergrad student registered.
	 */
	private String yearRegistered;
	
	/**
	 * The degree of the program that the undergrad student is in.
	 */
	private String degreeProgram;
	
	/**
	 * The year that the undergrad student is in the program.
	 */
	private String yearInProgram;
	
	/**
	 * The GPA of the undergrad student.
	 */
	private String GPA;
	
	/**
	 * The total credits completed by the undergrad student.
	 */
	private String totalCredits;
	
	/**
	 * Constructor for undergrad student.
	 */
	public UndergradStudent() 
	{
		super();
		yearRegistered = null;
		degreeProgram = null;
		yearInProgram = null;
		GPA = null;
		totalCredits = null;
	}
	
	/**
	 * Retrieves the year the undergrad student registered.
	 * @return the year the undergrad student registered
	 */
	public String getYearRegistered()
	{
		return yearRegistered;
	}
	
	/**
	 * Retrieves the degree of the program that the undergrad student is in.
	 * @return the degree of the program that the undergrad student is in
	 */
	public String getDegreeProgram()
	{
		return degreeProgram;
	}
	
	/**
	 * Retrieves the year that the undergrad student is in the program.
	 * @return the year that the undergrad student is in the program
	 */
	public String getYearInProgram()
	{
		return yearInProgram;
	}
	
	/**
	 * Retrieves the GPA of the undergrad student.
	 * @return the GPA of the undergrad student
	 */
	public String getGPA()
	{
		return GPA;
	}
	
	/**
	 * Retrieves the total credits completed by the undergrad student.
	 * @return the total credits completed by the undergrad student
	 */
	public String getTotalCredits()
	{
		return totalCredits;
	}
	
	/**
	 * Sets the year the undergrad student registered.
	 * @param year the year the undergrad student registered
	 */
	public void setYearRegistered(String year)
	{
		yearRegistered = year;
	}
	
	/**
	 * Sets the degree of the program that the undergrad student is in.
	 * @param degree the degree of the program that the undergrad student is in
	 */
	public void setDegreeProgram(String degree)
	{
		degreeProgram = degree;
	}
	
	/**
	 * Sets the year that the undergrad student is in the program.
	 * @param years the year that the undergrad student is in the program
	 */
	public void setYearInProgram(String years)
	{
		yearInProgram = years;
	}
	
	/**
	 * Sets the GPA of the undergrad student.
	 * @param marks the GPA of the undergrad student
	 */
	public void setGPA(String marks)
	{
		GPA = marks;
	}
	
	/**
	 * Sets the total credits completed by the undergrad student
	 * @param credits the total credits completed by the undergrad student
	 */
	public void setTotalCredits(String credits)
	{
		totalCredits = credits;
	}

	/**
	 * Testing the setters and getters of the UndergradStudent class.
	 */
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
