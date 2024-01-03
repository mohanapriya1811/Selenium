package geeks;

import java.util.ArrayList;

public class Subarray {

	    
	
		// 5 12
		// 1 2 3 7 5
		// i 
		//   j = 1+2 = 3
		//   j = 3 + 3 = 6 
		//   j = 6 + 7 = 13
 	    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
	        
 	        
 	        ArrayList<Integer> arrList = new ArrayList<Integer>();
 	        int sum;
 	        for(int i = 0; i<arr.length-1; i++){
 	            sum = arr[i];
 	            for(int j = i+1; j<arr.length; j++){
 	                
 	                sum = sum + arr[j]; 
 	                if(sum == s){
 	                    arrList.add(i);
 	                    arrList.add(j);
 	                    return arrList;
 	                }
 	                }
 	        }
 	        if(arrList.size() == 0)
 	        arrList.add(-1);
 	        return arrList;
 	         
 	    }
	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 7, 5};
		int n = 5;
		int s = 12;
		System.out.println(subarraySum(arr, n, s));
	}
}
