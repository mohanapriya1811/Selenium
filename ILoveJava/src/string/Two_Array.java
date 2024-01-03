package string;

import java.util.Arrays;

public class Two_Array {
public static void main(String[] args) {
	//String[][] array = new String[3][2];
	
	String[][] array =   {{"username", "password"},{"Demosalesmanager", "crmsfa"},
			{"DemoCSR2", "crmsfa"}};
	
	for(int i = 0; i<array.length; i++) {
		for(int j = 0; j<array[i].length; j++) {
		System.out.print((array[i][j] +" "));
		}
		System.out.println(" ");
	}
	
}
}