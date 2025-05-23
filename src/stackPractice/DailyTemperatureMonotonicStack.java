package stackPractice;

import java.util.Arrays;
import java.util.Stack;
import java.util.stream.Stream;

import stream.streamfunctions;

public class DailyTemperatureMonotonicStack {

	public static void main(String[] args) {
		int nums[] = { 73, 74, 75, 71, 69, 72, 76, 73 };
		int op[] = new int[nums.length]; // 1,1,4,
		Stack<Integer> st = new Stack<>();
		for (int i = 0; i < nums.length; i++) {
			while (!st.empty() && nums[st.peek()] < nums[i]) {
				op[st.peek()] = i - st.pop();
			}
			st.push(i);
		}
		Arrays.stream(op).forEach(x -> System.out.print(x + " "));
	}
}
