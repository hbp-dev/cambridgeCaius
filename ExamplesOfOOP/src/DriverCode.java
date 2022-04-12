
public class DriverCode 
{

	public static void main(String[] args) 
	{
		Barracuda myBarracuda;
		myBarracuda = new Barracuda();
		GoldFish myGoldFish;
		myGoldFish = new GoldFish();
		System.out.println("One type of fish is the " + myGoldFish.name);
		System.out.println("It reproduces via " + myGoldFish.reproduction);
		System.out.println("It is covered in " + myGoldFish.skin);
		System.out.println("Unlike another type of fish, known as a " + myBarracuda.name + ", a " + myGoldFish.name + " is " + myGoldFish.size + " meters long while the prior is " + myBarracuda.size);
		System.out.println("Both fishes are capable of:");
		myGoldFish.swimUpStream();
		System.out.println("and");
		myGoldFish.swimDownStream();
	}

}
