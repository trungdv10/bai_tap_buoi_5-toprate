package Employee;

import FeedBacks.Level;
import Order.Command;

public class Waiter extends Employee{
	
	// co 1 boi ban duy nhat
	
	private static Waiter waiter;
	
	// order cua khach
	private Command order;
	
	public Waiter(String name, int age, Level level) {
		super(name, age, level);
	}
	
	public static Waiter getInstance() {
        return waiter;
    }
	
	public void setOrder(Command order) {
        this.order = order;
    }
	
	// goi mon cho khach
	public void executeOrderForClient() {
		order.execute();
	}

	@Override
	protected void writeMessage(String msg) {
		System.err.println("waiter" + msg);
		
	}

}
