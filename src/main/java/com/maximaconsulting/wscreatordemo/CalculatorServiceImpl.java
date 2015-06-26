package com.maximaconsulting.wscreatordemo;

import org.springframework.stereotype.Service;

@Service("calculatorService")
public class CalculatorServiceImpl implements CalculatorService {
	@Override
	public int add(int firstNumber, int secondNumber) {
		return firstNumber + secondNumber;
	}

	@Override
	public int substract(int firstNumber, int secondNumber) {
		return firstNumber - secondNumber;
	}

	@Override
	public int multiply(int firstNumber, int secondNumber) {
		return firstNumber * secondNumber;
	}

	@Override
	public int divide(int divident, int divisor) {
		return divident / divisor;
	}

	@Override
	public void secretMethod() {
		System.out.println("Hidden from Web Service");
	}
}
