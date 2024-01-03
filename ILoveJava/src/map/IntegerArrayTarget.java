package map;

import java.util.Arrays;

public class IntegerArrayTarget {

	static int[] twoSum(int[] numbers, int target)
	{
		int sum;
		if(target != numbers[0]) {
		for(int i = 0; i<numbers.length-1; i++) {
			sum = 0;
			for(int j = i+1; j<numbers.length; j++) {
				sum = numbers[i] +numbers[j];
				if(sum == target)
					return new int[] {i, j};
			}
		}
		}
		else {
			return new int[] {0, 0};
		}
		return new int[] {-1, -1};
	} 
	
	public static void main(String[] args) {
		int[] numbers = {2, 7, 11, 15};
		int target = 9;
		
		System.out.println(Arrays.toString(twoSum(numbers, target))); 
	}
}
