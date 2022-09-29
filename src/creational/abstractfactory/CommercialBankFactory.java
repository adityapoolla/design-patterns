package creational.abstractfactory;

import creational.abstractfactory.util.Bank;
import creational.abstractfactory.util.Sbi;

public class CommercialBankFactory extends AbstractFactory {

	@Override
	public Bank getBank(String bank) {
		if(bank.equals("SBI"))
			return new Sbi();
		return null;
	}

}
