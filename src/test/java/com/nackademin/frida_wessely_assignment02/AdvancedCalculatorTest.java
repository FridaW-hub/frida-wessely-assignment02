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
		for (int i = 0; i < 10; i++){
			tempRandomValue1 = -1*(random.nextDouble());
			tempResult = Math.abs(tempRandomValue1);
			LOG.info("Testing the Absolut value method with: " + tempRandomValue1);
			assertEquals(ac.absolutValue(tempRandomValue1),tempResult,0);
		}
	}

}
