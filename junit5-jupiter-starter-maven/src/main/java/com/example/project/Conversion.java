package com.example.project;

public class Conversion {

    final double conversion_factor = 2.20462;

    public double kilogramsToPounds(double kilograms) {
	    return kilograms * conversion_factor;
	}

    public boolean isWeightWithinRange(double kilograms) {
        double pounds = kilogramsToPounds(kilograms);
        
        if (pounds < 0) {
            // The weight is below the acceptable range
            return false;
        } else if (pounds > 500) {
            // The weight exceeds the acceptable range
            return false;
        } else {
            // The weight is within the acceptable range
            return true;
        }
    }
    
}
