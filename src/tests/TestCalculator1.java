package tests;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import model.Calculator;

/**
 * @author Trevor Parrish - tparrish2
 * CIS175 - Spring 2023
 * Jan 24, 2023
 */

public class TestCalculator1 {
	
	Calculator cal = new Calculator();
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testSquared() {
		assertEquals(4, cal.squared(2), 0.0);
		assertNotEquals(0, cal.squared(4));
		assertTrue(cal.squared(3) == 9);
	}
	
	@Test
	public void testSquareRoot() {
		assertEquals(5, cal.squareRoot(25), 0.0);
		assertNotEquals(9, cal.squareRoot(100));
		assertTrue(cal.squareRoot(49) == 7);
	}
}
