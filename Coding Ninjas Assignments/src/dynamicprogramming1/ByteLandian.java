package dynamicprogramming1;

import java.util.HashMap;

public class ByteLandian {
	
	public static long bytelandian(long n, HashMap<Long, Long> memo) {
        for (long i = 0; i <= n; i++) {
			memo.put(i, i);
		}
        
        for (long i = 0; i <= n; i++) {
        	long max = Math.max(memo.get(i), (memo.get(i/2) + memo.get(i/3) + memo.get(i/4)));
			if (memo.get(i) < max) {
				memo.put(i, max);
			}
		}
        
        return memo.get(n);
        
	}

	public static void main(String[] args) {
		HashMap<Long, Long> map = new HashMap<>();
		int n = 12;
		
		System.out.println(bytelandian(n, map));
		

	}

}
