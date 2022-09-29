package creational.factory;

import creational.factory.utils.DomesticPlan;
import creational.factory.utils.InternationalPlan;
import creational.factory.utils.Plan;

// FActory Pattern example
public class Factory {

	// returns a plan based on type input
	public Plan getPlan(String type) {
		if(type.equals(DomesticPlan.PLAN))
			return new DomesticPlan();
		else if(type.equals(InternationalPlan.PLAN))
			return new InternationalPlan();
		return null;
	}
}
