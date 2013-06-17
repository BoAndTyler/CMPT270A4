package systemEntities;

public class Thesis 
{
	private String title;
	private String area;

	public Thesis() 
	{
		title = null;
		area = null;
	}
	
	public String getTitle()
	{
		return title;
	}
	
	public String getArea()
	{
		return area;
	}
	
	public void setTitle(String newTitle)
	{
		title = newTitle;
	}
	
	public void setArea(String newArea)
	{
		area = newArea;
	}

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
