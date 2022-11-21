package dynamicprogramming1;

public class Staircase {
	
	public static long staircase(int n) {
		if(n == 0 || n == 1) {
			return 1;
		}
		
		int[] dp = new int[n + 1];
		dp[0] = 1;
		dp[1] = 1;
		dp[2] = 2;
		
		for (int i = 3; i < dp.length; i++) {
			dp[i] = dp[i - 1] +  dp[i - 2] + dp[i - 3];
		}
		
		return dp[n];
	}


	public static void main(String[] args) {
		long ans = staircase(4);
		System.out.println(ans);

	}

}
