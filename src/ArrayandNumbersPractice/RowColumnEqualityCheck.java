package ArrayandNumbersPractice;

import java.util.Arrays;
import java.util.HashMap;

public class RowColumnEqualityCheck {

	public static void main(String[] args) {
		int[][] grid = { { 3, 1, 2, 2 }, { 1, 4, 4, 5 }, { 2, 4, 2, 2 }, { 2, 4, 2, 2 } };
		int n = grid.length;
		HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
		for (int[] row : grid) {
			String rowStr = Arrays.toString(row);
			System.out.println(rowStr);
			hashMap.put(rowStr, hashMap.getOrDefault(rowStr, 0) + 1);
		}

		System.out.println(hashMap);

		int count = 0;
		for (int j = 0; j < n; j++) {
			int[] col = new int[n];
			for (int i = 0; i < n; i++) {
				col[i] = grid[i][j];
			}
			count += hashMap.getOrDefault(Arrays.toString(col), 0);
		}

//		  Set<ArrayList<Integer>> hm=new HashSet<ArrayList<Integer>>();
//
//int count=0;
//	        for(int i=0;i<grid.length;i++)
//	        {
//	            ArrayList<Integer> li=new ArrayList<>();
//	            for(int j=0;j<grid[i].length;j++)
//	            {
//	               li.add(grid[i][j]) ;
//	            }
//	            
//	            if(!hm.add(li))
//	            	count++;
//	            
//	        }
//	        
//	        for(int i=0;i<grid.length;i++)
//	        {
//	            ArrayList<Integer> li=new ArrayList<>();
//	            for(int j=0;j<grid[i].length;j++)
//	            {
//	               li.add(grid[j][i]) ;
//	            }
//	            
//	            if(hm.contains(li))
//	            {
//	            	System.out.println(li);
//	            	count++;
//	            }
//	            	
//	            
//	        }
//	        
//	      
		System.out.println(count);
	}

}
