package dynamicprogramming1;

public class CountMinStepsTo1 {
	
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
