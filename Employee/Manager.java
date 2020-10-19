package Employee;

import FeedBacks.Level;

public class Manager extends Employee{

	
	// co 1 giam doc duy nhat
	private static Manager manager;
	
	public Manager(String name, int age, Level level) {
		super(name, age, level);
	}
	
	public static Manager getInstance() {
        return manager;
    }

	@Override
	protected void writeMessage(String msg) {
		System.err.println("manager" + msg);
		
	}

}
