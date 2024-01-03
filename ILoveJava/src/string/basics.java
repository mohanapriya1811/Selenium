package string;

import java.util.Arrays;

public class basics {
	
	
		public static boolean isPrime(int num)  {
			
			for(int i = 2; i<num; i++) {
				if(num%i == 0)
					return false;
			}
			
			return true;

		}
		
		
		public static int getFactorial(int num) {
			int sum = 1;
			for(int i = 1; i<= num; i++) {
				sum = sum*i; 
			}
			return sum;
		}
		
		
		  public static boolean isArmStrong(long num) {
			  
			  
			  int sum = 0;
			  long temp = num ;
				while (temp != 0) {
					int count = countDigits(num); // 3
					int lastDigit = (int) temp%10; // 153/10 = 3
					
					int product = 1;
					while (count != 0) {
						product *= lastDigit; // 3*1 = 3*3 // 9*3
						
						count--;
					}
					sum += product;
					temp = temp/10;
					
				}
			  
		  
			  if(sum == num)
				  return true;
			  else
				  return false;
		  }
		 
		
		public static int countDigits(long num) {
			int count = 0;
			while(num!=0) {
				num = num/ 10; 
				count++;
			
			}
			
			return count;
		}
		
		public static int digitsSum(int num) {
			int sum = 0;
			while(num!=0) {
				sum += num%10;
				num = num/10;
			}
			return sum;
		}
		
		public static int[] swap(int num1, int num2) {
			
			num1 = num1+num2;
			num2 = num1 - num2;
			num1 = num1 - num2;
			return new int[]{num1, num2};
		}
		
		public static void isPalindrome(int x) {
			String sum = "";
			int temp  = x;
			while(x!=0) {
				int numTwo = x%10;
				sum += numTwo;		
				x= x/10;
			}
			System.out.println(sum);
			/*
			 * if(sum == temp) return true; else return false;
			 */
		}
		public static void main(String[] args) {
			int num = -121;
			
			/*
			 * System.out.println(isPrime(num));
			 * System.out.println(isArmStrong(num));
			 * System.out.println(digitsSum((int)num));
			 * System.out.println(Arrays.toString(swap(num1, num2)));
			 */
			/* System.out.println(isPalindrome(num)); */
			isPalindrome(num);
		}
}
