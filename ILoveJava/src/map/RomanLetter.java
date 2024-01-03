package map;

public class RomanLetter {
	public static int romanToInt(String s)
	{
		char[] arr = s.toCharArray();
		int sum = 0;
		for(int i = 0; i<arr.length; i++) {
			char character = arr[i];
			
			switch(character) {
			case 'I':
				sum += 1;
				break;
			case 'V':
				sum += 5;
				break;
			case 'X':
				sum += 10;
				break;
			case 'L':
				sum += 50;
				break;
			case 'C':
				sum += 100;
				break;
			case 'D':
				sum += 500;
				break;
			case 'M':
				sum += 1000;
				break;
				}
		}
		return sum;
	}
	public static void main(String[] args) {
		String s = "LVIII";
		System.out.println(romanToInt(s));
	}
}
