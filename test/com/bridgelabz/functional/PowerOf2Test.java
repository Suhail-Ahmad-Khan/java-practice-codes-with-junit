package com.bridgelabz.functional;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.bridgelabz.utility.Utility;

class PowerOf2Test {
	
	private Utility utility;
	private Boolean result;
	private Integer inputInteger;

	@BeforeEach
	void setUp() throws Exception {
		utility = new Utility();
	}

	@Test
	void checkWhetherInputValueIsLessThanZero() {
		inputInteger = -1;
		result = utility.findPowersOf2(inputInteger);
		assertEquals("false", result.toString());
	}
	
	@Test
	void checkWhetherInputValueIsGreaterThanThirtyOne() {
		inputInteger = 32;
		result = utility.findPowersOf2(inputInteger);
		assertEquals("false", result.toString());
	}
	
	@Test
	void checkForPowerOfTwoForValidValues() {
		inputInteger = 10;
		result = utility.findPowersOf2(inputInteger);
		assertEquals("true", result.toString());
	}
	
	@AfterEach
	void tearDown() throws Exception {
		utility = null;
	}

}
