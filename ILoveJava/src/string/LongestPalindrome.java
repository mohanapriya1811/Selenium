package string;

public class LongestPalindrome {
	
	
	public static void main(String[] args) {
		
		String s = "baba";
		
		int maxlen = 0;
		
		for(int i = 0; i<s.length(); i++) {
			for(int j=i; j<s.length(); j++) {
				String newStr = s.substring(i, j);
			
				//palindrome(newStr);
				System.out.println(newStr);
				System.out.println(palindrome(newStr));
				if(newStr.length()>maxlen) {
					//System.out.println(i + " "+ j);
					maxlen = newStr.length();
				}
			}
		}
		
		
	}
	
	public static boolean palindrome(String str) {
		String reverse ="";
		for(int i = str.length()-1; i>=0; i--) {
			reverse += str.charAt(i);
		}
		
		if(str.equals(reverse)) {
			return true;
		}
		else {
			return false;
		}
	}
}
