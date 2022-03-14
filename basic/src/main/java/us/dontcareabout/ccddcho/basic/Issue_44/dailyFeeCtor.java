package us.dontcareabout.ccddcho.basic.Issue_44;

public class dailyFeeCtor {
	final int money;
	Breakfast breakfastFee;
	Lunch lunchFee;
	Dinner dinnerFee;
	
	public dailyFeeCtor() {
		breakfastFee = new Breakfast();
		lunchFee = new Lunch();
		dinnerFee = new Dinner(); 
		money = breakfastFee.Fee() + lunchFee.Fee() + dinnerFee.Fee();
	}

}
