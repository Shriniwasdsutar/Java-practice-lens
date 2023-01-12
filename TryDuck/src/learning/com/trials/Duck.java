package learning.com.trials;

public class Duck {
	
	static int i =90;
	private String name;
	private int lifeExpectancy;
	private String favFood;
	
	public Duck(String name, int lifeExpectancy, String favFood) {
		super();
		this.name = name;
		this.lifeExpectancy = lifeExpectancy;
		this.favFood = favFood;
		
	}
	
	public void waddle() {
		System.out.println(this.name + "Is waddling");
	}

	public String toString() {
		return this.name + " " +this.favFood + " " + this.lifeExpectancy;
	}
}
