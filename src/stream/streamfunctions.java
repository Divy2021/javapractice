package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class streamfunctions {

	public static void main(String[] args) {
		List<Integer> list3 = Arrays.asList(1, 2, 3, 4, 4, 5, 6, 7, 7);//
		System.out.println("actual list " + list3);
		// how to remove duplicates
		Set<Integer> set1 = new HashSet<>(list3);

		List<Integer> list4 = set1.stream().collect(Collectors.toList());
		System.out.println("post removing duplicates " + list4);// (x->!set.add(x)).forEach(System.out::println);

		// find the first element of a list
		System.out.println("first element in a list");
		list4.stream().findFirst().ifPresent(x -> System.out.println(x));

		// find the number of elements of a list #count
		System.out.println("element count in a list");
		Long count = list4.stream().count();
		System.out.println(count);

		// find the maximum element in a list #
		System.out.println("max element in a list");
		int max = list4.stream().max(Comparator.naturalOrder()).get();
				 //list4.stream().max(Comparator.naturalOrder()).get();
		System.out.println("method1 " + list4.stream().max(Integer::compare).get());
		System.out.println("method2 " + max);
	}
}