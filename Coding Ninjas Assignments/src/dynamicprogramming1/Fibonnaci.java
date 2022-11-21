package dynamicprogramming1;

import java.util.Scanner;

public class Fibonnaci {
	
	public static int fibbIterative(int n) {
		if(n == 0 || n == 1) {
			return n;
		}
		
		
		int[] dp = new int[n + 1];
		dp[0] = 0;
		dp[1] = 1;
		
		
		for (int i = 2; i < dp.length; i++) {
			dp[i] = dp[i - 1] +  dp[i - 2];
		}
		
		return dp[n];
		
	}
	
	public static int fibb(int n, int[] dp) {
		
		if(n == 0 || n == 1) {
			return n;
		}
		
		int ans1, ans2;
		
		if(dp[n -1] == -1) {
			ans1 = fibb(n -1, dp);
			dp[n -1] = ans1;
		}else {
			ans1 = dp[n - 1];
		}
		
		if(dp[n -2] == -1) {
			ans2 = fibb(n -2, dp);
			dp[n -2] = ans2;
		}else {
			ans2 = dp[n - 2];
		}
		
		int ans = ans1 + ans2;
		
		return ans;
		
	}

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			
			int dp[] = new int[n];
			
			for (int i = 0; i < dp.length; i++) {
				dp[i] = -1;
			}
			
			//int ans = fibb(n, dp);
			
			int ans = fibbIterative(n);
			System.out.println(ans);
		}

	}

}
