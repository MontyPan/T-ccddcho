package us.dontcareabout.ccddcho.basic.Issue_15;


public class Fib1 {

	private final int a0;
	private final int a1;

	public Fib1(int a0, int a1) {
		this.a0 = a0;
		this.a1 = a1;
	}

	public int fibonacci(int n) {
		return calFibonacci(a0, a1, n);
	}

	private static int calFibonacci(int v1, int v2, int n) {
		if (n == 0) {
			return v1;
		}
		return calFibonacci(v2, v1 + v2, --n);
	}
	
}
