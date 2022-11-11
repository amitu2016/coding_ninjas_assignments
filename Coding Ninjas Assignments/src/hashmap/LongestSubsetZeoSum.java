package hashmap;

import java.util.HashMap;

public class LongestSubsetZeoSum {

	public static int lengthOfLongestSubsetWithZeroSum(int arr[]) {
		//Creating a hashmap to store cummalative sum and index of each element
		HashMap<Integer, Integer> map = new HashMap<>();
		int sum = 0;
		int maxLen = -1;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
			
			//If sum is 0 then return length
			if (sum == 0) {
				maxLen = i + 1;
			}
			
			//If we found already a sum present then that means difference between both sums 
			// makes the sum 0
			if (map.containsKey(sum)) {
				int prevIndex = map.get(sum);
				int currentLen = i - prevIndex;
				if (currentLen > maxLen) {
					maxLen = currentLen;
				}
			} else {
				map.put(sum, i);
			}
		}

		return maxLen;
	}

	public static void main(String[] args) {
		int arr[] = { 95, -97, -387, -435, -5, -70, 897, 127, 23, 284 };
		int res = lengthOfLongestSubsetWithZeroSum(arr);
		System.out.println(res);
	}

}
