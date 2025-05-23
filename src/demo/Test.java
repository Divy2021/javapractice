package demo;

public class Test {

	public static void main(String[] args) {

		
	
		
		//1. int Add(string numbers)
		//The method can take up to two numbers, separated by commas, and will return their sum. 
		//for example “” or “1” or “1,2” as inputs.
		//(for an empty string it will return 0)
		
		String str="1\n2,3";
		
		//int sum2 = str.chars().filter(x->(Character.isDigit(x))).sum();
		//System.out.println(sum2);
		
		int i=0,sum=0;
		char prev=' ';
		
		while(i<str.length())
		{
			char c=str.charAt(i);
			String temp="";
			
			
			if(Character.isDigit(c) )
			{
				temp+=c;
				sum+=Integer.parseInt(temp);
				i++;
			}
			else if( str.charAt(i)==',')
			{
				i++;
				prev=',';
			}
			else if(prev==',')
			{
				System.out.println("Invalid character");
				break;
			}
				
				
			
		}
		
		System.out.println(sum);
		
//		2. Allow the Add method to handle an unknown amount of numbers
//		Allow the Add method to handle new lines between numbers (instead of commas).
//		the following input is ok: “1\n2,3” (will equal 6)
//		the following input is NOT ok: “1,\n” (not need to prove it - just clarifying)
	}

}
