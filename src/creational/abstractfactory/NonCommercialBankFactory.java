package creational.abstractfactory;

import creational.abstractfactory.util.Bank;
import creational.abstractfactory.util.Nabard;

public class NonCommercialBankFactory extends AbstractFactory {

	@Override
	public Bank getBank(String name) {
		if(name.equals("nabard"))
			return new Nabard();
		return null;
	}

}
