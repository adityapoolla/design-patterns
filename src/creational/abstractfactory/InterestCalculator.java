package creational.abstractfactory;

import creational.abstractfactory.util.Bank;

public class InterestCalculator {

	public static void main(String[] args) {
		AbstractFactory af = FactoryCreator.getFactory("COMMERCIAL");
		Bank bank = af.getBank("SBI");
		System.out.println(bank.getInterestRate());
	}
}
