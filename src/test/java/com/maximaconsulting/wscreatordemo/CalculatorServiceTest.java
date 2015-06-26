package com.maximaconsulting.wscreatordemo;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

public class CalculatorServiceTest {
	private CalculatorService calculatorService;

	@Before
	public void setup() {
		calculatorService = new CalculatorServiceImpl();
	}

	@Test
	public void testAdd() {
		Assert.assertEquals(5, calculatorService.add(3, 2));
	}

	@Test
	public void testSubstract() {
		Assert.assertEquals(1, calculatorService.substract(3, 2));
	}

	@Test
	public void testMultiply() {
		Assert.assertEquals(6, calculatorService.multiply(3, 2));
	}

	@Test
	public void testDivide() {
		Assert.assertEquals(1, calculatorService.divide(3, 2));
	}

	@Test(expected = ArithmeticException.class)
	public void testDivideByZero() {
		calculatorService.divide(3, 0);
	}
}
