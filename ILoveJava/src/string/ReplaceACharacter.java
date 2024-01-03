package string;

public class ReplaceACharacter {
	
	
	public String replaceACharacter(String str, int index, char ch) {
		String newString = "";
		for(int i = 0 ; i<str.length(); i++) {
			if(i == index) {
				newString += ch; 
			}
			else {
				newString += str.charAt(i);
			}
		}
		return newString;
	}  
	
	public static void main(String[] args) {
		String str = "Geeks";
		int index = 0;
		char ch = 'g';
		ReplaceACharacter rc = new ReplaceACharacter();
		System.out.println(rc.replaceACharacter(str, index, ch));
	}
}
