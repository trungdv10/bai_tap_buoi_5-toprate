package Employee;

import FeedBacks.Level;

public abstract class Employee {

	// thong tin nhan vien co trong cua hang
	private String name;
	private Integer age;
	
	protected Level level;
	
	public Employee(String name, int age, Level level) {
		this.name = name;
		this.age = age;
		this.level = level;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}

	public Level getLevel() {
		return level;
	}

	public void setLevel(Level level) {
		this.level = level;
	}
	
	// xu ly yeu cau cua khach
	protected abstract void writeMessage(String msg);
}
