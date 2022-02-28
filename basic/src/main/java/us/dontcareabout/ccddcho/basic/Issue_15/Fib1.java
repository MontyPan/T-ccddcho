package us.dontcareabout.ccddcho.basic.Issue_15;

public class Fib1 {

	private final int s;
	private final int f;
	private int[] a = new int[2];

	public Fib1(int a0, int a1) {
		this.s = a0;
		this.f = a1;
	}

	public int fibonacci(int n) {
		a[0] = s;
		a[1] = f;
		
		if (n >= a.length) {
			int[] newA = new int[n + 1];

			for (int i = 0; i < a.length; i++) {
				newA[i] = a[i];
			}

			for (int i1 = a.length; i1 <= n; i1++) {
				newA[i1] = newA[i1 - 2] + newA[i1 - 1];
				if (i1 == n) {
					return newA[i1];
				}
			}

			a = newA;
		} else {
			return a[n];
		}

		return -1;
	}
}
