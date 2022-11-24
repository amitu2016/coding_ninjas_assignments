package dynamicprogramming1;

public class CountMinStepsTo1 {
	
	//Recursive approach
	public static int countMinStepsToOne(int n) {
		if (n == 1) {
			return 0;
		}
		
		int ans1 = countMinStepsToOne(n - 1);
		
		int ans2 = Integer.MAX_VALUE;
		
		if(n % 2 == 0) {
			ans2 = countMinStepsToOne(n / 2);
		}
		
		int ans3 = Integer.MAX_VALUE;
		
		if(n % 3 == 0) {
			ans3 = countMinStepsToOne(n / 3);
		}
		
		int myAns = Math.min(ans1, Math.min(ans2, ans3)) + 1;
		
		return myAns;
	}
	
	//Memoization Approach
	public static int countMinStepsToOne(int n, int[] dp) {
		if (n == 1) {
			return 0;
		}
		
		int ans1;
		
		if (dp[n -1] == -1) {
			ans1 = countMinStepsToOne(n -1, dp);
		}else {
			ans1 = dp[n - 1];
		}
		
		int ans2 = Integer.MAX_VALUE;
		
		if ((n%2) == 0) {
			if (dp[n/2] == -1) {
				ans2 = countMinStepsToOne(n/2, dp);
			}else {
				ans2 = dp[n/2];
			}
		}
		
		int ans3 = Integer.MAX_VALUE;
		
		
		if ((n%3) == 0) {
			if (dp[n/3] == -1) {
				ans3 = countMinStepsToOne(n/3, dp);
			}else {
				ans3 = dp[n/3];
			}
		}
		
		int ans = Math.min(Math.min(ans2, ans3), ans1) + 1;
		
		return ans;
		
	}
	
	//Optimized Approach
	public static int countMinStepsToOneOpt(int n) {
		if(n == 1) {
			return 0;
		}
		
		int dp[] = new int[n + 1];
		
		dp[1] = 0;
		
		for (int i = 2; i <= n; i++) {
			
			int substractOne = Integer.MAX_VALUE;
			int divideTwo = Integer.MAX_VALUE;
			int divideThree = Integer.MAX_VALUE;
			
			substractOne = dp[i - 1];
			
			if ((i % 2) == 0) {
				divideTwo = dp[i / 2];
			}
			
			if ((i % 3) == 0) {
				divideThree = dp[i / 3];
			}
			
			dp[i] = 1 + Math.min(substractOne, Math.min(divideTwo, divideThree));
	
		}
		
		
		return dp[n];	
			
	}

	public static void main(String[] args) {
		int n = 10;
		
		int dp[] = new int[n + 1];
		
		for (int i = 0; i < dp.length; i++) {
			dp[i] = -1;
		}
		
		
		//int ans = countMinStepsToOne(n, dp);
		
		int ans = countMinStepsToOneOpt(n);
		
		System.out.println(ans);

	}

}
