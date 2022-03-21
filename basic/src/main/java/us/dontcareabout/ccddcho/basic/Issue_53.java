package us.dontcareabout.ccddcho.basic;

public class Issue_53 {

	private Integer i;
	
	private void wtf() {
		i.equals(i);
	}

	private int foo() {
		return i;
	}

	public static void main(String[] args) {
		Issue_53 npe = new Issue_53();
		npe.foo();// Accessing or modifying the field of a null object.
		npe.wtf();// Calling the instance method of a null object.
	}
}
