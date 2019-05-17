package source;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ArrayWaveForm {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int[] inpArray = Arrays.stream(reader.readLine().split("\\s")).mapToInt(Integer::parseInt).toArray();
		int n = inpArray.length;
		for(int i = 0; i < n; i+=2) {
			if(i>0 && inpArray[i-1]>inpArray[i])
				swap(inpArray, i-1, i);
			if(i<n-1 && inpArray[i+1] > inpArray[i])
				swap(inpArray, i, i+1);
		}
		for(int i : inpArray)
			System.out.print(i + " ");
	}

	private static void swap(int[] inpArray, int i, int i2) {
		// TODO Auto-generated method stub
		int temp = inpArray[i];
		inpArray[i] = inpArray[i2];
		inpArray[i2] = temp;
	}

}
