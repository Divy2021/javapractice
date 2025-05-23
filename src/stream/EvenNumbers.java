package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
//import java.util.stream.Collector;
import java.util.stream.Collectors;

public class EvenNumbers {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		list.stream().filter(x -> x % 2 == 0).forEach(System.out::println);
		List<Integer> nums1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
		Map<Boolean,List<Integer>> evenodd=nums1.stream().collect(Collectors.partitioningBy(x->x%2==0));
		
		//Map<Boolean, List<Integer>> evenornot = nums1.stream().collect(Collectors.partitioningBy(num -> num % 2 == 0));
		System.out.println(evenodd);
		int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
		Map<Boolean, List<Integer>> mapEvenorNot = Arrays.stream(nums).boxed()
				.collect(Collectors.partitioningBy(num -> num % 2 == 0));
		System.out.println(mapEvenorNot);
	}
}
