
public class Building 
{
	public void collapse()
	{
		System.out.println("Oh No! The building is collapsing!");
	}
	
	public void collapse(String time)
	{
		System.out.println("Oh No! The building is collapsing " + time + "!");
	}
	
	public void collapse(String name, String time)
	{
		System.out.println("Oh no! The " + name + " building is collapsing " + time  + "!");
	}
}
