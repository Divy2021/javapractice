package com.test.lambda;

import java.util.Arrays;

public class lambdaSort {

	int x;
	String y;

	lambdaSort(int x, String y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return x + "," + y;
	}

	public static void main(String[] args) {
		lambdaSort la[] = { new lambdaSort(10, "bob"), new lambdaSort(5, "cath"), new lambdaSort(30, "ana") };

//Arrays.sort(la, (x1, x2) -> (x1.x-x2.x)); -- compare integers
		Arrays.sort(la, (x1, x2) -> (x2.y).compareTo(x1.y)); // -- compare strings
		/*
		 * Arrays.sort(la, new Comparator<lambdaSort>() {
		 * 
		 * @Override public int compare(lambdaSort o1, lambdaSort o2) { return o1.x -
		 * o2.x; } });
		 */
		for (int i = 0; i < la.length; i++) {
			System.out.println(la[i].x + "," + la[i].y);
		}
	}
}
