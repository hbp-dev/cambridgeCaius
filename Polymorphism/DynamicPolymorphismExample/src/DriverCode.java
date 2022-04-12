
public class DriverCode 
{

	public static void main(String[] args)
	{
		ErrorCode myErrorCode;
		myErrorCode = new ErrorCode();
		
		myErrorCode.printError();
		
		SpecialisedErrorCode mySpecialisedErrorCode;
		mySpecialisedErrorCode = new SpecialisedErrorCode();
		mySpecialisedErrorCode.printError();
		
	}

}
