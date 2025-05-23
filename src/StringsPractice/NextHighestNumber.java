package StringsPractice;

import java.util.Arrays;

public class NextHighestNumber {
	public static int findNext(int num) {
		char[] digits=Integer.toString(num).toCharArray();
		
		int n=digits.length;
		
		int i=n-2;
		
		while(i>=0 && digits[i]>=digits[i+1])
		{
			i--;
		}
		
		if(i<0)
			return -1;
		
		int j=n-1;
		
		while(digits[i]>=digits[j])
		{
			j--;
		}
		char temp=digits[i];
		digits[i]=digits[j];
		digits[j]=temp;
		
		Arrays.sort(digits,i+1,n);
		
		
		
		return Integer.parseInt(new String(digits));
	}

	public static void main(String[] args) {
		int num = 127658;
		int nextHighest = findNext(num);
		System.out.println("Next highest number: " + nextHighest); // Output: 1243
	}
}
