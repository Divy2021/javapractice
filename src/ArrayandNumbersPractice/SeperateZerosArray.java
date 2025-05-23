package ArrayandNumbersPractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SeperateZerosArray {

	public static void main(String[] args) {

		int nums[] = { 15, 0, 2, 0, 3, 0, 5 };

		// Zeros to the front
		int counter=nums.length-1;
		
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i]!=0)
			{
				nums[counter]=nums[i];
				counter--;
			}
		}
		
		while(counter>=0)
		{
			nums[counter]=0;
			counter--;
			
		}
		List<Integer> li=Arrays.stream(nums).boxed().collect(Collectors.toList());// (Collectors.toList());

		System.out.println(li);
		// zeros to the back;//{ 15, 0, 2, 0, 3, 0, 5 };15,2,3,5,3,0,5-->counter 4
		
		int count=0;
		
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i]!=0)
			{
				nums[count]=nums[i];
				count++;
			}
		}
		
		while(count<nums.length)
		{
			nums[count]=0;
			count++;
		}
		//System.out.println(Arrays.toString(nums));
		
		List<Integer> li1 = Arrays.stream(nums).boxed().toList();// (Collectors.toList());

		System.out.println(li1);
	}

}
