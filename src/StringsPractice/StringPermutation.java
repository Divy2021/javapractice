package StringsPractice;

import java.util.LinkedList;
import java.util.List;

public class StringPermutation {

	public static void main(String[] args) {
		String s = "abc";// abc,bac,cab acb,bca,cba
		List<String> set = new LinkedList<>();
		List<String> l = permutation("", s, set);
		System.out.println(l + "list size" + l.size());
		System.out.println("list size :" + l.size());
	}

	public static List<String> permutation(String permutation, String input, List<String> l) {
		System.out.println(permutation+" "+input);
		if (input.length() == 0) {
			l.add(permutation);
			System.out.println(l);
		} else {
			for (int i = 0; i < input.length(); i++) {
				permutation(permutation + input.charAt(i),
						input.substring(0, i) + input.substring(i + 1, input.length()), l);
			}
		}
		return l;
	}

}
