package creational.factory;

import creational.factory.utils.Plan;

public class BillGenerator {

	public static void main(String[] args) {
		printBill("DOMESTIC", 5);
	}
	
	public static void printBill(String type, int minutes) {
		Factory factory = new Factory();
		Plan plan = factory.getPlan(type);
		double billAmount = plan.billPayablePerCall(minutes);
		System.out.println(billAmount);
	}
}
