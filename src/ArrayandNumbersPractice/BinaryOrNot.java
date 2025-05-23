package ArrayandNumbersPractice;

public class BinaryOrNot {

	public static void main(String[] args) {
		//https://javaconceptoftheday.com/java-program-check-whether-given-number-binary-or-not/
		int num = 11011;
		Boolean b = true;// new Boolean();
		while(num>0)
		{
			if(num%10==0 || num%10==1)
			{

				num=num/10;
				continue;
			
			}
				
			else
			{
				System.out.print("not a binary number");
				b=false;
				break;
			}
			
		}
		if(b)
		System.out.println("Binary number");

	}

}
