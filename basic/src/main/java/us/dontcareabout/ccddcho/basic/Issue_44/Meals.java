package us.dontcareabout.ccddcho.basic.Issue_44;

public class Meals {
	public Meals() {
		System.out.println("Constructor new instance secondly.Pay for meals.");
	}

	public Meals(String k) {
		if ("free".equals(k)) {
			System.out.println("Field new instance first.Meals are free!");
		}
	}
}