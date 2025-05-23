package listPractice;

import java.util.*;

public class arrayList {

	public static void main(String[] args) {

		List<Integer> l1 = new ArrayList<>();

		l1.add(0, 1);
		l1.add(1, 3);
		l1.add(2, 2);
		List<Integer> l3=List.copyOf(l1);
		System.out.println(l3);
		System.out.println("-before sort--------------");
		System.out.println(l1);
		System.out.println("---------------");
		Collections.sort(l1);
		System.out.println("-after sort--------------");
		System.out.println(l1);
		System.out.println("---------------");
		System.out.println("-reverse sort--------------");
		Collections.reverse(l1);
		System.out.println(l1);
		System.out.println("---------------");

		List<Integer> l2 = new ArrayList<>();
		l2.add(5);
		l2.add(4);
		l1.addAll(2, l2);
		System.out.println("-after addAll--------------");
		System.out.println(l1);
		System.out.println("---------------");

		l1.remove(Integer.valueOf(2));
		System.out.println("-after remove 4--------------");
		System.out.println(l1);
		System.out.println("---------------");
		l1.add(3);
		l1.set(3, 3);
		System.out.println("-after replacing element at 3rd position--------------");
		System.out.println(l1);
		System.out.println("---------------");
		System.out.println("Index of---------------" + l1.indexOf(5));
		System.out.println("last indexof---------------" + l1.lastIndexOf(3));
		System.out.println("get value of 4th index---------------" + l1.get(4));
		System.out.println("Is empty before clear---------------" + l1.isEmpty());
		System.out.println(" clear---------------");
		l1.clear();
		System.out.println("Is empty after clear---------------" + l1.isEmpty());

	}

}
