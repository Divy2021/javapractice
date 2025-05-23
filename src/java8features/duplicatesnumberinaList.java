package java8features;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class duplicatesnumberinaList {

	public static void main(String[] args) {

		// method 1
		List<Integer> list = Arrays.asList(4, 5, 6, 7, 7, 1, 2, 3, 4);//

		Set<Integer> set = new HashSet<>();
//		System.out.println(set);
		System.out.println("duplicate elements:");
		list.stream().filter(x -> !set.add(x)).forEach(System.out::println);

		// method 2

		List<Integer> myList = Arrays.asList(1, 2, 3, 4, 4, 5, 6, 7, 7);
		System.out.println("unique elements:");
		myList.stream().distinct().forEach(x -> System.out.println(x + " "));
		// method 3
		List<Integer> list3 = Arrays.asList(4, 5, 6, 7, 7, 1, 2, 3, 4);//
		System.out.println("before sorting elements:");
		list3.stream().forEach(System.out::print);

//		Set<Integer> set1 = new HashSet<>(list3);
//
//		List<Integer> list4 = set1.stream().collect(Collectors.toList());
//		System.out.println(list4);// (x->!set.add(x)).forEach(System.out::println);
		System.out.println("after sorting elements:");
		list3.stream().sorted().forEach(System.out::print);

	}

}
