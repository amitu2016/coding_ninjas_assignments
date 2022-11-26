package dynamicprogramming1;

import java.util.Arrays;

public class CoinTower {
	
	public static String findWinner(int n, int x, int y) {
		// To store results
        String[] dp = new String[n + 1];
      
        Arrays.fill(dp, "Whis");
     
        // Initial values
        dp[0] = "Whis";
        dp[1] = "Beerus";
      
        // Computing other values.
        for (int i = 2; i <= n; i++) {
      
            // If Beerus losses any of i-1 or i-x
            // or i-y game then he will
            // definitely win game i
            if (i - 1 >= 0 && dp[i - 1] == "Whis")
                dp[i] = "Beerus";
            else if (i - x >= 0 && dp[i - x] == "Whis")
                dp[i] = "Beerus";
            else if (i - y >= 0 && dp[i - y] == "Whis")
                dp[i] = "Beerus";
      
            // Else Beerus loses game.
            else
                dp[i] = "Whis";
        }
      
        // If dp[n] is "Beerus" then A will
        // game otherwise  he losses
        return dp[n];
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
