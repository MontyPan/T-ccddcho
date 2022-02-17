package us.dontcareabout.ccddcho.basic.Issue_15;

public class Fib1 {

	private final int a0;
	private final int a1;

	public Fib1(int a0, int a1) {
		this.a0 = a0;
		this.a1 = a1;
	}

	public int fibonacci(int n) {
		if (n == 0) {
			return a0;
		}

		if (n == 1) {
			return a1;
		}

		int[] a = new int[n + 1];
		a[0] = a0;
		a[1] = a1;
		int result = 0;

		for (int i = 2; i <= n; i++) {
			a[i] = a[i - 2] + a[i - 1];
			result = a[i];
		}

		return result;
	}

}
