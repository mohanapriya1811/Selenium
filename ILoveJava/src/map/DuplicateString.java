package map;


import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateString {

	static String duplicateString(String s) {
		
		
		Map<String, Integer> map  = new HashMap<>();
		int max = 0;
		int len = 0;
		for(int i = 0; i<s.length()-1; i++ ) {
			for(int j = i+1; j<s.length(); j++) {
				String newStr = s.substring(i, j);
				int count = 1;
				if(!map.containsKey(newStr)) {
					map.put(newStr, count);
				}
				else {
					count++;
					map.put(newStr, count);
				}
			}
		}
		System.out.println(map);
		Set<Entry<String, Integer>> entry = map.entrySet();
		for(Entry<String, Integer> getEntry:entry) {
			if(max<getEntry.getValue()) {
				max = getEntry.getValue();					
				}
		}
		
		
		for(Entry<String, Integer> getKey:entry) {
			if(max == getKey.getValue()) {
				if(len<getKey.getKey().length()) {
					len = getKey.getKey().length();
				}
				
			}
			
		}
		
		for(Entry<String, Integer> getKey:entry) {
			if(max == getKey.getValue() && len == getKey.getKey().length())
				return getKey.getKey();
		}
		
		return null;
	}
	


	public static void main(String[] args) {
		String s = "abbaba";
		//duplicateString(s);
		System.out.println(duplicateString(s));
	}
}
