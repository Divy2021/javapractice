package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapPractice {

	public static void main(String[] args) {

		List<String> li1=Arrays.asList("A","B","C");
		List<String> li2=Arrays.asList("D","E","F");
		List<String> li3=Arrays.asList("G","H","I");
		
		List<List<String>> liofli=Arrays.asList(li1,li2,li3);
		
		List<String> flatmap=liofli.stream().flatMap(list->list.stream()).collect(Collectors.toList());
		
		System.out.println(flatmap);
		
		List<String> list=Arrays.asList("divya","laya","prabu");
		list.stream().flatMap(str->Stream.of(str.charAt(0))).forEach(System.out::println);
		
		
	}

}
