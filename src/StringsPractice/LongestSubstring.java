package StringsPractice;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class LongestSubstring {

	public static void main(String[] args) {
		String s = "javaconceptt"; // oncept
		
		List<String> list=new LinkedList<>();
		Map<Character,Integer> hm=new HashMap<>();
		
		int left=0,right=0;
		int max=0;
		
		while(right<s.length())
		{
			if(!hm.containsKey(s.charAt(right)))
			{
				hm.put(s.charAt(right), 1);
			}
			else
				hm.put(s.charAt(right), hm.get(s.charAt(right))+1);
			
			while(left<=right && hm.get(s.charAt(right))==2)
			{
				Character leftc=s.charAt(left);
				hm.put(leftc, hm.get(leftc)-1);
				left++;
			}
			
			int len=right-left+1;
			if(len>max)
			{
				System.out.println("left :"+left+" right :"+right);
				list.add(s.substring(left, right+1));
				max=len;
			}
			
			right++;
				
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		int left = 0, right = 0;
//		int max = 0;
//		List<String> list = new LinkedList<>();
//		Map<Character, Integer> hm = new HashMap<>();
//		while (right < s.length()) {
//
//			if (!hm.containsKey(s.charAt(right)))
//				hm.put(s.charAt(right), 1);
//			else
//				hm.put(s.charAt(right), hm.get(s.charAt(right)) + 1);
//
//			while (left <= right && hm.get(s.charAt(right)) == 2) {
//				System.out.println(s.substring(left,right+1));
//				Character leftc = s.charAt(left);
//				hm.put(leftc, hm.get(leftc) - 1);
//				left++;
//			}
//			int len = right - left + 1;
//			if (len > max) {
//				max = len;
//				list.add(s.substring(left, right + 1));
//				System.out.println("ans :"+s.substring(left,right+1));
//			}
//			right++;
//			//System.out.println(hm);javaconcept
//		}
		System.out.println("longest substring is :" + list.get(list.size() - 1) + " and the length is " + max);
		System.out.println(list);

	}

}
