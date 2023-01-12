package learning.com.trials;

import static org.junit.Assert.*;

import org.junit.Test;

public class PlayingWithJunit {
	@Test
	public void testName() throws Exception {
		assertEquals(4, Calculator.calculator(2,2));
	}

}
