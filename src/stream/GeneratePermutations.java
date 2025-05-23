package stream;

import java.util.*;
import java.util.stream.Collectors;
public class GeneratePermutations {

	    public static void main(String[] args) {
	        String str = "abcd";
	        
	        // Get all permutations using a stream
	        List<String> permutations = getPermutations(str);
	        
	        // Group permutations by length
	        Map<Integer, List<String>> groupedByLength = permutations.stream()
	            .collect(Collectors.groupingBy(String::length));
	        
	        // Print grouped permutations
	        groupedByLength.forEach((length, group) -> {
	            System.out.println("Group of length " + length + ": " + group);
	        });
	    }

	    // Function to get all permutations of a string
	    public static List<String> getPermutations(String str) {
	        if (str == null || str.length() == 0) {
	            return Collections.emptyList();
	        }
	        
	        // Generate permutations using a stream
	        return str.chars()
	                .mapToObj(c -> (char) c)
	                .collect(Collectors.collectingAndThen(
	                        Collectors.toList(), 
	                        list -> generatePermutations(list, 0, list.size() - 1)));
	    }

	    // Helper method to generate all permutations of a list of characters
	    private static List<String> generatePermutations(List<Character> list, int left, int right) {
	        List<String> result = new ArrayList<>();
	        
	        if (left == right) {
	            result.add(list.stream()
	                           .map(String::valueOf)
	                           .collect(Collectors.joining()));
	        } else {
	            for (int i = left; i <= right; i++) {
	                Collections.swap(list, left, i);
	                result.addAll(generatePermutations(list, left + 1, right));
	                Collections.swap(list, left, i);  // Backtrack
	            }
	        }
	        return result;
	    }
	}


