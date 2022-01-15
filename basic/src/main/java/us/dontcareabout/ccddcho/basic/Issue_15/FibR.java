package us.dontcareabout.ccddcho.basic.Issue_15;

public class FibR {

	public static void fibonacci(int f, int s, int d) {

		if (d > 0) {
			fibonacci(s, f + s, --d);

		} else if (d == 0) {
			System.out.println(f);
		}
	}

}
