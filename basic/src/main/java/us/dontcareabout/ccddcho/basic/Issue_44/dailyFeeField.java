package us.dontcareabout.ccddcho.basic.Issue_44;

public class dailyFeeField {
	int money = 0;
	final Breakfast breakfastFee = new Breakfast();
	final Lunch lunchFee = new Lunch();
	final Dinner dinnerFee = new Dinner();

	public int foo() {
		return money = breakfastFee.Fee() + lunchFee.Fee() + dinnerFee.Fee();
	}

}
