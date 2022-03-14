package us.dontcareabout.ccddcho.basic.Issue_44;

public class Main {

	public static void main(String[] args) {
		dailyFeeCtor ctor = new dailyFeeCtor();
		System.out.println(ctor.money);

		dailyFeeField field = new dailyFeeField();
		System.out.println(field.foo());
	}

}
