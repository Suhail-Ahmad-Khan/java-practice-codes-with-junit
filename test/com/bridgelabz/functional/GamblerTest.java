package com.bridgelabz.functional;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.bridgelabz.utility.Utility;

class GamblerTest {

	private Utility utility;
	private Boolean output;
	
	@BeforeEach
	void setUp() throws Exception {
		utility = new Utility();
	}

	@Test
	void calculateGamblingWinPercentageForInvalidValues() {
		int stake = -1, goals = -10, trials = -25;
		output = utility.calculateGamblingWinPercentage(stake, goals, trials);
		assertNotNull(output);
		assertEquals("false", output.toString());
	}
	
	@Test
	void calculateGamblingWinPercentageForValidValues() {
		int stake = 10, goals = 20, trials = 20;
		output = utility.calculateGamblingWinPercentage(stake, goals, trials);
		assertNotNull(output);
		assertEquals("true", output.toString());
	}
	
	@AfterEach
	void tearDown() throws Exception {
		utility = null;
	}

}
