package StringsPractice;

public class StringRotation {

	public static void main(String[] args) {

		String s1 = "divyaprabu"; // "JavaConcept";
		String s2 = "ivyaprabud";// "ConceptJava"; //aconceptjav , vaconceptja ,avaconceptj

		int i = 0, count = 0;
		while (s1.length() == s2.length() && i < s1.length()) {
			System.out.println(s2.substring(s1.length() - 1 - i) + (s2.substring(0, s1.length() - 1 - i)));
			// System.out.println();
			String temp = s2.substring(s1.length() - 1 - i) + s2.substring(0, s2.length() - 1 - i);// s2.charAt(i+1)+s2.substring(0,
																									// i);
			if (s1.equals(temp)) {
				System.out.println("Strings are rotation of each other  :" + s1 + " " + s2);
				break;
			} else {
				System.out.println("rotating:" + count++);
			}
			i++;
		}
		if (i >= s1.length() | i == 0)
			System.out.println("Strings are not rotation of each other");

		// method 2
		String s3 = s1 + s1;
		if (s1.length() == s2.length() && s3.contains(s2))
			System.out.println("String rotation" + s3.contains(s2));
		else
			System.out.println("String rotation false");
	}

}
