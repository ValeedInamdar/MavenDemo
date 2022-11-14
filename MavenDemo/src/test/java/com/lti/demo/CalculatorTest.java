package com.lti.demo;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;

//import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {
	Calculator c = new Calculator();

	@Disabled
	@Test
	public void testsayHello() {
		Assertions.assertEquals("hello", c.sayHello());

	}

	@Disabled
	@Test
	public void testAdd() {
		Assertions.assertEquals(100, c.add(60, 40), "Check Code Again");
	}

	@Disabled
	@Test
	void testAssertFalse() {
		Assertions.assertTrue("Valeed".length() == 6);
		Assertions.assertFalse("Valeed".length() == 10);
	}

	@Disabled
	@Test
	void testAssertNull() {
		String str1 = null;
		String str2 = "abcd";
		Assertions.assertNull(str1);
		Assertions.assertNotNull(str2);
	}

	@Test
	public void testArrayList() {
		ArrayList<Integer> myList = new ArrayList<Integer>();
		Assertions.assertEquals(0, myList.size());
	}
}