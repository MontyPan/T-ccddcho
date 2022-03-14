package us.dontcareabout.ccddcho.basic.Issue_44;

public class dailyFeeCtor {
	final int money;
	Breakfast breakfastFee = new Breakfast();
	Lunch lunchFee = new Lunch();
	Dinner dinnerFee = new Dinner();
	
	public dailyFeeCtor() {
		money = breakfastFee.Fee() + lunchFee.Fee() + dinnerFee.Fee();
	}

}
