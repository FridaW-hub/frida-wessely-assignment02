package com.nackademin.frida_wessely_assignment02;

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

	@Override
	public double squareRoot(double firstNumber, double secondNumber) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double absolutValue(double firstNumber, double secondNumber) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double modul(double firstNumber, double secondNumber) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double log(double firstNumber, double secondNumber) {
		// TODO Auto-generated method stub
		return 0;
	}


}

