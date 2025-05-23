package hashMapPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class hashMapPractice {

	public static void main(String[] args) {

		String s = "abc";
		String o = s.substring(0, 2) + s.substring(1);
		System.out.println(o);
		
		//sort hashmap
		Map<String, Integer> hm = new HashMap<>();

		hm.put("Apple", 10);
		hm.put("orange", 3);
		hm.put("banana", 10);
		hm.put("pear", 4);
		// hashmAp to arrayList conversion usage of hm.keyset() hm.values()
		// hm.entryset() functions
		System.out.println(hm);
		Set<String> set = new HashSet<>(hm.keySet());
		System.out.println(set);
		List<Integer> li = new ArrayList<>(hm.values());
		System.out.println(li);
		Set<Entry<String, Integer>> eset = hm.entrySet();
		ArrayList<Entry<String, Integer>> ali = new ArrayList<Entry<String, Integer>>(hm.entrySet());
		for (Map.Entry<String, Integer> e : eset)// (Entry<String,Integer> e:ali)
		{
			System.out.println("key :" + e.getKey() + " value :" + e.getValue());
		}

		for (Entry<String, Integer> e : ali) {
			System.out.println("key :" + e.getKey() + " value :" + e.getValue());
		}

		// sort elements in a map
		List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String, Integer>>(hm.entrySet());
		System.out.println(list);
		Collections.sort(list, (i1, i2) -> i1.getValue().compareTo(i2.getValue()));
		// Map<String,Integer> hm=Stream(list).

		// remove duplicate values from map
		System.out.println(list);

		Set<Integer> existing = new HashSet();
		int i=0;
		List<Integer> li3=Arrays.asList(1,2,3,4,5,3,4,5);
		li3.stream().filter(x->!existing.add(x)).forEach(System.out::println);

		hm = hm.entrySet().stream().filter(x -> existing.add(x.getValue()))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

		System.out.println(hm);
	}
}
