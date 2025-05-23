package com.deque.practice;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class ArrayDequeue {

	public static void main(String[] args) {

	//	Scanner in = new Scanner(System.in);
		Map<Integer, Integer> hm = new HashMap<>();
		Deque<Integer> arraydeque = new ArrayDeque<Integer>();
		int[] nums = {4,4,4};//{ 5, 3, 5, 2, 3, 2 ,7,6}; // =in.nextInt();
		int m = 3;// in.nextInt();

		int distinct = 0, max = 0;

		for (int i = 0; i < nums.length; i++) {
			arraydeque.addLast(nums[i]);

			if (hm.containsKey(nums[i]))
				hm.put(nums[i], hm.get(nums[i]) + 1);
			else
				hm.put(nums[i], 1);

			if(hm.get(nums[i])==1)
				distinct++;
			if (arraydeque.size() == m ) {
                  int ele=arraydeque.removeFirst();
                  hm.put(ele, hm.get(nums[i]) - 1);
                  if(hm.get(ele)==1)
                	  distinct--;
                  
			}
			
			if (arraydeque.size() == m) {
				max=arraydeque.stream().mapToInt(Integer::intValue).sum();
               if(distinct>max)
            	   max=distinct;
                
			}
			

		}
		System.out.println(max);

	}

}
