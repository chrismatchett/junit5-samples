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
 import static org.junit.jupiter.api.Assertions.assertTrue;
 
 import org.junit.jupiter.api.DisplayName;
 import org.junit.jupiter.api.Test;

 class ConversionTests {
 
	 @Test
	 @DisplayName("1kg = 2.20462lbs")
	 void testKilogramsToPounds() {

		 Conversion conversion = new Conversion();
 
		 assertEquals(2.20462, conversion.kilogramsToPounds(1), "1kg should should equal 2.20462lbs");
	 }

	 @Test
	 @DisplayName("200kg in acceptable weight range")
	 public void testIsWeightWithinRange() {
        // Arrange
        Conversion conversion = new Conversion();
        double kilograms = 200.0;
        boolean isWithinRange = conversion.isWeightWithinRange(kilograms);
        
        // Assert
        assertTrue(isWithinRange, "Converted weight should be within range when input weight is in the middle of the range.");
    }
 


 }
 