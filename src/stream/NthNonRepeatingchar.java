package stream;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NthNonRepeatingchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st = "layas";

		Character result = st.chars() // Stream of String
				.mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s))) // First convert to Character object
																					// and then to lowercase
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())) // Store
																												// the
																												// chars
																												// in
																												// map
																												// with
																												// count
				.entrySet().stream().filter(x -> x.getValue() == 1L).map(x -> x.getKey()).findFirst().get();
		System.out.println("first non-repeating character " + result);

		// find the second non-repeating character

		Character second = st.chars().mapToObj(s->Character.toLowerCase(Character.valueOf((char) s))).
				collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())).
				entrySet().stream().filter(x->x.getValue()==1L).map(x->x.getKey()).skip(1).findFirst().get();
		System.out.println("second non-repeating character " + second);
	}

}
