package com.bridgelabz.functional;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.bridgelabz.utility.Utility;

class StockAccountTest {
	
	private Utility utility;
	private Integer noOfStocks;
	private Boolean result;

	@BeforeEach
	void setUp() throws Exception {
		utility = new Utility();
	}

	@Test
	void checkForValidValuesOfInput() {
		noOfStocks = 3;
		result = utility.printStockReport(noOfStocks);
		assertNotNull(result);
		assertEquals("true", result.toString());
	}
	
	@Test
	void checkForInvalidValuesOfInput() {
		noOfStocks = -3;
		result = utility.printStockReport(noOfStocks);
		assertNotNull(result);
		assertEquals("false", result.toString());
	}
		
	@AfterEach
	void tearDown() throws Exception {
		utility = null;
		noOfStocks = null;
		result = null;
	}

}
