package listPractice;

import java.util.LinkedList;

public class CircularArray {

	public static void main(String[] args) {
		// Your code here
		int n = 7;
		int k = 5;
		LinkedList<Integer> li = new LinkedList<Integer>();
		for (int i = 0; i < n; i++)
			li.add(i);
		// 0 1 2 3 4 5 6 s=7, i=2, out 2
		// 0 1 3 4 5 6 s=6, i=4, out 5
		// 0 1 3 4 6 s=5, i=6(6>5, 6-5=1), out=1
		// 0 3 4 6 s=4, i=3, out=6
		// 0 3 4 s=3, i=5(5>3, 5-3=2), out=4
		// 0 3 s=2, i=2(2==2, 0), out=0
		// 3
		int i = k - 1;
//		int y = li.size();
		while (li.size() == 1) {
			li.remove(i);
			i = i + k;
			if (i > li.size()) {
				i = i - li.size();
			}
			System.out.println(li + ", i= " + i);
		}
		System.out.println(li.getFirst());
	}

}
