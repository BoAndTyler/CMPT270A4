package systemEntities;

/**
 * The fields of the thesis and the respective setters and getters to access them.
 * @author Bo Dong and Tyler Spink
 */
public class Thesis 
{
	/**
	 * The title of the thesis.
	 */
	private String title;
	
	/**
	 * The area of the thesis.
	 */
	private String area;

	/**
	 * Constructor for thesis.
	 */
	public Thesis() 
	{
		title = null;
		area = null;
	}
	
	/**
	 * Retrieves the title of the thesis.
	 * @return the title of the thesis.
	 */
	public String getTitle()
	{
		return title;
	}
	
	/**
	 * Retrieves the area of the thesis.
	 * @return the area of the thesis.
	 */
	public String getArea()
	{
		return area;
	}
	
	/**
	 * Sets the title of the thesis.
	 * @param newTitle the title of the thesis
	 */
	public void setTitle(String newTitle)
	{
		title = newTitle;
	}
	
	/**
	 * Sets the area of the thesis.
	 * @param newArea the area of the thesis
	 */
	public void setArea(String newArea)
	{
		area = newArea;
	}

	/**
	 * Testing the setters and getters of the Thesis class.
	 */
	public static void main(String[] args) 
	{
		Thesis newThesis = new Thesis();
		
		newThesis.setTitle("Thesis Title");
		if(!newThesis.getTitle().equals("Thesis Title"))
		{
			System.out.println("Failed to set the thesis title.");
		}
		
		newThesis.setArea("Field of study");
		if(!newThesis.getArea().equals("Field of study"))
		{
			System.out.println("Failed to set the thesis field of study.");
		}
	}
}
