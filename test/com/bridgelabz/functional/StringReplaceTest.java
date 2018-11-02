package com.bridgelabz.functional;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import com.bridgelabz.utility.Utility;

public class StringReplaceTest {

	private Utility utility;

	@Before
	public void setup() {
		utility = new Utility();
	}

	@Test
	public void StringShouldReturnAValidOutput() {

		String template = "Hello <<UserName>>, How are you?";
		String testString = utility.replaceMethod(template, "<<UserName>>", "Suhail");

		assertNotNull(testString);
		assertEquals("Hello Suhail, How are you?", testString);

	}

	@After
	public void teardown() {
		utility = null;
	}

}
