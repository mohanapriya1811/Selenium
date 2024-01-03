package array;

import java.util.Arrays;

public class SortArray {
	
	public static int[] placingNumber(int[] arr, int num) {
		
		int[] newArray = new int[arr.length+1];
		for(int i = 0; i<arr.length; i++) {
			newArray[i] = arr[i];
			
		}
		
		newArray[newArray.length-1] = num;
		return newArray;
		
	}
	
	public static int[] sortArray(int[] arr) {
		int temp;
		for(int i = 0; i<arr.length; i++) {
			temp = 0;
			for(int j = i+1; j<arr.length; j++) {
				
				if(arr[i] > arr[j]) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
				
			}
		}
		return arr;
	}
	
	public static int[] descSort(int[] arr) {
		
		int temp;
		for(int i = 0; i<arr.length; i++) {
			temp = 0;
			for(int j = i+1; j<arr.length; j++) {
				if(arr[i] < arr[j]) {
					
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					
				}
			}
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] arr = { 5, -2, 23, 23, 5, -42, 509 };
					
		int num = -42;
		
		// System.out.println(Arrays.toString(placingNumber(arr, num)));
		
		System.out.println(Arrays.toString(descSort(arr)));
	}
}
