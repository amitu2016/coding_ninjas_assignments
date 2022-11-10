package hashmap;

import java.util.HashMap;
import java.util.Map.Entry;

public class MaximumFrequencyNumber {

	public static int maxFrequencyNumber(int[] arr) {
		
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for (int i = 0; i < arr.length; i++) {
			int key = arr[i];
			if(map.containsKey(key)) {
				int freq = map.get(key);
				freq++;
				map.put(key, freq);
			}else {
				map.put(key, 1);
			}
		}
		
		
		
		int max = 0, res = Integer.MIN_VALUE;
		
		for(Entry<Integer, Integer> val : map.entrySet()) {
			if(max < val.getValue()) {
				res = val.getKey();
				max = val.getValue();
			}
		}
		
		return res;
	}

	public static void main(String[] args) {
		int arr[] = {1,2,3,2,5,1,4,3,6};
		
		int max = maxFrequencyNumber(arr);
		
		System.out.println(max);

	}

}
