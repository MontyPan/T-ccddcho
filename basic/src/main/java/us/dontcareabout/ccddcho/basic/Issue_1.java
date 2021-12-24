package us.dontcareabout.ccddcho.basic;

public class Issue_1 {
	public static void main(String[] args) {
		int n = 5;
		int i = 0, j = 0;

		System.out.println("whileLoop 金字塔");
		
		while (i < n) {
			while (j <= i) {
				System.out.print("*");
				j++;
			}
			j = 0;
			i++;
			System.out.println();
		}

		System.out.println("doWhileLoop 金字塔");
		
		i = 0;
		do {
			do {
				j++;
				System.out.print("*");
			} while (j <= i);
			j = 0;
			i++;
			System.out.println();
		} while (i < n);

		System.out.println("forLoop 金字塔");
		
		for (int a = 0; a < n; a++) {
			for (int b = 0; b <= a; b++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}