package hashMapPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class HashMapSort {

	public static void main(String[] args) {
		Map<String, Integer> hm = new HashMap<>();
		hm.put("Apple", 10);
		hm.put("orange", 3);
		hm.put("banana", 10);
		hm.put("pear", 4);

		System.out.println("Map :" + hm);

		// sort elements in a map based on value
		List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String, Integer>>(hm.entrySet());
		System.out.println("List of map entries :" + list);
		Collections.sort(list, (i1, i2) -> i1.getValue().compareTo(i2.getValue()));
		System.out.println("Sorted based on Map Values :" + list);
		// Sort map based on map keys

		Collections.sort(list, (i1, i2) -> i1.getKey().compareTo(i2.getKey()));

		System.out.println("Sorted based on Map keys :" + list);
		
		// remove duplicate values from map

		Set<Integer> existing = new HashSet<>();

		hm = hm.entrySet().stream().filter(x -> existing.add(x.getValue()))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

		System.out.println(hm);
		
		Person p1=new Person("laya", 1);
		Person p2=new Person("prabu", 39);
		Person p3=new Person("divya",34);
		
		List<Person> pl=new ArrayList<>();
		pl.add(p3);
		pl.add(p2);
		pl.add(p1);
		
		System.out.println(pl);
		int[] l= {1,2,3,4};
		System.out.println(Arrays.toString(l));
		
		//pl.stream().forEach(x->System.out.println("name:"+x.getName()+" age"+x.getAge()));
		//pl.stream().sorted(Comparator.comparingInt(Person::getAge)).forEach(x->System.out.println("name:"+x.getName()+" age"+x.getAge()));//(x1,x2)->x1.getAge().compareTo(x2.getAge()));;
		Collections.sort(pl,(x1,x2)->x2.getAge().compareTo(x1.getAge()));
		
		pl.stream().forEach(x->System.out.println("name:"+x.getName()+" age-"+x.getAge()));
		List<Person> collect = pl.stream().sorted(Comparator.comparing(Person::getAge)).collect(Collectors.toList());//forEach(x->System.out.println("name :"+x.getName()+ " sort age :"+x.getAge()));
		//System.out.println(collect.stream().);
		collect.forEach(System.out::println);
		pl.stream().sorted(Comparator.comparing(Person::getName))
		            .forEach(x->System.out.println("sort name: "+x.getName()+" age: "+x.getAge()));//(x1,x2)->x1.getAge().compareTo(x2.getAge()));;
		pl.stream().sorted(Comparator.comparing(Person::getName).reversed()).forEach(x->System.out.println("rev name:"+x.getName()+" age : "+x.getAge()));
		//pl.stream().filter(x->x.getAge()>0).
		
		
	}

}
