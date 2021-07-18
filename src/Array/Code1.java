package Array;

import java.util.HashMap;

public class Code1 {
	
	public static void  main(String [] args) {
		int [] array  = {4,3,1,1,3,3,2};
		int n=3;
		
		int  result =findLeastNumOfUniqueInts(array,n);
	
			System.out.println(result);
		
	}
	 public static int findLeastNumOfUniqueInts(int[] arr, int k) {
		 
		 HashMap <Integer, Integer> map =new HashMap<Integer,Integer>();
		 
		 
		 for (int i = 0; i < arr.length; i++) {
			 if(!map.containsKey(arr[i])) {
				 map.put(arr[i], 1);
			 }
			 else {
				 map.put(arr[i], map.get(arr[i])+1);
			 }
		}
		 
		 
		 return 0;
		 
	 }
}
