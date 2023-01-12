package learning.com.trials;


public class Pond {
	
	
	
	public static void main(String[] args) {
		Duck d1 = new Duck("Piyush", 90/3, "Fishes");
		Duck d2 = new Duck("Kumar", 53/2, "Worms");
		System.out.println(Duck.i);
		d1.waddle();
		d2.waddle();
		System.out.println(d2);
		System.out.println(d1);

	}

}
