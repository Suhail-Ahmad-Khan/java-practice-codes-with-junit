package com.bridgelabz.functional;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.bridgelabz.utility.Utility;

class LeapYearTest {

	private Utility utility;
	private Boolean result;
	private Integer year;
	private String output;


	@BeforeEach
	void setUp() throws Exception {
		utility = new Utility();
	}

	@Test
	void checkForYearLengthLessThan1000() {
		year = 999;
		result = utility.checkYearLength(year);
		assertEquals("false", result.toString());
	}

	@Test
	void checkForYearLengthGreaterThan9999() {
		year = 10000;
		result = utility.checkYearLength(year);
		assertEquals("false", result.toString());
	}
	
	@Test
	void checkWhetherYearIsLeapYearOrNotForValidLeapYear() {
		year = 2000;
		output = utility.calculateLeapYear(year);
		assertEquals("The given year is a leap year", output);
	}
	
	@Test
	void checkWhetherYearIsLeapYearOrNotForInvalidLeapYear() {
		year = 1900;
		output = utility.calculateLeapYear(year);
		assertEquals("The given year is not a leap year", output);
	}

	@AfterEach
	void tearDown() throws Exception {
		utility = null;
	}

}
