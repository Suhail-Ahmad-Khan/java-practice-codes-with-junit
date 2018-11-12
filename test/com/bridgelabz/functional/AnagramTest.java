package com.bridgelabz.functional;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.bridgelabz.utility.Utility;

class AnagramTest {
	
	private Utility utility;
	private String inputString1;
	private String inputString2;
	private Boolean output;
	@BeforeEach
	void setUp() throws Exception {
		utility = new Utility();
	}

	@Test
	void checkForValidAnagramValues() {
		inputString1 = "Mother In Law";
		inputString2 = "Hitler Woman";
		
		output = utility.checkForAnagrams(inputString1, inputString2);
		assertNotNull(output);
		assertEquals("true", output.toString());
	}
	
	@Test
	void checkForInvalidAnagramValues() {
		inputString1 = "abcd";
		inputString2 = "wxyz";
		
		output = utility.checkForAnagrams(inputString1, inputString2);
		assertNotNull(output);
		assertEquals("false", output.toString());
	}
	
	@AfterEach
	void tearDown() throws Exception {
		utility = null;
		inputString1 = null;
		inputString2 = null;
		output = null;
	}

}
