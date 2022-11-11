package hashmap;

import java.util.ArrayList;
import java.util.HashMap;

public class LongestConsecutiveSubsequence {

	public static ArrayList<Integer> longestConsecutiveIncreasingSequence(int[] arr) {
		ArrayList<Integer> output = new ArrayList<>();
		HashMap<Integer, Boolean> map = new HashMap<>();
		HashMap<Integer, Integer> lenMap = new HashMap<>();

		// Putting all the values as true in hashmap against each key
		for (int i = 0; i < arr.length; i++) {
			map.put(arr[i], true);
		}
		
		//Initialize max start and max length
		int maxStart = -1, maxLen = 0;

		for (int i : arr) {
			
			if (map.get(i)) {
				//Visiting current key and marking its value as false
				int currStart = i, currLen = 1;
				boolean flag = true;
				map.put(i, false);

				//Checking forward sequence
				int ahead = i + 1;
				while (flag) {
					//If increasing subsequence is found, then incrementing the current length
					// and making its value as false
					if (map.containsKey(ahead)) {
						currLen = currLen + 1;
						map.put(ahead, false);
						ahead = ahead + 1;
					} else {
						flag = false;
					}
				}
				flag = true;
				int before = i - 1;
				//Checking for reverse subsequence
				while (flag) {
					if (map.containsKey(before)) {
						currLen = currLen + 1;
						currStart = before;
						map.put(before, false);
						before = before - 1;
					} else {
						flag = false;
					}
				}
				
				//Finding max length and max start
				if (currLen >= maxLen) {
					maxLen = currLen;
					maxStart = currStart;
					lenMap.put(maxStart, maxLen);
				}
			}

		}

		//setting values of Max start and Max Length
		for (int i = 0; i < arr.length; i++) {
			if (lenMap.containsKey(arr[i]) && lenMap.get(arr[i]) >= maxLen) {
				maxStart = arr[i];
				maxLen = lenMap.get(arr[i]);
				break;
			}
		}
		
		//Adding start and End element of subsequence to Arraylist
		output.add(maxStart);
		output.add(maxStart + maxLen - 1);
		return output;
	}

	public static void main(String[] args) {
		int[] a = { 3, 10, 3, 11, 4, 5, 6, 7, 8, 12 };
		ArrayList<Integer> op = longestConsecutiveIncreasingSequence(a);
		System.out.println(op);

	}

}
