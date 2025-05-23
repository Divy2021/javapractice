package stream;

import java.util.*;
import java.util.stream.Collectors;

public class AnagramGrouping {

    public static void main(String[] args) {
        // Example list of strings
        List<String> words = Arrays.asList("bat", "tab", "eat", "tea", "tan", "nat", "atb","abcd","bcad");

     
        
        Map<String, List<String>> collect = words.stream().collect(Collectors.groupingBy(word->{ 
        char[] chars=word.toCharArray();
        Arrays.sort(chars);
        return new String(chars);}));

        // Print grouped anagrams
        collect.forEach((x, y) -> {
            System.out.println("Anagram group: "+x+" :" + y);
        });
        
        String str="hellor";
        String str2="olleh";
        
        //int i=0;
        
        HashMap<Character,Integer> hm=new HashMap<>();
        String str1=str.concat(str2);
        for(int j=0;j<str1.length();j++)
        {
        	if(hm.containsKey(str1.charAt(j)))
        	{
        		hm.put(str1.charAt(j), hm.get(str1.charAt(j))+1);
        	}
        	else
        		hm.put(str1.charAt(j), 1);
        }
        System.out.println(hm);
        System.out.println(str1);
        for(int i=0;i<str1.length();i++)
        {
        	String s=str1.substring(i, i+1);
        	
        	if(hm.get(str1.charAt(i))%2==0) {
        		
        		if(str2.contains(s))
            	{
        			//i++;
            		continue;
            	}
        	}
        	else
        		System.out.println("not an anagram");
        	//i++;
        }
        
        System.out.println("string are anagram of each other");
    }
}
