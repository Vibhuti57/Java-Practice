/**
 * 
 */
package source;

import java.util.Scanner;
/**
 * @author Vibhuti
 *
 */
public class maxEvenLenWord {

	/**
	 * @param args
	 */
	static String findMaxEven(String inpText) {
		int index = -1;
		int i = 0;
		int curlen = 0;
		int maxlen = 0;
		int n = inpText.length();
		while(i<n) {
			if(inpText.charAt(i) == ' ') {
				if(curlen %2 == 0) {
					if(curlen > maxlen) {
						maxlen = curlen;
						index = i-curlen;
					}
				}
				curlen = 0;
				i++;
			}
			else {
				i++;
				curlen++;
			}
		}
		
		if (i==n && curlen > 0) {
			if(curlen %2 == 0) {
				if(curlen > maxlen) {
					maxlen = curlen;
					index = i-curlen;
				}
			}
		}
		
		if(index == -1) {
			return ("No even length word.");
		}
		else {
			return inpText.substring(index, index+maxlen);
		}
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter input string: ");
		String inpText = s.nextLine();
		s.close();
		System.out.println(findMaxEven(inpText));
	}

}
