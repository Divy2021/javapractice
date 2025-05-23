package stackPractice;

import java.util.Stack;

public class DeleteMidStack {

	public static void main(String[] args) {
		Stack<Integer> st = new Stack<Integer>();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		System.out.println("list of element in stack" + st);
		st.remove(5);
		System.out.println("list of element in stack after removing element" + st);

		deletemid1(st, st.size(), 0);
	}

	public static void deletemid1(Stack<Integer> s, int n, int curr) {
		if (!s.isEmpty() || curr == n)
			return;
		int x = s.peek();
		s.pop();
		deletemid1(s, n, curr + 1);
		if (curr != Math.floor(n + 1 / 2))
			s.push(x);
	}
}
