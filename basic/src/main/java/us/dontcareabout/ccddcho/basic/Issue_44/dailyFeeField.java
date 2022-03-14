package us.dontcareabout.ccddcho.basic.Issue_44;

public class dailyFeeField {
	int money = 0;
	Breakfast breakfastFee = new Breakfast();
	Lunch lunchFee = new Lunch();
	Dinner dinnerFee = new Dinner();

	public int foo() {
		return breakfastFee.Fee() + lunchFee.Fee() + dinnerFee.Fee();
	}

}
