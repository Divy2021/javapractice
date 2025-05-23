package java12features;

public class StringFeaturesUnicode {

	public static void main(String[] args) {

		
		String s="  All the power is within you";
		System.out.println(" before indent :"+s);
		s.indent(6);
		
		System.out.println(" after indent :"+s.indent(-3));
		
		String s1="10";
		
		Integer transform = s1.transform(Integer::parseInt);
		
		System.out.println(transform);
		
		//unicode characters chess characters added
		
				System.out.println("\u265A");
				System.out.println("\u265B");
				System.out.println("\u2654");
				System.out.println("\u2655");
				
	}

}
