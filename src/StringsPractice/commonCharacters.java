package StringsPractice;

import java.util.Arrays;

public class commonCharacters {


		// TODO Auto-generated method stub
		
		//public class CommonCharactersWithoutMap {
		    public static String findCommonChars(String str1, String str2) {
		      StringBuilder sb=new StringBuilder();
		      
		      char[] c1=str1.toCharArray();
		      char[] c2=str2.toCharArray();
		     Arrays.sort(c1);
		     Arrays.sort(c2);
		      
		     int i=0,j=0;
		      while(i<str1.length() && j<str2.length() )
		      {
		    	  if(c1[i]==c2[j])
		    	  {
		    		  sb.append(c1[i]);
		    		  i++;
		    		  j++;
		    		
		    	  }
		    	  else if(c1[i]<c2[j])
		    	  {
		    		  i++;
		    	  }
		    	  else j++;
		    	
		      }
		      
		      return sb.toString();
		    }

		    public static void main(String[] args) {
		        String str1 = "ABCDCD";
		        String str2 = "CDEFD";
		        System.out.println(findCommonChars(str1, str2)); // Output: "anana"
		    }
		

	

}
