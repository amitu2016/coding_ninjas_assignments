package hashmap;

import java.util.HashMap;

public class PairSumTo0 {

	public static int PairSum(int[] input, int size) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < size; i++) {
			if (map.containsKey(input[i])) {
				int freq = map.get(input[i]);
				map.put(input[i], freq + 1);
			} else {
				map.put(input[i], 1);
			}
		}

		int count = 0;

		for (int i = 0; i < size; i++) {
			int x = input[i];

			if (map.containsKey(-x) && x != 0) {

				int num1 = map.get(x);
				int num2 = map.get(-x);

				count = count + (num1 * num2);

				map.put(x, 0);
				map.put(-x, 0);
			}
		}
		
		//count = count / 2;
		
		if (map.containsKey(0)) {
			int val = map.get(0);
			count = count + (val * (val - 1)) / 2;
		}

		return count;

	}

	public static void main(String[] args) {
		int arr[] = { 1, -1, 1, 1, 1 };
		System.out.println(PairSum(arr, arr.length));
	}

}
