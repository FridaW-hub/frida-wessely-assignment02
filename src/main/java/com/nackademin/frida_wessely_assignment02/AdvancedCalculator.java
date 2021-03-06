package com.nackademin.frida_wessely_assignment02;

public class AdvancedCalculator extends BasicCalculator implements AdvancedOperations {
	
	@Override
	public double square(double value) {
		return value*value;
	}
	
	@Override
	public double raisedToThePowerOf(double base, double exponent) {
	double result = Math.pow(base, exponent);
			return result;
	}

	@Override
	public double absolutValue(double value) {
		return Math.abs(value);
	}

	@Override
	public double squareRoot(double value) {
		return Math.sqrt(value);
	}

	@Override
	public double round(double value) {
		return Math.round(value);
	}



}

