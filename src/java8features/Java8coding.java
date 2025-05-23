package java8features;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.function.Function;
import java.util.stream.*;

public class Java8coding {

	public static void main(String[] args) {
		// Odd or even numbers;

		List<Integer> li = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4);
		
		int[]a= {1,2,3,7,8,9,4,5};
		//ClassA 
		//Arrays.stream(a).mapto
		//IntStream.of(a).sorted().
		List<Integer> collect3 = Arrays.stream(a).sorted().boxed().skip(5).collect(Collectors.toList());
		System.out.println(collect3);
		//Map<Boolean, List<Integer>> hm = //
				Map<Boolean, List<Integer>> hm = li.stream().collect(Collectors.partitioningBy(x -> x % 2 == 0));
		System.out.println(hm);
		// Remove duplicates from list
		List<Integer> disli = li.stream().distinct().toList();
		System.err.println("distinct list " + disli);
		// frequency of each character in a string
		String s = "javaConcept";
		Map<Character, Long> charCountMap = s.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println("character count in a string :" + charCountMap);
		
		
		//sort list of strings based on 3rd character
		List<String> lis=Arrays.asList("Monday","Tuesday","Wednesday","Thursday");
		List<String> sortli = lis.stream().sorted(Comparator.comparing(x->(x.charAt(2)))).collect(Collectors.toList());
		System.out.println(sortli);
		//forEach(System.out::println);	
		
		//List<Integer> li=Arrays.asList(1,2,3,4,5,6,7,8,9,10,15,10,15);
		System.out.println("1 Separate odd  and even");
		
		Map<Boolean, List<Integer>> collect = li.stream().collect(Collectors.partitioningBy(x->x%2==0));
		collect.forEach((x,y)->System.out.println("x :"+x+" y: "+y));
		System.out.println("----------------------------------------------------------------------");
	//	String s="laya";
                 System.out.println("2 frequency of each character in a string :"+s);
		
		Map<Character, Long> collect2 = s.chars().mapToObj(x->(char)x).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		//collect2.forEach((x,y)->System.out.print("Character :"+x+" count:"+y+" "));
		System.out.println(collect2);
		System.out.println("----------------------------------------------------------------------");

	}

}
