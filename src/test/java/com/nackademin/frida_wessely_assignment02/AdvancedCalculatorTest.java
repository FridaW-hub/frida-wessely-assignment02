package com.nackademin.frida_wessely_assignment02;

import static org.junit.Assert.*;

import java.util.Random;
import java.util.logging.Logger;

import org.junit.Test;

public class AdvancedCalculatorTest {
	
	AdvancedCalculator ac = new AdvancedCalculator();
	Random random = new Random();
	public static final Logger LOG = Logger.getLogger(AdvancedCalculator.class.getName());

	@Test
	public void testAbsolutValue() {
		double tempRandomValue1 = 0;
		double tempResult = 0;
		// Test med nollvärde.
		LOG.info("Testing the Absolut value method with: " + tempRandomValue1);
		assertEquals(ac.absolutValue(tempRandomValue1), tempResult, 0);
		// Test med negativt värde.
		for (int i = 0; i < 10; i++) {
			tempRandomValue1 = -1 * (random.nextDouble());
			tempResult = Math.abs(tempRandomValue1);
			LOG.info("Testing the Absolut value method with: " + tempRandomValue1);
			assertEquals(ac.absolutValue(tempRandomValue1), tempResult, 0);
		}
		// Test med positivt värde.
		for (int i = 0; i < 10; i++) {
			tempRandomValue1 = random.nextDouble();
			tempResult = Math.abs(tempRandomValue1);
			LOG.info("Testing the Absolut value method with: " + tempRandomValue1);
			assertEquals(ac.absolutValue(tempRandomValue1), tempResult, 0);
		}
	}

	@Test
	public void testSquareRoot() {
		double tempRandomValue1 = 0;
		double tempResult = 0;
		// Test med nollvärde.
		LOG.info("Testing the square root method with: " + tempRandomValue1);
		assertEquals(ac.squareRoot(tempRandomValue1), tempResult, 0);
		// Test med negativt värde.
		for (int i = 0; i < 10; i++) {
			tempRandomValue1 = -1 * (random.nextDouble());
			tempResult = Math.sqrt(tempRandomValue1);
			LOG.info("Testing the square root method with: " + tempRandomValue1);
			assertEquals(ac.squareRoot(tempRandomValue1), tempResult, 0);
		}
		// Test med positivt värde.
		for (int i = 0; i < 10; i++) {
			tempRandomValue1 = random.nextDouble();
			tempResult = Math.sqrt(tempRandomValue1);
			LOG.info("Testing the square root method with: " + tempRandomValue1);
			assertEquals(ac.squareRoot(tempRandomValue1), tempResult, 0);
		}
	}

	@Test
	public void testRound() {
		double tempRandomValue1 = 0;
		double tempResult = 0;
		// Test med nollvärde.
		LOG.info("Testing the round method with: " + tempRandomValue1);
		assertEquals(ac.round(tempRandomValue1), tempResult, 0);
		// Test med negativt värde.
		for (int i = 0; i < 10; i++) {
			tempRandomValue1 = -1 * (random.nextDouble());
			tempResult = Math.round(tempRandomValue1);
			LOG.info("Testing the round method with: " + tempRandomValue1);
			assertEquals(ac.round(tempRandomValue1), tempResult, 0);
		}
		// Test med positivt värde.
		for (int i = 0; i < 10; i++) {
			tempRandomValue1 = random.nextDouble();
			tempResult = Math.round(tempRandomValue1);
			LOG.info("Testing the round method with: " + tempRandomValue1);
			assertEquals(ac.round(tempRandomValue1), tempResult, 0);
		}
	}

	@Test
	public void testSquare() {
		double tempRandomValue1 = 0;
		double tempResult = 0;
		// Test med nollvärde.
		LOG.info("Testing the square method with: " + tempRandomValue1);
		assertEquals(ac.square(tempRandomValue1), tempResult, 0);
		// Test med negativt värde.
		for (int i = 0; i < 10; i++) {
			tempRandomValue1 = -1 * (random.nextDouble());
			tempResult = tempRandomValue1*tempRandomValue1;
			LOG.info("Testing the square method with: " + tempRandomValue1);
			assertEquals(ac.square(tempRandomValue1), tempResult, 0);
		}
		// Test med positivt värde.
		for (int i = 0; i < 10; i++) {
			tempRandomValue1 = random.nextDouble();
			tempResult = tempRandomValue1*tempRandomValue1;
			LOG.info("Testing the square method with: " + tempRandomValue1);
			assertEquals(ac.square(tempRandomValue1), tempResult, 0);
		}
	}
	
	@Test
	public void testraisedToThePowerOf() {
		double tempRandomValue1 = 0;
		double tempRandomValue2 = 0;
		double tempResult = 0;
		// Test med nollvärde.
		LOG.info("Testing the  raised to the power of method with: " + tempRandomValue1 + " raised to the power of "+ tempRandomValue2);
		tempResult = Math.pow(tempRandomValue1,tempRandomValue2);
		assertEquals(ac.raisedToThePowerOf(tempRandomValue1, tempRandomValue2), tempResult, 0);
		// Test med negativt värde.
		for (int i = 0; i < 10; i++) {
			tempRandomValue1 = -1 * (random.nextDouble());
			tempRandomValue2 = -1 * (random.nextDouble());
			tempResult = Math.pow(tempRandomValue1, tempRandomValue2);
			LOG.info("Testing the  raised to the power of method with: " + tempRandomValue1 + " raised to the power of "+ tempRandomValue2);
			assertEquals(ac.raisedToThePowerOf(tempRandomValue1, tempRandomValue2), tempResult, 0);
		}
		// Test med positivt värde.
		for (int i = 0; i < 10; i++) {
			tempRandomValue1 = random.nextDouble();
			tempRandomValue2 = random.nextDouble();
			tempResult = Math.pow(tempRandomValue1, tempRandomValue2);
			LOG.info("Testing the  raised to the power of method with: " + tempRandomValue1 + " raised to the power of "+ tempRandomValue2);
			assertEquals(ac.raisedToThePowerOf(tempRandomValue1, tempRandomValue2), tempResult, 0);
		}
	}
	
}
