package source;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Enter sorted list of integers");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int[] inpArray = Arrays.stream(reader.readLine().split("\\s")).mapToInt(Integer::parseInt).toArray();
		System.out.println("Enter n");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		s.close();
		Arrays.sort(inpArray);
		int arrLen = inpArray.length;
		int outIndex = findVal(inpArray,0 , arrLen-1, n);
		if (outIndex == -1) {
			System.out.println("Element does not exist in given array");
		}
		else {
			System.out.println("Element exists at index: " + outIndex);
		}
	}

	private static int findVal(int[] inpArray, int i, int j, int n) {
		// TODO Auto-generated method stub
		if(j>=i) {
			int mid = (i + j)/2;
			if(inpArray[mid] == n)
				return mid;
			else if (inpArray[mid] > n) {
				return findVal(inpArray, i, mid-1, n);
			}
			else
				return findVal(inpArray, mid+1, j, n);
		}
		return -1;
	}
	

}
