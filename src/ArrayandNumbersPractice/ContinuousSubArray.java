package ArrayandNumbersPractice;

import java.util.ArrayList;
import java.util.List;

public class ContinuousSubArray {

	public static void main(String[] args) {
         //https://javaconceptoftheday.com/how-to-find-continuous-sub-array-whose-sum-is-equal-to-given-number/
		/*Write a Java program to find continuous sub array of the given array whose sum is equal to a given number. For example, If {12, 5, 31, 9, 21, 8} is the given array and 45 is the given number, then you have to find continuous sub array in this array such that whose elements add up to 45. In this case, {5, 31, 9} is such sub array whose elements add up to 45. [Solution]*/
		int nums[] = { 12, 5, 31, 9, 21, 8 };
		int k = 45;
		int start = 0;
		int sum = 0;
		List<Integer> l = new ArrayList<>();

		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
			while (sum > k && start <= i - 1) {
				sum -= nums[start];
				start++;
			}
			if (sum == k) {
				for (int j = start; j <= i; j++) {
					l.add(nums[j]);
				//	System.out.println(nums[j]);
				}
			}
		}
		System.out.println(l);
	}
}
