package stream;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Java8CodingQuestions2 {

	public static void main(String[] args) {

		try
		{
			//int[] a=new int[5];
			int a=4,b=0;
			
			String s="1.0";
			try {
				int c=a/b;
				//System.out.println(Integer.parseInt(s+a[4]));
			}
			catch(Exception e)
			{
				System.out.println("exception1 "+e.getClass());
			}
			finally
			{
				System.out.println("finally");
			}
		}
		catch(Exception e){
			System.out.println("exceptioon 2 occure");
		}
		
        			}

}
