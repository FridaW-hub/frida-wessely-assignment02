package com.nackademin.frida_wessely_assignment02;

public class Main {

	public static void main(String[] args) {
		BasicCalculator bc = new BasicCalculator();
		System.out.println(bc.addition(2, 2));

		AdvancedCalculator ac = new AdvancedCalculator();
		System.out.println(ac.absolutValue(-110.23));
	}

}
