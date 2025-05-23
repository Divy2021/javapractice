package StringsPractice;

public class DeciBinaryMin {

	public static void main(String[] args) {
		// https://leetcode.com/problems/partitioning-into-minimum-number-of-deci-binary-numbers/
		String s = "65314";
		// 1111
		// 1101
		// 1101
		// 1001
		// 1000
		int max = 0;

		for (char c : s.toCharArray()) {
			max = Math.max(max, Character.getNumericValue(c));
		}
		System.out.println(max);
	}
}
