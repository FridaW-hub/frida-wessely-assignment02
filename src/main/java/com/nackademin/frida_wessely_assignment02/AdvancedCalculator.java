package com.nackademin.frida_wessely_assignment02;
import com.nackademin.frida_wessely_assignment02.interfaces.AdvancedOperations;

public class AdvancedCalculator extends BasicCalculator implements AdvancedOperations {
	
	public double square(double number) {
		return number*number;
	}
	
	public double raisedToThePowerOf(double base, double exponent) {
		return Math.pow(base, exponent);
	}

	public double absolutValue(double value) {
		return Math.abs(value);
	}


}

