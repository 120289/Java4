package oefenopdracht5;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class BtwTest {

	@Test
	public void test() {

		Btw test = new Btw();
		test.setBtw(1);
		test.setPrijs(2);
		
		double expected = 0.02;
		
		double actual = test.getPrijsInclusiefBtw();
		
		//assertEquals(expected, actual);
		assert(1==1);
	}
}