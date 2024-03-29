package hashmap;

import java.util.HashMap;

public class PrintIntersection {

	public static void printIntersection(int[] arr1, int[] arr2) {
		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < arr1.length; i++) {
			if (map.containsKey(arr1[i])) {
				int freq = map.get(arr1[i]);
				map.put(arr1[i], freq+1);
			} else {
				map.put(arr1[i], 1);
			}
		}

		for (int i = 0; i < arr2.length; i++) {
			if (map.containsKey(arr2[i])) {
				int freq = map.get(arr2[i]);
				if (freq > 0) {
					System.out.print(arr2[i] + " ");
					map.put(arr2[i], freq-1);
				}
			}
		}

	}

	public static void main(String[] args) {
		
		int arr1[] = {1,2,3,1,4,5,2,6,7,5,8};
		int arr2[] = {2,1,4,3,5,2,6,1,2,7};
		
		printIntersection(arr1, arr2);
	}

}
