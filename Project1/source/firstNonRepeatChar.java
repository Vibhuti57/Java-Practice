package source;

import java.util.Scanner;

public class firstNonRepeatChar {

	static final int MAX_CHARS = 256;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String inpText = s.nextLine();
		s.close();
		int outIndex = getFirstChar(inpText);
		if (outIndex == -1)	
			System.out.println("No non repeating characters present in the string.");
		else
			System.out.println("The first non repeating character is: " + inpText.charAt(outIndex));
	}

	private static int getFirstChar(String inpText) {
		// TODO Auto-generated method stub
		int outIndex = -1;
		char count[] = new char[MAX_CHARS];
		for(int i = 0; i<inpText.length(); i++)
			count[inpText.charAt(i)]++;
		
		for(int i = 0; i<inpText.length(); i++) {
			if(count[inpText.charAt(i)] == 1) {
				outIndex = i;
				break;
			}
		}
		return outIndex;
	}

}
