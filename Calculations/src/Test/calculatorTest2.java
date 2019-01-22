package Test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Model.calculator;

public class calculatorTest2 {
	calculator calc = new calculator();
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testTriNumber() {
		double triNum = calc.triNum(2);
		assertEquals(6, triNum, 0.0);
	}
	@Test
	public void testIsEven1() {
		boolean isEven = calc.isEven(2);
		assertTrue(isEven);
	}
	@Test
	public void testIsEven2() {
		boolean isEven = calc.isEven(3);
		assertFalse(isEven);
	}
	
	@Test
	public void testMsg() {
		boolean isEven = calc.isEven(3);
		assertNull(calc.message(isEven));
	}

}
