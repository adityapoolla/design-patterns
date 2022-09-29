package structural.bridge;

public class BridgeTest {

//	When we want a parent abstract class to define the set of basic rules, and the concrete classes to add additional rules
//	When we have an abstract class that has a reference to the objects, and it has abstract methods that will be defined in each of the concrete classes
	public static void main(String[] args) {
		Shape square = new Square(new Red());
		 
	    System.out.println(square.draw());
	}
}
