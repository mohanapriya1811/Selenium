package array;

import java.util.Arrays;

public class RotateAnArray {
	
	
	static void leftRotate(int[] arr, int d) {
		if(d == 0)
			return;
		int n = arr.length;
		
		d = d%n;
		rotateAlgorithm(arr, 0, d-1);
		rotateAlgorithm(arr, d, arr.length-1);
		rotateAlgorithm(arr, 0, arr.length-1);
		
		System.out.println(Arrays.toString(arr));
	}
	static void rotateAlgorithm(int[] arr,  int start, int end){
		
		
		
		int temp;
		while(start<end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		
		
	}
	
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6};
		int d = 2;
		
		leftRotate(arr, d);
	
	}
}
