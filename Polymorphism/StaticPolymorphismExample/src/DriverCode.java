
public class DriverCode {

	public static void main(String[] args) 
	{
		Building myBuilding;
		myBuilding = new Building();
		
		myBuilding.collapse();
		myBuilding.collapse("right now");
		myBuilding.collapse("Empire State", "right now");
		
	}
}
