package Test;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Model.calculator;

public class CalculatorTest {
	calculator calc = new calculator();
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testDoubleNum() {
		double doubleNum = calc.dblNum(2);
		assertEquals(4, doubleNum, 0.0);
	}
	
	@Test
	public void testSquareNum() {
		double sqrNum = calc.sqrNum(5);
		assertEquals(25, sqrNum, 0.0);
	}

}
