package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Calculator;

/**
 * @author Trevor Parrish - tparrish2
 * CIS175 - Spring 2023
 * Jan 24, 2023
 */
public class TestCalculator2 {
	
	Calculator cal = new Calculator();
	
	@Before
	public void setUp() throws Exception {
	}
	
	@Test
	public void testSquared() {
		assertEquals(64, cal.squared(8), 0.0);
	}
	
	@Test
	public void testSquareRoot() {
		assertEquals(12, cal.squareRoot(144), 0.0);
	}
}
