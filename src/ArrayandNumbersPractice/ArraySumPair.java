package ArrayandNumbersPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraySumPair {

	public static void main(String[] args) {
		// https://leetcode.com/problems/two-sum/
		int[] nums = { 4, 5, 7, 11, 9, 13, 8, 12 };
        System.out.println(Arrays.toString(nums));
		int k = 20;

		List<List<Integer>> li = new ArrayList<>();
		Arrays.sort(nums);// 4,5,7,8,9,11,12,13
		int i = 0, j = nums.length - 1;

		while (i < j) {
			if (nums[i] + nums[j] == k) {
				List<Integer> l = new ArrayList<>();
				l.add(nums[i]);
				l.add(nums[j]);
				li.add(l);
				i++;
				j--;
			} else if (nums[i] + nums[j] > k)
				j--;
			else if (nums[i] + nums[j] < k)
				i++;
		}
//         for(int i=0;i<nums.length;i++)
//         {
//        	 List<Integer> l=new ArrayList<>();
//        	 for(int j=i+1;j<nums.length;j++)
//             {
//        	 if(nums[i]+nums[j]==k)
//        	 {
//        		 l.add(nums[i]);
//        		 l.add(nums[j]);
//        		 li.add(l);
//        	 }
//        	 
//        		System.out.println(l); 
//             }
//         }

		System.out.println(li);

	}

}
