package map;

import java.util.HashMap;
import java.util.Map;

public class FindNoOfOccurence {

		
		public static Map<Integer,Integer> numberOfOccurance(int[] data) {
		
		Map<Integer, Integer> map = new HashMap<>(); 
		int count = 0;	
		for(int i =0; i<data.length; i++){
			count = 1;
	     
			if(!map.containsKey(data[i])){
					map.put(data[i], count);
		        }
		    else{
		          count++;
		        map.put(data[i], count);
		    	}
		           
	           }
	    return map;
		}

		public static void main(String[] args) {
			//int[] data = {11, 12, 13, 14, 15};
			int[] data = {1, 2, 3, 2, 3, 11, -11, 12};
			System.out.println(numberOfOccurance(data));
			
		}
}
