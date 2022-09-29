package creational.abstractfactory;

public class FactoryCreator {

	public static AbstractFactory getFactory(String type){   
		if(type.equals("NONCOMMERCIAL")){
			return new NonCommercialBankFactory();         
		}else{
			return new CommercialBankFactory();
		}
	}
}
