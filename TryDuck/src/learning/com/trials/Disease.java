package learning.com.trials;

public class Disease {
	private String name;
	private boolean cureable;
	
	public Disease(String name, boolean cureable) {
		super();
		this.name = name;
		this.cureable = cureable;
	}
	
	public boolean isCureable() {
		return cureable;
	}
	
	public String getName() {
		return name;
	}
	
	
}
