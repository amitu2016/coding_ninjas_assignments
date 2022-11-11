package hashmap;

import java.util.HashMap;

public class PairsWithDifferenceK {
	
	public static int getPairsWithDifferenceK(int arr[], int k) {
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for (int i = 0; i < arr.length; i++) {
			if(map.containsKey(arr[i])) {
				int freq = map.get(arr[i]);
				map.put(arr[i], freq+1);
			}else {
				map.put(arr[i], 1);
			}
		}
		
		int pairs = 0;
		
		if(k == 0) {
			for(Integer i: map.keySet()) {
				int val = map.get(i);
				pairs=pairs+(val*(val-1))/2;
			}
			
			return pairs;
		}
		
		
		
		for (Integer i: map.keySet()) {
			if (map.containsKey(i + k)) {
				pairs = pairs + (map.get(i) * map.get(i + k));
			}
			
			if(map.containsKey(i - k)) {
				pairs = pairs + (map.get(i) * map.get(i));
			}
		}
		
		pairs = pairs / 2;
		
		
		return pairs;
		
	}
	
	public static void main(String[] args) {
		int arr[] = {5,1,2,4}, k = 3;
		int arr2[] = {4, 4, 4, 4}, k2 = 0;
		System.out.println(getPairsWithDifferenceK(arr, k));

	}

}
