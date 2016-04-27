package recursion;

public class Fibonacci {
	private int[] preCalc = null;
	
	public int fib(int n) {
		if (preCalc == null) {
			preCalc = new int[n];
			for (int i = 0; i < n; i++) {
				preCalc[i] = -1;
			}
		}
		if (n == 1 || n == 2) {
			return 1;
		} else {
			if(preCalc[n-1] != -1) {
				return preCalc[n-1];
			} else {
				int result = fib(n-1) + fib(n-2);
				preCalc[n-1] = result;
				return result;
			}
		}
	}
}
