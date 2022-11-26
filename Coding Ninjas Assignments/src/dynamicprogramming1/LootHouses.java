package dynamicprogramming1;

import java.util.Iterator;

public class LootHouses {
	
	
	//Recursive Approach
	public static int maxMoneyLootedRecursive(int[] houses) {
		int n = houses.length;
		
		
		int ans = maxMoneyLootedRecursive(houses, n-1);
		
		return ans;
		
	}

	private static int maxMoneyLootedRecursive(int[] houses, int n) {

		if(n < 0) {
			return 0;
		}
		
		if(n == 0) {
			return houses[0];
		}
		
		
		int pick = houses[n] + maxMoneyLootedRecursive(houses, n - 2);
		
		int notPick = maxMoneyLootedRecursive(houses, n - 1);
		
		int ans = Math.max(pick, notPick);
		
		return ans;
	}
	
	//Recursion + Memoization
	public static int maxMoneyLootedMemoization(int[] houses) {
		int n = houses.length;
		
		int dp[] = new int[n + 1];
		
		int ans = maxMoneyLootedMemoization(houses, n - 1, dp);
		
		return ans;
		
	}

	private static int maxMoneyLootedMemoization(int[] houses, int n, int[] dp) {
		if(n < 0) {
			return 0;
		}
		
		if(n == 0) {
			return houses[0];
		}
		
		
		if(dp[n] != -1) {
			return dp[n];
		}
		
		int pick = houses[n] + maxMoneyLootedMemoization(houses,n -2, dp);
		int notPick = maxMoneyLootedMemoization(houses, n -1, dp);
		
		int ans = Math.max(pick, notPick);
		
		return ans;
		
	}
	
	
	
	//Optimized Tabulization Approach
	
	public static int maxMoneyLooted(int[] houses) {
		int n = houses.length;
		
		if(n == 0) {
			return 0;
		}
		
		if(n == 1) {
			return houses[0];
		}
		
		if(n == 2) {
			return Math.max(houses[0], houses[1]);
		}
		
		int dp[] = new int[n];
		
		dp[0] = houses[0];
		dp[1] = Math.max(houses[0], houses[1]);
		
		for (int i = 2; i < n; i++) {
			dp[i] = Math.max(houses[i] + dp[i -2], dp[i -1]);
		}
		
		
		return dp[n -1];
		
	}
	

	public static void main(String[] args) {
		int hval[] = { 6, 7, 1, 3, 8, 2, 4 };
		int ans = maxMoneyLootedRecursive(hval);
		
		System.out.println(ans);
	}

}
