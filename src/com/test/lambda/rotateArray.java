package com.test.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class rotateArray {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		int k = 4;
		int op[] = new int[arr.length];
		int n = arr.length;//
		int l = 0;
		while (l < k) {// 6,7
			op[l] = arr[n - k + l];
			l++;
		}
		// 2
		for (int i = 0; i < arr.length - k; i++) {
			op[i + l] = arr[i]; //

		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(op[i]);// [i+l]=arr[i];

		}
		List<Integer> li = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));

		List<Integer> result = rotateArray(li, k);

		System.out.print(result);

		int nums[] = { 14, 0, 2, 3, 40, 2, 0, 2 };
		moveZeros(nums);

	}

	public static List<Integer> rotateArray(List<Integer> li, int k) {
		int length = li.size();
		k = k % length;
		Collections.reverse(li); // 7654321
		Collections.reverse(li.subList(0, k));// 6543217
		Collections.reverse(li.subList(k, length));
		return li;
	}

	public static void moveZeros(int[] nums) {

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0 && nums[nums.length - 1 - i] == 0) {
				nums[nums.length - 1 - i] = nums[i];
				// int t=nums[i];
				nums[i] = 0;
			}
		}

		for (int i : nums) {
			System.out.print(i + "\t");
		}
	}

}
