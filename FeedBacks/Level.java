package FeedBacks;

public class Level {

	private int level;
	private String messageProblem;
	
	public Level(int level, String messageProblem) {
		super();
		this.level = level;
		this.messageProblem = messageProblem;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public String getMessageProblem() {
		return messageProblem;
	}

	public void setMessageProblem(String messageProblem) {
		this.messageProblem = messageProblem;
	}
	
	
}
