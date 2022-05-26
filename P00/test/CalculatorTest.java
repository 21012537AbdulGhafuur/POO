import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		//fail("Not yet implemented");
		int a = 1234;
		int b = 8765;
			
		Calculator cal = new Calculator();
		int actual = cal.add(a, b);
		
		int expected = 9999;
		assertEquals(expected,actual);
	}
	@Test
	public void testSubtract() {
		int a = 9876;
		int b = 4321;
		
		Calculator cal = new Calculator();
		int actual = cal.subtract(a, b);
		
		int expected = 5555;
		assertEquals(actual, expected);
	}
	@Test
	public void testMultiply() {
		int a = 5678;
		int b = 7891;
		
		Calculator cal = new Calculator();
		int actual = cal.multiply(a,b);
		
		int expected = 44805098;
		assertEquals(actual, expected);
	}
	@Test
	public void testDivide() {
		int a = 6000;
		int b = 2000;
		
		Calculator cal = new Calculator();
		int actual = cal.divide(a, b);
		
		int expected = 3;
		assertEquals(actual, expected);
	}
	@Test
	public void testDivideWithoutDenominator() {
	//fail("Not yet implemented");
	
		int a = 100;
		int b = 0;
		
	try {
		Calculator cal = new Calculator();
		cal.divide(a, b);
		fail("Expected an IllegalArgumentException to be thrown");
	}catch(IllegalArgumentException e) {
		assertEquals("Division by zero is not supported", e.getMessage());
	}catch(Throwable t) {
		assertEquals("Expected an IllegalArgumentException to be thrown", t.getMessage());
	}
	}
	
	@Test
	public void testPower() {
		int a = 3;
		int b = 3;
		
		Calculator cal = new Calculator();
		int actual = (int) cal.power(a, b);
		
		int expected = 27;
		assertEquals(actual, expected);
	}
}