package ArrayandNumbersPractice;

import java.util.Scanner;

public class LargestNumberWithoutGivenDigit {

	public static void main(String[] args) {

		/*
		 * Write a Java program to find the largest number ‘L’ less than a given number
		 * ‘N’ which should not contain a given digit ‘D’. For example, If 145 is the
		 * given number and 4 is the given digit, then you should find the largest
		 * number less than 145 such that it should not contain 4 in it. In this case,
		 * 139 will be the answer. This program is one of the logical programs in Java
		 */

		int num = 1456;
		int c = 4;

       while(containsDigit(num,c))
       {
    	   num--;
       }
       

		System.out.println("num max :" + num);

	}

public static boolean containsDigit(int n,int d)
{
	while(n>0)
	{
		if(n%10==d)
			return true;
		n=n/10;
		
	}
	return false;
}

//       long start=System.currentTimeMillis(); //nanoTime
//		while (Integer.toString(num).contains(Integer.toString(c))) {
//			num--;
//		}
//		long end=System.currentTimeMillis();
//		System.out.println(end-start);

}

//System.out.println("ch :"+ch);
//
//System.out.println("ch :"+ch);
//
//for(int i=num;i>0;--i)
//{ 
//	System.out.println("value of i"+i+" "+Integer.toString(i).indexOf(ch));
//	if(Integer.toString(i).indexOf(ch)==-1 && i<num)
//	{
//		max=i;
//		break;
//		
//	}
//		
//}
//System.out.println("max element :"+max);
//for(int i=num;i>0;--i)
//{ 
//	System.out.println("value of i"+i+" "+Integer.toString(i).indexOf(ch));
//	if(Integer.toString(i).indexOf(ch)==-1 && i<num)
//	{
//		max=i;
//		break;
//		
//	}
//		
//}
//System.out.println("max element :"+max);
