package learning.com.trials;

import java.util.ArrayList;
import java.util.List;

public class DiseaseSorter {
	public static void main(String[] args) {
		Disease d1 = new Disease("Malaria", true);
		Disease d2 = new Disease("Polio", false);
		Disease d3 = new Disease("Dengue", true);
		Disease d4 = new Disease("Foolishness", false);
		
		List<Disease> diseases = new ArrayList<Disease>();
		diseases.add(d1);
		diseases.add(d2);
		diseases.add(d3);
		diseases.add(d4);
		
		
		for (Disease disease : diseases) {
			if (!disease.isCureable()) {
				System.out.println(disease.getName());
			}
			
		}
	}
}
