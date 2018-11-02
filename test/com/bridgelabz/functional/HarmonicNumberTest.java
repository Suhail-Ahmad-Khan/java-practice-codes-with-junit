package com.bridgelabz.functional;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.bridgelabz.utility.Utility;

class HarmonicNumberTest {

	private Utility utility;
	private double output;
	private int inputNumber;

	@BeforeEach
	void setUp() throws Exception {
		utility = new Utility();
	}

	@Test
	void checkForInvalidInputValues() {
		inputNumber = -1;
		output = utility.calculateHarmonicNumber(inputNumber);
		assertNotNull(output);
		assertEquals(-1.0, output);
	}

	@Test
	void checkForValidInputValues() {
		inputNumber = 5;
		output = utility.calculateHarmonicNumber(inputNumber);
		assertNotNull(output);
		assertEquals(2.283333333333333, output);
	}

	@AfterEach
	void tearDown() throws Exception {
		utility = null;
	}

}
