
public class StaticModifiers {

	static void myStaticMethod()
	{
		System.out.println("This method was called without creating a new object");
	}
	
	public void myPublicMethod()
	{
		System.out.println("This method was called by creating an object");
	}
}
