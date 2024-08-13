/*
 * Copyright 2015-2024 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v2.0 which
 * accompanies this distribution and is available at
 *
 * http://www.eclipse.org/legal/epl-v20.html
 */

 package com.example.project;

 // Import necessary classes from the JUnit 5 framework.
 import static org.junit.jupiter.api.Assertions.assertEquals;
 
 import org.junit.jupiter.api.DisplayName;
 import org.junit.jupiter.api.Test;
 import org.junit.jupiter.params.ParameterizedTest;
 import org.junit.jupiter.params.provider.CsvSource;
 
 /**
  * This class contains test cases for the Calculator class.
  * The tests are written using JUnit 5, a popular Java testing framework.
  */
 class CalculatorTests {
 
	 /**
	  * This test method checks if the Calculator's add method correctly adds 1 and 1.
	  * 
	  * @Test indicates that this is a test case.
	  * @DisplayName provides a custom name for this test in the test report.
	  */
	 @Test
	 @DisplayName("1 + 1 = 2")
	 void addsTwoNumbers() {
		 // Create an instance of the Calculator class.
		 Calculator calculator = new Calculator();
 
		 // Check if the add method returns 2 when adding 1 and 1.
		 // The assertEquals method checks if the expected result (2) matches the actual result returned by the add method.
		 // The third argument is an optional message that will be shown if the test fails.
		 assertEquals(2, calculator.add(1, 1), "1 + 1 should equal 2");
	 }
 
	 /**
	  * This is a parameterized test that runs the add method with different sets of inputs.
	  * 
	  * @ParameterizedTest indicates that the same test is run multiple times with different inputs.
	  * @CsvSource provides the inputs and expected results in CSV (Comma-Separated Values) format.
	  * The {0}, {1}, {2} in the name attribute are placeholders for the first, second, and third values in each CSV line.
	  */
	 @ParameterizedTest(name = "{0} + {1} = {2}")
	 @CsvSource({
		 "0,    1,   1",  // Test case 1: 0 + 1 should equal 1
		 "1,    2,   3",  // Test case 2: 1 + 2 should equal 3
		 "49,  51, 100",  // Test case 3: 49 + 51 should equal 100
		 "1,  100, 101"   // Test case 4: 1 + 100 should equal 101
	 })
	 void add(int first, int second, int expectedResult) {
		 // Create an instance of the Calculator class.
		 Calculator calculator = new Calculator();
 
		 // Check if the add method returns the expected result for each pair of inputs.
		 // A lambda function is used here to create a custom failure message.
		 // A lamda function is anonymous and does not have a name
		 assertEquals(expectedResult, calculator.add(first, second),
			 () -> first + " + " + second + " should equal " + expectedResult);
	 }

	 @Test
	 @DisplayName("1 * 1 = 1")
	 void multiplyTwoNumbers() {
		 Calculator calculator = new Calculator();
		 assertEquals(1, calculator.multiply(1, 1), "1 * 1 should equal 1");
	 }

	 @ParameterizedTest(name = "{0} * {1} = {2}")
	 @CsvSource({
		 "0,    1,   0", 
		 "49,  51, 2499",
		 "1,  100, 100" 
	 })
	 void multiply(double first, double second, double expectedResult) {
		 Calculator calculator = new Calculator();
		 assertEquals(expectedResult, calculator.multiply(first, second),
			 () -> first + " * " + second + " should equal " + expectedResult);
	 }

 }
 