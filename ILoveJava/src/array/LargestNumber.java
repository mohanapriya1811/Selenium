package array;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;

public class LargestNumber {

	static int findMax(int[] b){
		
		int max = Integer.MIN_VALUE;
		for(int i = 0; i<b.length; i++) {
			if(max<b[i]) {
				max = b[i];
			}
		}
		
		return max;
	}
	
	static int[] findSecondMax(int[] b) {
		
		int maxOne = Integer.MIN_VALUE;
		int maxTwo = Integer.MIN_VALUE;
		
		for(int i = 0; i<b.length; i++) {
			if(maxOne<b[i]) {
				maxTwo = maxOne;
				maxOne = b[i];
			}
			else if(maxTwo<b[i]) {
				maxTwo = b[i];
			}
		}
		
		return new int[] {maxOne, maxTwo};
	}
	
	
	static int[] findThreeMax(int[] b) {
		
		int maxOne = Integer.MIN_VALUE;
		int maxTwo = Integer.MIN_VALUE;
		int maxThree = Integer.MIN_VALUE;
		
		for(int i = 0; i<b.length; i++) {
			if(maxOne<b[i]) {
				maxTwo = maxOne;
				maxOne = b[i];
			}
			else if(maxTwo<b[i]) {
				maxThree = maxTwo;
				maxTwo = b[i];
			}
			else if(maxThree<b[i]) {
				maxThree = b[i];
			}
		}
		return new int[] {maxOne, maxTwo, maxThree};
	}
	
	static int usingCollection(int[] b){
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i = 0; i<b.length; i++) {
			list.add(b[i]);
		}
		//Collections.sort(list);
		return list.get(2);
	}
	public static void main(String[] args) {
		int a[]={1,2,5,6,3,2};  
		int b[]={44,66,-99,77,33,22,55};  
		
	//	System.out.println(findMax(b));
	//	System.out.println(Arrays.toString(findSecondMax(b)));
	//	System.out.println(Arrays.toString(findThreeMax(b)));
		
		System.out.println(usingCollection(b));
	}
}
