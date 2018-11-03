package com.bridgelabz.functional;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.bridgelabz.utility.Utility;

class PrimeFactorsTest {

	private Utility utility;
	private int inputNumber;
	private Boolean output;

	@BeforeEach
	void setUp() throws Exception {
		utility = new Utility();
	}

	@Test
	void checkForInvalidInputNumbersToCalculatePrimeFactors() {
		inputNumber = -1;
		output = utility.calculatePrimeFactors(inputNumber);
		assertNotNull(output);
		assertEquals("false", output.toString());
	}
	
	@Test
	void checkForValidInputNumbersToCalculatePrimeFactors() {
		inputNumber = 9;
		output = utility.calculatePrimeFactors(inputNumber);
		assertNotNull(output);
		assertEquals("true", output.toString());
	}

	@AfterEach
	void tearDown() throws Exception {
		utility = null;
	}

}
