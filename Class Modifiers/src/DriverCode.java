
import Protected.*;

public class DriverCode extends Subtraction
{

	public static void main(String[] args) 
	{
		// Final
		FinalModifiers myFinal;
		myFinal = new FinalModifiers();
		myFinal.x = 1; // Should generate error
		myFinal.y = 2; // Should generate error
		myFinal.z = "George"; // Should generate error
		System.out.println(myFinal.x);
		System.out.println(myFinal.y);
		System.out.println(myFinal.z);
		
		// Static
		StaticModifiers.myStaticMethod(); // This calls the static method and does not create an object
		
		StaticModifiers myStatic;
		myStatic = new StaticModifiers();
		myStatic.myPublicMethod();
		
		// Abstract
		AbstractSubClass myWorker;
		myWorker = new AbstractSubClass();
		
		System.out.println("Name: " + myWorker.name);
		System.out.println("Age: " + myWorker.age);
		System.out.println("Years of experience: " + myWorker.yearsOnJob);
		myWorker.walk(); // Calling abstract class
		
		// Protected
		DriverCode Subtract;
		Subtract = new DriverCode();
		System.out.println(Subtract.subtractTwoNumbers(33, 11));
		
		
	}
}
