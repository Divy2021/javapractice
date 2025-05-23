package stackPractice;

import java.util.Stack;

public class MaxRamp {

	public static void main(String[] args) {
		int nums[] = { 6, 0, 8, 2, 1, 5 };
		int result = maxWidthRamp(nums);
		System.out.println(result);
	}

	public static int maxWidthRamp(int[] nums) {
		int max = 0;
		Stack<Integer> st = new Stack<>();
		for (int i = 0; i < nums.length; i++) {
			if (st.isEmpty() || nums[st.peek()] > nums[i]) {
				st.push(i);
			}
		}
		for (int j = nums.length - 1; j >= 0; --j) {
			while (!st.isEmpty() && nums[st.peek()] <= nums[j]) {
				max = Math.max(max, j - st.pop());
			}
		}
		return max;
	}
}
