package creational.abstractfactory;

import creational.abstractfactory.util.Bank;

public abstract class AbstractFactory {

	public abstract Bank getBank(String bank);
	
}
