package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumsStartingWith1 {

	public static void main(String[] args) {
		// Boxed and map methods in Stream used
		// numbers starting with 1
		List<Integer> list=Arrays.asList(1,22,23,24,5,12,13,14);
		
		list.stream().map(s->s+"") // convert Integer to String
		             .filter(x->x.startsWith("1"))
		             .forEach(System.out::println);	
		
		// numbers starting with 2
		int[] arr= {1,22,23,24,5,12,13,14};
		List<String> li= Arrays.stream(arr).boxed().map(s->s+"").filter(x->x.startsWith("2")).collect(Collectors.toList());
		System.out.println(li);
	}
}
