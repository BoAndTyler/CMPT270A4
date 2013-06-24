package systemEntities;

/**
 * The extended fields of the graduate student and the respective setters and getters to access them.
 * @author Bo Dong and Tyler Spink
 */
public class GraduateStudent extends UndergradStudent 
{
	/**
	 * The name of the graduate student's supervisor.
	 */
	private String thesisSupervisor;
	
	/**
	 * The thesis that the graduate student is doing.
	 */
	private Thesis thesis;
	
	/**
	 * The amount of scholarship money earned by the graduate student.
	 */
	private String scholarShipAmount;
	
	/**
	 * The type of degree that the graduate student is taking.
	 */
	private String degreeType;
	
	/**
	 * The constructor for the graduate student.
	 */
	public GraduateStudent() 
	{
		super();
		thesisSupervisor = null;
		thesis = new Thesis();
		scholarShipAmount = null;
		degreeType = null;
	}
	
	/**
	 * Retrieves the graduate student's thesis supervisor's name.
	 * @return the graduate student's thesis supervisor's name.
	 */
	public String getThesisSupervisor()
	{
		return thesisSupervisor;
	}
	
	/**
	 * Retrieves the graduate student's thesis title and area.
	 * @return the graduate student's thesis title and area.
	 */
	public String getThesis()
	{
		return thesis.getTitle() + "\n" + thesis.getArea();
	}
	/**
	 * Retrieves the graduate student's thesis title.
	 * @return the graduate student's thesis title.
	 */
	public String getThesisTitle(){
		return thesis.getTitle();
	}
	
	/**
	 * Retrieves the graduate student's thesis area.
	 * @return the graduate student's thesis area.
	 */
	public String getThesisArea(){
		return thesis.getArea();
	}
	
	/**
	 * Retrieves the graduate student's scholarship amount.
	 * @return the graduate student's scholarship amount.
	 */
	public String getScholarShipAmount()
	{
		return scholarShipAmount;
	}
	
	/**
	 * Retrieves the graduate student's degree type.
	 * @return the graduate student's degree type.
	 */
	public String getDegreeType()
	{
		return degreeType;
	}
	
	/**
	 * Sets the name of the graduate student's supervisor.
	 * @param supervisor name of the supervisor
	 */
	public void setThesisSupervisor(String supervisor)
	{
		thesisSupervisor = supervisor;
	}
	
	/**
	 * Sets the information for the graduate student's thesis.
	 * @param newTitle the title of the thesis
	 * @param newArea the area of the thesis
	 */
	public void setThesis(String newTitle, String newArea)
	{
		thesis.setTitle(newTitle);
		thesis.setArea(newArea);
	}
	
	/**
	 * Sets the title of the thesis for graduate student.
	 * @param newTitle the title of the thesis
	 */
	public void setThesisTitle(String newTitle)
	{
		thesis.setTitle(newTitle);
	}
	
	/**
	 * Sets the thesis area for the graduate student.
	 * @param newArea the area of the thesis
	 */
	public void setThesisArea(String newArea)
	{
		thesis.setArea(newArea);
	}
	
	/**
	 * Sets the scholarship amount earned by the graduate student.
	 * @param amount the amount of scholarship money earned
	 */
	public void setScholarShipAmount(String amount)
	{
		scholarShipAmount = amount;
	}
	
	/**
	 * Sets the type of degree that the graduate student is taking.
	 * @param degree the name of degree being taken
	 */
	public void setDegreeType(String degree)
	{
		degreeType = degree;
	}

	/**
	 * Testing the setters and getters of the GraduateStudent class.
	 */
	public static void main(String[] args) 
	{
		GraduateStudent newGradStudent = new GraduateStudent();
		
		newGradStudent.setThesisSupervisor("Jane Smith");
		if(!newGradStudent.getThesisSupervisor().equals("Jane Smith"))
		{
			System.out.println("Failed to set the grad student's thesis supervisor.");
		}
		
		newGradStudent.setThesis("Thesis Title", "Field of study");
		if(!newGradStudent.getThesis().equals("Thesis Title\nField of study"))
		{
			System.out.println("Failed to set the thesis title.");
		}
		
		newGradStudent.setScholarShipAmount("1000");
		if(!newGradStudent.getScholarShipAmount().equals("1000"))
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
