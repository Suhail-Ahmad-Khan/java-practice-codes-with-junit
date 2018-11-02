package com.bridgelabz.functional;

import static org.junit.Assert.assertTrue;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.bridgelabz.utility.Utility;

class CoinFlipTest {
	
	private Utility utility;

	@BeforeEach
	public void setUp() throws Exception {
		utility = new Utility();
	}

	@Test
	void methodShouldReturnAValidOutput() {
		int noOfFlip = 20;
		boolean result = utility.calculatePercentageOfHeadsAndTails(noOfFlip);
		assertTrue(result);
	}
	
	@AfterEach
	void tearDown() throws Exception {
		utility = null;
	}

}
