package com.nackademin.frida_wessely_assignment02;

import static org.junit.Assert.*;

import java.util.Random;
import java.util.logging.Logger;

import org.junit.Test;

public class BasicCalculatorTest {
	BasicCalculator bc = new BasicCalculator();
	Random random = new Random();
	public static final Logger LOG = Logger.getLogger(BasicCalculator.class.getName());

	@Test
	public void testAddition() {
		double tempRandomValue1 = 0;
		double tempRandomValue2 = 0;
		double tempResult = 0;
		for (int i = 0; i < 10; i++){
			tempRandomValue1 = random.nextDouble();
			tempRandomValue2 = random.nextDouble();
			tempResult = tempRandomValue1 + tempRandomValue2;
			LOG.info("Testing the addition method with: " + tempRandomValue1 + " + " + tempRandomValue2);
			assertEquals(bc.addition(tempRandomValue1, tempRandomValue2),tempResult,0);
		}
	}

	@Test
	public void testSubtraction() {
		double tempRandomValue1 = 0;
		double tempRandomValue2 = 0;
		double tempResult = 0;
		for (int i = 0; i < 10; i++) {
			tempRandomValue1 = random.nextDouble();
			tempRandomValue2 = random.nextDouble();
			tempResult = tempRandomValue1 - tempRandomValue2;
			LOG.info("Testing the subtraction method with: " + tempRandomValue1 + " - " + tempRandomValue2);
			assertEquals(bc.subtraction(tempRandomValue1, tempRandomValue2), tempResult, 0);
		}
	}
	
	@Test
	public void testDivision() {
		double tempRandomValue1 = 0;
		double tempRandomValue2 = 0;
		double tempResult = 0;
		for (int i = 0; i < 10; i++) {
			tempRandomValue1 = random.nextDouble();
			tempRandomValue2 = random.nextDouble();
			tempResult = tempRandomValue1/tempRandomValue2;
			LOG.info("Testing the division method with: " + tempRandomValue1 + " / " + tempRandomValue2);
			assertEquals(bc.division(tempRandomValue1, tempRandomValue2), tempResult, 0);
		}
	}
	
	@Test
	public void testDivisionZero() {
		double tempRandomValue1 = 0;
		double Zero = 0;
		double tempResult = -0.12345679;
		for (int i = 0; i < 10; i++) {
			tempRandomValue1 = random.nextDouble();
			LOG.info("Testing the division method for zero with: " + tempRandomValue1 + " / " + Zero);
			assertEquals(bc.division(tempRandomValue1, Zero), tempResult, 0);
		}
	}
	
	@Test
	public void testMultiplication() {
		double tempRandomValue1 = 0;
		double tempRandomValue2 = 0;
		double tempResult = 0;
		for (int i = 0; i < 10; i++) {
			tempRandomValue1 = random.nextDouble();
			tempRandomValue2 = random.nextDouble();
			tempResult = tempRandomValue1*tempRandomValue2;
			LOG.info("Testing the multiplication method with: " + tempRandomValue1 + " * " + tempRandomValue2);
			assertEquals(bc.multiplication(tempRandomValue1, tempRandomValue2), tempResult, 0);
		}
	}
	
}