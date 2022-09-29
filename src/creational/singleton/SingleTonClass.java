package creational.singleton;

public class SingleTonClass{

	public static SingleTonClass stc;
	
	private SingleTonClass() {};
	
	public synchronized static SingleTonClass getSTClass() {
		if(stc == null)
			stc = new SingleTonClass();
		return stc;
	}
}
