package array;

import java.util.Arrays;

public class RotateLeft {

	static int[] rotateOneByOne(int[] arr, int n){
		int temp;
		for(int j = 0; j<n; j++) {
		temp = arr[0];
		for(int i = 0; i<arr.length-1; i++) {
			
			arr[i] = arr[i+1];
		}
			arr[arr.length-1] = temp;
		}
		return arr;
	}
	
	public static void reverseEfficient(int[] arr, int n) {
		int[] newArray = new int[arr.length];
		int j = 0;
		for(int i = arr.length-1; i>=0; i--) {
			if(j<arr.length) {
				newArray[j] = arr[i];
				j++;
			}
			}
			
		System.out.println(Arrays.toString(newArray));
	}
	
	public static void main(String[] args) {
		  int [] arr = new int [] {1, 2, 3, 4, 5};  
		  int n =3;
		  //System.out.println(Arrays.toString(rotateOneByOne(arr, n)));
		  reverseEfficient(arr, n);
	}
}
