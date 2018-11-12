package com.bridgelabz.functional;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.bridgelabz.utility.Utility;

class SumOfThreeIntegersTest {
	
	private Utility utility;

	@BeforeEach
	void setUp() throws Exception {
		utility = new Utility();
	}

	@Test
	void checkForArrayGivingNonZeroOutput() {
		 int [] inputArray = {1, -1, 2, -2, 0};
		 int count = utility.findTriplets(inputArray);
		 assertNotNull(count);
		 assertEquals(2, count);
	}
	
	@Test
	void checkForArrayGivingZeroOutput() {
		 int [] inputArray = {1, 1, 2, 2, 0};
		 int count = utility.findTriplets(inputArray);
		 assertNotNull(count);
		 assertEquals(0, count);
	}
	
	@AfterEach
	void tearDown() throws Exception {
		utility = null;
	}

}
