package StringsPractice;

import java.util.HashMap;

public class StringOperations {

	public static void main(String[] args) {
		// reverse words in a string
		String st = new String("JAVA");
		String s5 = "JAVA";
		String s6 = "JAVA";
		System.out.println(st.equals(s5));
		System.out.println(st == s5);
		System.out.println(s6 == s5);
		StringBuilder sb = new StringBuilder();
		sb.append("JA").append("VA");
		System.out.println((sb.toString() == s5) + "Stringbuilder verses string literal :");
		System.out.println(sb.toString() == s5);
		System.out.println(sb.toString().equals(s5) + " readme");

		System.out.println(sb.toString());// ==s5);

		// System.out.println(st); // Output : JAVA

		String s3 = st.concat("J2EE");
		System.out.println(st);
		System.out.println(s3);
		String s1 = "Java is a programming language";

		String[] s2 = s1.split(" ");// s2[0]
		StringBuffer result = new StringBuffer();

		int i = 0;
		while (i < s2.length) {
			StringBuffer op = new StringBuffer(s2[i]);
			op.reverse();
			result = result.append(op + " ");
			i++;
		}
		// op.reverse();

		System.out.println(result);

		// reverse words in a string

		// replace spaces in a string

		String rep = "Java is a programming language";
		System.out.println("Before replacing spaces :" + rep);

		String o = rep.replaceAll(" ", "");
		System.out.println("After replacing spaces :" + o);

		char[] ca = rep.toCharArray();
		String no = "";
		for (char c : ca) {
			if (c != ' ')
				no = no + c;
		}
		System.out.println("After replacing spaces :" + no);

		// duplicate characters count in a string
		String dup = "Better butter";

		System.out.println("string with duplicate letters :" + dup);
		HashMap<Character, Integer> hm = new HashMap<>();

		char[] dis = dup.toCharArray();

		for (char c : dis) {
			// hm.put(c,hm.getOrDefault(c, 1));

			if (!hm.containsKey(c))
				hm.put(c, 1);
			else
				hm.put(c, hm.get(c) + 1);// hm.put(c, hm.getOrDefault(c, 1)+1);
		}
		System.out.println("dup count:" + hm);
		for (char c : dis) {

			if (hm.get(c) == 1)
				hm.remove(c);

		}
		System.out.println("dup count:" + hm);

		// duplicate characters count in a string

		// String is a anagram or not

		String a1 = "dirty room";
		String a2 = "Dormitory";

		a1 = a1.replaceAll("\\s+", "");
		a2 = a2.replaceAll("\\s+", "");

		if (a1.length() != a2.length())
			System.out.println("Strings are not anagram:" + a1 + "   " + a2);

		a1 = a1.toLowerCase();
		a2 = a2.toLowerCase();
		System.out.println("Strings  anagram:" + a1 + "   " + a2);
		System.out.println();
	}
}
