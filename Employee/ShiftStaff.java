package Employee;

import FeedBacks.Level;

public class ShiftStaff extends Employee{
	
	// co 1 nhan vien moi ca
	private static ShiftStaff shiftStaff;

	public ShiftStaff(String name, int age, Level level) {
		super(name, age, level);
		// TODO Auto-generated constructor stub
	}
	
	public static ShiftStaff getInstance() {
        return shiftStaff;
    }

	@Override
	protected void writeMessage(String msg) {
		System.err.println("shiftstaff" + msg);
		
	}

}
