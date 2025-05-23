package StringsPractice;

import java.util.HashSet;

public class UniqueCharactersCount {

	public static void main(String[] args) {

		
		String str="abcdaefgahijkla";//"mmmmajm";//"abcdaefgahijkla";
		
		HashSet<Character> uniqueChars=new HashSet<>();	
		
		boolean found1st=false;
		char matchingChar='\0';
		int firstIndex=-1,lastIndex=-1;
		
		for (int i = 0; i < str.length(); i++) {
			if(!found1st)
			{
				matchingChar=str.charAt(i);
				firstIndex=i;
				found1st=true;
				
		
			}else
				if(str.charAt(i)==matchingChar)
			{
				
				lastIndex=i;
			}
		}
//		int high=0,count=0;
//		for(int i=0;i<str.length();i++)
//		{
//			int start=i;
//			int end=start+1;
//			char c=str.charAt(i);
//			for (int j = end; j < str.length(); j++) {
//	                     if(str.charAt(j)==c)
//	                     {
//	                    	 end=j;
//	                    	 count++;
//	                    	 if(count==2)
//		                    	 break;
//	                     }
//	                     
//				
//			}
//			StringBuilder sb=new StringBuilder();
//			for (int k = start+1; k < end; k++) {
//				//if(str.)
//				sb.append(str.charAt(k));
//			}
//			System.out.println(sb);
//			if(sb.length()>high)
//				high=sb.length();
//		}
//		System.out.println(high);
		
		if(firstIndex==-1 || lastIndex==-1 || firstIndex ==lastIndex)
			System.out.println(" no match");
		
		for (int i = firstIndex+1; i < lastIndex; i++) {
		uniqueChars.add(str.charAt(i))	;
		System.out.print(str.charAt(i));
		}
		
		System.out.println(uniqueChars.size());
		
	}

}
