package creational.factory.utils;

public class DomesticPlan extends Plan {

	public static final String PLAN = "DOMESTIC";
	
	@Override
	public double getAmountPerMinute() {
		return 1.25;
	}
	
}
