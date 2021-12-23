package us.dontcareabout.ccddcho.basic;

public class Issue_1 {
	public static void main(String[] args) {
		forLoop forLoop = new forLoop();
		System.out.println();
		doWhileLoop doWhile = new doWhileLoop(5, 0, 0);
		System.out.println();
		whileLoop whileLoop = new whileLoop(5, 0, 0);
	}
}

class whileLoop {
	int n = 5;
	int i = 0;
	int j = 0;
	
	public whileLoop(int n, int i, int j) {
		this.n = n;
		this.i = i;
		this.j = j;
		
		while (i < n) {
			while (j <= i) {
				System.out.print("*");
				j++;
			}
			j = this.j;
//			j = 0;
			i++;
			System.out.println();
		}
	}
}

class doWhileLoop {
	private int n;
	private int i;
	private int j;

	public doWhileLoop(int n, int i, int j) {
		this.n = n;
		this.i = i;
		this.j = j;
		do {
			do {
				j++;
				System.out.print("*");

			} while (j <= i);
			j = this.j; //要放在 Constructor 是因為這邊的原因嗎 (不確定 xdd) 
//			j = 0;
			i++;
			System.out.println();
		} while (i < n);
	}
}

class forLoop {
	int n = 5;
	{
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
