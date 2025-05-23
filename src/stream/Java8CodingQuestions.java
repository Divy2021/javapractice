package stream;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Java8CodingQuestions {

	public static void main(String[] args) {

		
		List<Integer> li=Arrays.asList(1,2,3,4,5,6,7,8,9,10,15,10,15);
		System.out.println("1 Separate odd  and even");
		
		Map<Boolean, List<Integer>> collect = li.stream().collect(Collectors.groupingBy(x->x%2==0));
		
		collect.forEach((x,y)->System.out.println("x :"+x+" y :"+y));
		System.out.println("----------------------------------------------------------------------");
		String s="laya";
		System.out.println("2 frequency of each character in a string :"+s);
		
		Map<Character, Long> collect2 = s.chars().mapToObj(x->(char)x).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		collect2.forEach((t, u) -> System.out.println("character :"+t+" count :"+u));
		System.out.println("----------------------------------------------------------------------");
		System.out.println("3 sort the list in reverse order :"+li);
		li.stream().sorted(Comparator.reverseOrder()).forEach(x->System.out.print(x+" "));
		
		System.out.println();
		System.out.println("----------------------------------------------------------------------");
		System.out.println("4 print multiples of 5 in a list :"+li);
		
		li.stream().filter(x->x%5==0).forEach(x->System.out.print(x+" "));
		
		System.out.println();
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println("5 Merge 2 unsorted araays into one sorted array");
		
		int a[]= {1,2,7,5},b[]= {3,8,4,6};
		int[] array = IntStream.concat(Arrays.stream(a),  Arrays.stream(b)).sorted().distinct().toArray();
		System.out.println(" merged :"+Arrays.toString(a)+" :"+Arrays.toString(b)+" into one array"+Arrays.toString(array));
		
		System.out.println("-------------------------------------------------------------------------------------");
		
        System.out.println("6 Three max and min elements from a list :" +li);
        System.out.println("min 3 elements");
		
		li.stream().sorted().limit(3).forEach(x->System.out.print(x+" "));System.out.println();
		System.out.println("max 3 elements");
		li.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(x->System.out.print(x+" "));
		System.out.println();
		
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println("7 List of strings in increasing order of their length" );
		List<String> strings=Arrays.asList("java","jack","hibernate","jpa","azure");
				//("Laya","Divya","saravana Prabhu");
		
		strings.stream().sorted(Comparator.comparing(String::length).thenComparing(x->x.charAt(2))).forEach(x->System.out.print(x+": "));
		//strings.stream().sorted(Comparator.comparing(x->x.charAt(2))).forEach(x->System.out.print(x+": "));
		System.out.println("-------------------------------------------------------------------------------------");
        System.out.println("8 Sum and average of an array :" );
		int intarray[]= {1,2,7,5,3,8,4,6,4,6};
		int sum = Arrays.stream(intarray).sum();
		OptionalDouble average = Arrays.stream(intarray).average();
		System.out.println("sum of elements :"+sum+" average :"+average);
		System.out.println("-------------------------------------------------------------------------------------");
		
		System.out.println("9 Reverse an integer array");
		int[] array2 = IntStream.rangeClosed(1, intarray.length).map(i->intarray[intarray.length-i]).toArray();
		System.out.println(Arrays.toString(array2));
		
		System.out.println("-------------------------------------------------------------------------------------");
		String palin="rotator";
		boolean boole=IntStream.range(0,palin.length()/2).noneMatch(i->palin.charAt(i)!=palin.charAt(palin.length()-i-1));
		System.out.println(palin+" is palindrome :"+boole);
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println("10 last element of an array");
		String lastelemt = strings.stream().skip(strings.size()-1).findFirst().get();
		//strings.stream().sorted().findFirst().get();
		System.out.println(strings.stream().sorted(Comparator.reverseOrder()).findFirst().get());
		System.out.println(lastelemt);
		
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println("11 Age of a person in years :"+strings.get(1));
		LocalDate birthday=LocalDate.of(1991,8, 17);
		LocalDate today=LocalDate.now();
		System.out.println(ChronoUnit.YEARS.between(birthday, today));
		
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println("12 Remove duplicates in a array :"+li);//+Arrays.toString(intarray) );
		List<Integer> collect3 = li.stream().distinct().collect(Collectors.toList());
		System.out.println("Unique list :"+collect3);
		
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println("13 frequency of a element in a  list"+li);
		Map<Integer, Long> collect4 = li.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(collect4);
		
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println("14 joining strings with prefix suffix and delimiter :"+strings);
		String joinedString=strings.stream().collect(Collectors.joining("->","(",")"));
		System.out.println(joinedString);
		
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println("15 maximum and minimum in a list :"+li);
		Integer integer = li.stream().max(Comparator.naturalOrder()).get();
		Integer integer2 = li.stream().min(Comparator.naturalOrder()).get();
		System.out.println(" max and min +:"+integer+ " and : "+integer2);
		
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println("16 anagram program in Java");
		String s1="ate",s2="eat";
		String s4 = Stream.of(s1.split("")).map(x->x.toUpperCase()).sorted().collect(Collectors.joining());
		String s5 = Stream.of(s2.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
		
		System.out.println(" anagram or not :"+s4.equals(s5));
		
		System.out.println("-------------------------------------------------------------------------------------");
		int i=5345;
		System.out.println("17 sum of all digits in a number :"+i);
		
		Integer summation = Stream.of(String.valueOf(i).split("")).collect(Collectors.summingInt(Integer::parseInt));
		System.out.println(" number +:"+i+ " sum of digit : "+summation);
		
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println("18 second largest in a list :"+li);
		
		Integer sec = li.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		System.out.println(" list +:"+li+ " second largest : "+sec);
		
		System.out.println("-------------------------------------------------------------------------------------");
		List<Integer> li2=Arrays.asList(1,2,3,4,88);
		System.out.println("19 common element between two list :");
		
        List<Integer> l2=li.stream().filter(li2::contains).collect(Collectors.toList());
		System.out.println(" common elements  between+:"+li+ " and : "+li2+" is :"+l2);
		
		
		System.out.println("-------------------------------------------------------------------------------------");
		String reve="hi have a nice day";
		System.out.println("20 Reverse each words of a string:");
        String stringlist = Arrays.stream(reve.split(" ")).map(word->new StringBuffer(word).reverse()).collect(Collectors.joining(" "));//toList();
		System.out.println(" reverse words of+:"+reve+ " is : "+stringlist);
		

		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println("21 sum of first 10 numbers :");
		Integer natural10 = IntStream.range(1, 20).sum();//.stream().sorted(Comparator.reverseOrder()).skip(2).findFirst().get();
		System.out.println(" is :"+natural10);
		
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println("22 find a string starts with number of first 10 numbers :");
		String[] digit={"1second","2second","third"};
		List<String> digitstring = Arrays.stream(digit).filter(x->Character.isDigit(x.charAt(0))).collect(Collectors.toList());
		System.out.println(" is :"+digitstring);
		
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println("23 find duplicate numbers in a list :"+li);
		Set<Integer> set= new HashSet<>();
				Set<Integer> set2 = li.stream().filter(x->!set.add(x)).collect(Collectors.toSet());
	//	List<String> digitstring = Arrays.stream(digit).filter(x->Character.isDigit(x.charAt(0))).collect(Collectors.toList());
		System.out.println(" is :"+set2);
		

		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println("24 fibinaci series :");//0,1,1,2,3,5,8,13
		//List<Integer> list = 
				Stream.iterate(new int[] {0,1}, f->new int[] {f[1],f[0]+f[1]}).
				       limit(10).
				       map(f->f[0]).
				       forEach(System.out::println);
		System.out.println(" is :");
		
		
		
	}

}
