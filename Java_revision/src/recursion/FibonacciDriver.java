package recursion;

public class FibonacciDriver {

	public static void main(String[] args) {
		long start;
		long stop;
		long elapse;
		int result;
		
		start = System.currentTimeMillis();
		result = fib(40);
		stop = System.currentTimeMillis();
		elapse = stop - start;
		System.out.println("Calculated fib(40) as " + result + " in " + elapse + " milliseconds");
		
		Fibonacci mem = new Fibonacci();
		start = System.currentTimeMillis();
		result = mem.fib(40);
		stop = System.currentTimeMillis();
		elapse = stop - start;
		System.out.println("Calculated fib(40) as " + result + " in " + elapse + " milliseconds");

	}
	public static int fib(int n) {
		if (n == 1 || n == 2) {
			return 1;
		} else {
			return fib(n-1) + fib(n-2);
		}
	}
}
