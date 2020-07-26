package org.edwith.webbe.calculatorcli;

import org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {ApplicationConfig.class})

public class CalculatorServiceTest {
	@Autowired
	CalculatorService calculatorService;
	
	@Before
	public void init() {
		this.calculatorService = new CalculatorService();
	}
	
	@Test
	public void plus() throws Exception {
		// given
		int value1 = 10;
		int value2 = 5;
		
		// when
		int result = calculatorService.plus(value1, value2);
		
		// then
		Assert.assertEquals(15, result);
	}
	
	@Test
	public void divideExceptionTest() throws Exception {
		// given
		int value1 = 10;
		int value2 = 0;
		
		try {
			calculatorService.divide(value1, value2);
		} catch (ArithmeticException e) {
			
			Assert.assertTrue(true);
			return;
			
		}
		
		Assert.assertTrue(false);
	}
	
		
	
	
}
	

