package structural.adapter;

/*
When an outside component provides captivating functionality that we'd like to reuse, but it's incompatible with our current application. A suitable Adapter can be developed to make them compatible with each other
When our application is not compatible with the interface that our client is expecting
When we want to reuse legacy code in our application without making any modification in the original code
*/
public class AdapterTest {

	public static void main(String[] args) {
		Movable bugattiVeyron = new BugattiVeyron();
		MovableAdapter bugattiVeyronAdapter = new MovableAdapterImpl(bugattiVeyron);
		System.out.println(bugattiVeyronAdapter.getSpeed() + "kmph");
		System.out.println(bugattiVeyron.getSpeed() + "mph");
	}
}
