package demo;

public class TestClass {

	public static void main(String[] args) {

		
		String s="divya@789capgemini@456";
		s.chars().mapToObj(x->(char)x).filter(x->!Character.isDigit(x) && Character.isAlphabetic(x)).forEach(System.out::print);
		
		int[] a= {7,8,-6,-4,-6,-8,2,3};
		
		int count=0,sum=0;
		for(int i:a)
		{
			if(i>0)
			{
				count++;
				sum+=i;
			}
			
		}
		float result=sum/count;
		System.out.println("  result :"+result);
		
	}

}
