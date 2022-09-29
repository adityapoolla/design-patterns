package creational.factory.utils;

public abstract class Plan {

	public abstract double getAmountPerMinute();
	
	public double billPayablePerCall(int callTimeInMins) {
		return getAmountPerMinute() * callTimeInMins;
	}
}
