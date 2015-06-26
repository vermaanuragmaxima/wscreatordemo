package com.maximaconsulting.wscreatordemo;

import javax.jws.WebParam;
import javax.jws.WebService;

import com.maximaconsulting.webservices.annotations.HiddenMethod;

@WebService
/*
 * @XmlSeeAlso({ //if any Pojos have been used as param or return. Pojo1.class
 * })
 */
public interface CalculatorService {
	int add(@WebParam(name = "firstNumber") int firstNumber, @WebParam(name = "secondNumber") int secondNumber);

	int substract(@WebParam(name = "firstNumber") int firstNumber, @WebParam(name = "secondNumber") int secondNumber);

	int multiply(@WebParam(name = "firstNumber") int firstNumber, @WebParam(name = "secondNumber") int secondNumber);

	int divide(@WebParam(name = "dividend") int dividend, @WebParam(name = "divisor") int divisor);

	@HiddenMethod
	void secretMethod();
}
