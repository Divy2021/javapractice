package Exception;

public class ExceptionTest {

	public static void main(String[] args)  {
		
		
  try {
	System.out.println(calculate(11));
//	throw new UserException("Test exception");
} catch (UserException e) {
	System.out.println(e.getMessage());
	//e.printStackTrace();
}
  
  System.out.println("exception: rest of the code");
	}
	
	public  static String calculate(int i) throws UserException
	{
		
		String s;
		if(i >10)
		{
			throw new UserException("User exception called");
		//
		}
		else
			s="less than 10";
		
		return s;
	}
	

}
