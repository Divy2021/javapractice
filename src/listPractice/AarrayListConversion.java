package listPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AarrayListConversion {

	public static void main(String[] args) {
		// Array to ArrayList converison
		Integer[] ar = { 1, 2, 3, 4, 5, 6 };
		List<Integer> al = Arrays.asList(ar);

		for (int i = 0; i < al.size(); i++) {
			System.out.print(al.get(i));
		}
		// for(int i: al)
		// al.forEach(System.out::println);

		// String array conversion
		String[] s1 = { "divya", "prabu", "laya" };
		List<String> sl = Arrays.asList(s1);
		System.out.println(sl);

		// ArrayList to Array conversion

		List<Integer> arli = new ArrayList<Integer>();

		arli.add(1);
		arli.add(2);
		arli.add(3);
		arli.add(4);

		int[] arr = arli.stream().mapToInt(i -> i).toArray();

		for (int i : arr)
			System.out.println(i);
	}
}
